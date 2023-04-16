package org.jeecg.modules.xtw.service.impl;

import org.jeecg.modules.xtw.entity.XtwTestDistribtion;
import org.jeecg.modules.xtw.entity.XtwTestMetadata;
import org.jeecg.modules.xtw.mapper.XtwTestDistribtionMapper;
import org.jeecg.modules.xtw.mapper.XtwTestMetadataMapper;
import org.jeecg.modules.xtw.model.DistributionStatisticsModel;
import org.jeecg.modules.xtw.service.IXtwTestDistribtionService;
import org.jeecg.modules.xtw.util.MathUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.math.BigDecimal;
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

    @Override
    public List distributionStatistics(String waferLot, String icName, String testItem, String site, String dateFrom, String dateTo) {

        // 根据条件从数据库查询出相应的分布数据
        List<DistributionStatisticsModel> datas = testDistribtionMapper.distributionStatistics( waferLot, icName, testItem, site, dateFrom, dateTo);

        // 去除datas集合中value为0的数据
//        datas.removeIf(data -> data.getValue() == 0);

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
        List<XtwTestMetadata> metadataList = testMetadataMapper.findUplimitAndDownlimitByTestItem(waferLot,icName,testItem);
        if (metadataList == null || metadataList.size() == 0) {
            return datas;
        }
        XtwTestMetadata metadata = metadataList.get(0);

        BigDecimal uplimit = new BigDecimal(metadata.getUplimit());
        BigDecimal downlimit = new BigDecimal(metadata.getDownlimit());
        BigDecimal mean = MathUtils.mean(uplimit, downlimit);

        // uplimit data insert
        DistributionStatisticsModel uplimitData = new DistributionStatisticsModel();
        uplimitData.setWaferLot(waferLot);
        uplimitData.setIcName(icName);
        uplimitData.setTestItem(testItem);
        uplimitData.setName(uplimit);
        uplimitData.setValue(maxValue);
        datas.add(uplimitData);

        // downlimit data insert
        DistributionStatisticsModel downlimitData = new DistributionStatisticsModel();
        downlimitData.setWaferLot(waferLot);
        downlimitData.setIcName(icName);
        downlimitData.setTestItem(testItem);
        downlimitData.setName(downlimit);
        downlimitData.setValue(maxValue);
        datas.add(downlimitData);

        // mean  data insert
        DistributionStatisticsModel meanData = new DistributionStatisticsModel();
        meanData.setWaferLot(waferLot);
        meanData.setIcName(icName);
        meanData.setTestItem(testItem);
        meanData.setName(mean);
        meanData.setValue(maxValue);
        datas.add(meanData);

        // Sort modelList by Name property in ascending order
//        Collections.sort(datas, Comparator.comparing(DistributionStatisticsModel::getName));
        datas.sort(Comparator.comparing(DistributionStatisticsModel::getName));
        return datas;
    }
}
