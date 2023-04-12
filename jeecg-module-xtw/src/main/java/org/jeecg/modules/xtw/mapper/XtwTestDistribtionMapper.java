package org.jeecg.modules.xtw.mapper;

import io.lettuce.core.dynamic.annotation.Param;
import org.jeecg.modules.xtw.entity.XtwTestDistribtion;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.jeecg.modules.xtw.model.DistributionStatisticsModel;

import java.util.List;

/**
 * @Description: xtw_test_distribtion
 * @Author: jeecg-boot
 * @Date:   2023-04-09
 * @Version: V1.0
 */
public interface XtwTestDistribtionMapper extends BaseMapper<XtwTestDistribtion> {

    List<DistributionStatisticsModel> distributionStatistics(@Param("waferLot") String waferLot,
                                                             @Param("icName") String icName,
                                                             @Param("testItem") String testItem,
                                                             @Param("site") String site,
                                                             @Param("dateFrom") String dateFrom,
                                                             @Param("dateTo") String dateTo);

}
