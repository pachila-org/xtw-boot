package org.jeecg.modules.xtw.service.impl;

import org.jeecg.modules.xtw.entity.XtwSystemConfig;
import org.jeecg.modules.xtw.entity.XtwTestDistribtion;
import org.jeecg.modules.xtw.entity.XtwTestMetadata;
import org.jeecg.modules.xtw.mapper.XtwSystemConfigMapper;
import org.jeecg.modules.xtw.mapper.XtwTestDistribtionMapper;
import org.jeecg.modules.xtw.mapper.XtwTestMetadataMapper;
import org.jeecg.modules.xtw.model.DistributionDetailModel;
import org.jeecg.modules.xtw.model.DistributionStatisticsModel;
import org.jeecg.modules.xtw.service.IXtwTestDistribtionService;
import org.jeecg.modules.xtw.util.MathUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @Description: xtw_test_distribtion
 * @Author: jeecg-boot
 * @Date:   2023-04-09
 * @Version: V1.0
 */
@Service
public class XtwTestDistribtionServiceImpl extends ServiceImpl<XtwTestDistribtionMapper, XtwTestDistribtion> implements IXtwTestDistribtionService {
    @Autowired
    private XtwTestDistribtionMapper testDistribtionMapper;
    @Autowired
    private XtwTestMetadataMapper testMetadataMapper;
    @Autowired
    private XtwSystemConfigMapper systemConfigMapper;

