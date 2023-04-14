package org.jeecg.modules.xtw.mapper;

import io.lettuce.core.dynamic.annotation.Param;
import org.jeecg.modules.xtw.entity.XtwTestRecord;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.jeecg.modules.xtw.model.JimuDictModel;

import java.util.List;

/**
 * @Description: xtw_test_record
 * @Author: jeecg-boot
 * @Date:   2023-04-09
 * @Version: V1.0
 */
public interface XtwTestRecordMapper extends BaseMapper<XtwTestRecord> {

    List<JimuDictModel> getWaferLotList(@Param("from") String from, @Param("to") String to);

    List<JimuDictModel>  getICNameList(@Param("waferLot") String waferLot, @Param("from") String from, @Param("to") String to);

}
