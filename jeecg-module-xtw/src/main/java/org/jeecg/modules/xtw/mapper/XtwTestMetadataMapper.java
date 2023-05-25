package org.jeecg.modules.xtw.mapper;

import io.lettuce.core.dynamic.annotation.Param;
import org.jeecg.modules.xtw.entity.XtwTestMetadata;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * @Description: xtw_test_metadata
 * @Author: jeecg-boot
 * @Date:   2023-04-12
 * @Version: V1.0
 */
public interface XtwTestMetadataMapper extends BaseMapper<XtwTestMetadata> {

    List<XtwTestMetadata> findUplimitAndDownlimitByTestItem(@Param("waferLot")String waferLot, @Param("icName")String icName, @Param("testItem")String testItem);
}
