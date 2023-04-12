package org.jeecg.modules.xtw.service;

import org.jeecg.modules.xtw.entity.XtwTestDistribtion;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * @Description: xtw_test_distribtion
 * @Author: jeecg-boot
 * @Date:   2023-04-09
 * @Version: V1.0
 */
public interface IXtwTestDistribtionService extends IService<XtwTestDistribtion> {

//    List detailDistribution(String waferLot, String icName, String subLog, String testItem);

    List distributionStatistics(String waferLot, String icName, String testItem, String site, String dateFrom, String dateTo);

}
