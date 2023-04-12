package org.jeecg.modules.xtw.service.impl;

import org.jeecg.modules.xtw.entity.XtwTestDistribtion;
import org.jeecg.modules.xtw.mapper.XtwTestDistribtionMapper;
import org.jeecg.modules.xtw.model.DistributionStatisticsModel;
import org.jeecg.modules.xtw.service.IXtwTestDistribtionService;
import org.jeecg.modules.xtw.util.MathUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.math.BigDecimal;
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

    @Override
    public List distributionStatistics(String waferLot, String icName, String testItem, String site, String dateFrom, String dateTo) {

        // 根据条件从数据库查询出相应的分布数据
        List<DistributionStatisticsModel> datas = testDistribtionMapper.distributionStatistics( waferLot, icName, testItem, site, dateFrom, dateTo);

        // 在数据集中插入标准的参照数据
        // find uplimt data and downlimt data by testItem
        // TODO
        BigDecimal uplimit = new BigDecimal(0); // todo
        BigDecimal downlimit = new BigDecimal(0); // todo
        BigDecimal mean = MathUtils.mean(uplimit, downlimit);

        // uplimit data insert
        DistributionStatisticsModel uplimitData = new DistributionStatisticsModel();
        uplimitData.setWaferLot(waferLot);
        uplimitData.setIcName(icName);
        uplimitData.setTestItem(testItem);
        uplimitData.setName(uplimit);
        uplimitData.setValue(100);
        datas.add(uplimitData);

        // downlimit data insert
        DistributionStatisticsModel downlimitData = new DistributionStatisticsModel();
        downlimitData.setWaferLot(waferLot);
        downlimitData.setIcName(icName);
        downlimitData.setTestItem(testItem);
        downlimitData.setName(downlimit);
        downlimitData.setValue(100);
        datas.add(downlimitData);

        // mean  data insert
        DistributionStatisticsModel meanData = new DistributionStatisticsModel();
        meanData.setWaferLot(waferLot);
        meanData.setIcName(icName);
        meanData.setTestItem(testItem);
        meanData.setName(mean);
        meanData.setValue(100);
        datas.add(meanData);


        return datas;
    }
}
