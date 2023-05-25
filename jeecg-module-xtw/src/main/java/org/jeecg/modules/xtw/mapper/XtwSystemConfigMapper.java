package org.jeecg.modules.xtw.mapper;

import io.lettuce.core.dynamic.annotation.Param;
import org.jeecg.modules.xtw.entity.XtwSystemConfig;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.jeecg.modules.xtw.entity.XtwTestMetadata;

import java.util.List;

/**
 * @Description: xtw_system_config
 * @Author: jeecg-boot
 * @Date:   2023-04-09
 * @Version: V1.0
 */
public interface XtwSystemConfigMapper extends BaseMapper<XtwSystemConfig> {

    XtwSystemConfig findConfig(@Param("configKey") String configKey);

}