    @Override
    public List distributionStatistics(String waferLot, String icName, String testItem, String testId, String site, String dateFrom, String dateTo, int groupSize) {
        // 输出参数
        System.out.println("distributionStatistics#waferLot: " + waferLot);
        System.out.println("distributionStatistics#icName: " + icName);
        System.out.println("distributionStatistics#testItem: " + testItem);
        System.out.println("distributionStatistics#testId: " + testId);
        System.out.println("distributionStatistics#site: " + site);
        System.out.println("distributionStatistics#dateFrom: " + dateFrom);
        System.out.println("distributionStatistics#dateTo: " + dateTo);
        System.out.println("distributionStatistics#groupSize: " + groupSize);

        List<DistributionStatisticsModel> result = new ArrayList<>();

        // site 是一个由,分割的字符串，则将其转换成一个数组 sites
        String[] sites = new String[]{};
        if (site != null && !"".equals(site)) {
            sites = site.split(",");
        }
        System.out.println("distributionDetail#sites: " + sites.length);

        // 根据条件从数据库查询出相应的分布数据
        List<DistributionStatisticsModel> datas = testDistribtionMapper.distributionStatistics(waferLot, icName, testItem, testId, sites, dateFrom, dateTo);

        // 去除datas集合中value为0的数据
        datas.removeIf(data -> data.getValue() == 0);

        // 获取datas集合value中最大的值
        Integer maxValue = 0;
        for (DistributionStatisticsModel data : datas) {
            if (data.getValue() > maxValue) {
                maxValue = data.getValue();
            }
        }
        // 将maxValue 转化为一个最近的整数，如 99 转换成100， 101 转换成 200， 1001 转换成 1100
        maxValue = MathUtils.getNearestInteger(maxValue);

        // 在数据集中插入标准的参照数据
        List<XtwTestMetadata> metadataList = testMetadataMapper.findUplimitAndDownlimitByTestItem(waferLot, icName, testItem);
        if (metadataList == null || metadataList.size() == 0) {
            return result;
        }
        XtwTestMetadata metadata = metadataList.get(0);

        XtwSystemConfig alertConfig = systemConfigMapper.findConfig("ALERT_DATA_RATE");
        XtwSystemConfig exceptConfig = systemConfigMapper.findConfig("EXCEPTION_DATA_RATE");
        BigDecimal alertDataRate = new BigDecimal(alertConfig.getConfigValue());
        BigDecimal exceptDataRate = new BigDecimal(alertConfig.getConfigValue());

        BigDecimal uplimit = new BigDecimal(metadata.getUplimit());
        BigDecimal downlimit = new BigDecimal(metadata.getDownlimit());
        BigDecimal interval = uplimit.subtract(downlimit);
        BigDecimal alertInterval = interval.multiply(alertDataRate.divide(new BigDecimal(100)));
        BigDecimal exceptInterval = interval.multiply(exceptDataRate.divide(new BigDecimal(100)));
        BigDecimal mean = MathUtils.mean(uplimit, downlimit);
        BigDecimal uspec = mean.add(alertInterval);
        BigDecimal lspec = mean.subtract(alertInterval);
        BigDecimal newUplimt = mean.add(alertInterval);
        BigDecimal newDownlimit = mean.subtract(alertInterval);

        // 输出 newUplimt 和 newDownlimit
        System.out.println("distributionStatistics#newUplimt: " + newUplimt);
        System.out.println("distributionStatistics#newDownlimit: " + newDownlimit);

        // 准备插入 数据
        BigDecimal step = newUplimt.subtract(newDownlimit).divide(new BigDecimal(groupSize));

        for (int i = 0; i < groupSize; i++) {
            DistributionStatisticsModel data = new DistributionStatisticsModel();
            data.setWaferLot(waferLot);
            data.setIcName(icName);
            data.setTestItem(testItem);
            data.setSectionMin(newDownlimit.add(step.multiply(new BigDecimal(i))));
            data.setSectionMax(newDownlimit.add(step.multiply(new BigDecimal(i+1))));
            data.setValue(0);
//            System.out.println("item data: " + data.getSectionMin() + " - " + data.getSectionMax());
            result.add(data);
        }

        // 遍历datas集合，比较datas中每个item，如果它的sectionMin 和 sectionMax 和 result中每一个sectionMin 和 setionMax 相等或者范围之内 ，则将datas中的value值添加到给result中的value
        for (DistributionStatisticsModel data : datas) {
//            System.out.println("matched for data: " + data.getSectionMin() + " - " + data.getSectionMax());
            boolean matched = false;
            for (DistributionStatisticsModel item : result) {
                //System.out.println("current item: " + item.getSectionMin() + " - " + item.getSectionMax());
                if (data.getSectionMin().compareTo(item.getSectionMin()) >= 0 && data.getSectionMin().compareTo(item.getSectionMax()) <= 0) {
                    item.setValue(item.getValue() + data.getValue());
                    matched = true;
                    continue;
                }
            }
            if (!matched) {
                System.out.println("data: " + data.getSectionMin() + " - " + data.getSectionMax() + " not matched");
            } else {
                System.out.println("data: " + data.getSectionMin() + " - " + data.getSectionMax() + " matched");
            }
        }

        // uplimit data insert
        DistributionStatisticsModel uplimitData = new DistributionStatisticsModel();
        uplimitData.setWaferLot(waferLot);
        uplimitData.setIcName(icName);
        uplimitData.setTestItem(testItem);
        uplimitData.setSectionMin(uplimit);
        uplimitData.setValue(maxValue);
        result.add(uplimitData);

        // downlimit data insert
        DistributionStatisticsModel downlimitData = new DistributionStatisticsModel();
        downlimitData.setWaferLot(waferLot);
        downlimitData.setIcName(icName);
        downlimitData.setTestItem(testItem);
        downlimitData.setSectionMin(downlimit);
        downlimitData.setValue(maxValue);
        result.add(downlimitData);

        // mean  data insert
        DistributionStatisticsModel meanData = new DistributionStatisticsModel();
        meanData.setWaferLot(waferLot);
        meanData.setIcName(icName);
        meanData.setTestItem(testItem);
        meanData.setSectionMin(mean);
        meanData.setValue(maxValue);
        result.add(meanData);

        // uspec  data insert
        DistributionStatisticsModel uspecData = new DistributionStatisticsModel();
        uspecData.setWaferLot(waferLot);
        uspecData.setIcName(icName);
        uspecData.setTestItem(testItem);
        uspecData.setSectionMin(uspec);
        uspecData.setValue(maxValue);
        result.add(uspecData);

        // lspec  data insert
        DistributionStatisticsModel lspecData = new DistributionStatisticsModel();
        lspecData.setWaferLot(waferLot);
        lspecData.setIcName(icName);
        lspecData.setTestItem(testItem);
        lspecData.setSectionMin(lspec);
        lspecData.setValue(maxValue);
        result.add(lspecData);

        result.sort(Comparator.comparing(DistributionStatisticsModel::getName));
        return result;
    }


    @Override
    public List distributionDetail(String waferLot, String icName, String testItem, String testId, String site, String dateFrom, String dateTo) {
        // 输出参数
        System.out.println("distributionDetail#waferLot: " + waferLot);
        System.out.println("distributionDetail#icName: " + icName);
        System.out.println("distributionDetail#testItem: " + testItem);
        System.out.println("distributionDetail#testId: " + testId);
        System.out.println("distributionDetail#site: " + site);
        System.out.println("distributionDetail#dateFrom: " + dateFrom);
        System.out.println("distributionDetail#dateTo: " + dateTo);

        // site 是一个由,分割的字符串，则将其转换成一个数组 sites
        String[] sites = new String[]{};
        if (site != null && !"".equals(site)) {
            sites = site.split(",");
        }
        System.out.println("distributionDetail#sites: " + sites.length);

        // 根据条件从数据库查询出相应的分布数据
        List<DistributionDetailModel> datas = testDistribtionMapper.distributionDetail(waferLot, icName, testItem, testId, sites, dateFrom, dateTo);

        return datas;
    }
}
