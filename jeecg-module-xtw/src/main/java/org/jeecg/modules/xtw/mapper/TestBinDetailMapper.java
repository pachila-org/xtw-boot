package org.jeecg.modules.xtw.mapper;

import io.lettuce.core.dynamic.annotation.Param;
import org.jeecg.modules.xtw.entity.TestBinDetail;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.jeecg.modules.xtw.model.SubLotBinModel;

import java.util.List;

/**
 * @Description: xtw_test_bin_detail
 * @Author: jeecg-boot
 * @Date:   2023-04-07
 * @Version: V1.0
 */
public interface TestBinDetailMapper extends BaseMapper<TestBinDetail> {

    List<SubLotBinModel> querySYLList(@Param("waferLot") String waferLot, @Param("icName") String icName,
                                      @Param("from") String from, @Param("to") String to);

    List<SubLotBinModel> querySYLListNew(@Param("icName") String icName, @Param("from") String from, @Param("to") String to);
}
