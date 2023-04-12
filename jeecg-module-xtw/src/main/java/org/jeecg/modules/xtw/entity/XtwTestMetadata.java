package org.jeecg.modules.xtw.entity;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import org.jeecgframework.poi.excel.annotation.Excel;
import org.jeecg.common.aspect.annotation.Dict;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * @Description: xtw_test_metadata
 * @Author: jeecg-boot
 * @Date:   2023-04-12
 * @Version: V1.0
 */
@Data
@TableName("xtw_test_metadata")
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="xtw_test_metadata对象", description="xtw_test_metadata")
public class XtwTestMetadata implements Serializable {
    private static final long serialVersionUID = 1L;

	/**id*/
	@TableId(type = IdType.ASSIGN_ID)
    @ApiModelProperty(value = "id")
    private java.lang.String id;
	/**批次号*/
	@Excel(name = "批次号", width = 15)
    @ApiModelProperty(value = "批次号")
    private java.lang.String waferLot;
	/**IC的产品名称*/
	@Excel(name = "IC的产品名称", width = 15)
    @ApiModelProperty(value = "IC的产品名称")
    private java.lang.String icName;
	/**统计项目*/
	@Excel(name = "统计项目", width = 15)
    @ApiModelProperty(value = "统计项目")
    private java.lang.String testItem;
	/**Uplimit*/
	@Excel(name = "Uplimit", width = 15)
    @ApiModelProperty(value = "Uplimit")
    private java.lang.String uplimit;
	/**DownLimit*/
	@Excel(name = "DownLimit", width = 15)
    @ApiModelProperty(value = "DownLimit")
    private java.lang.String downlimit;
}
