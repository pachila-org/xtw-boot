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
 * @Description: xtw_test_distribtion
 * @Author: jeecg-boot
 * @Date:   2023-04-09
 * @Version: V1.0
 */
@Data
@TableName("xtw_test_distribtion")
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="xtw_test_distribtion对象", description="xtw_test_distribtion")
public class XtwTestDistribtion implements Serializable {
    private static final long serialVersionUID = 1L;

	/**ID*/
	@TableId(type = IdType.ASSIGN_ID)
    @ApiModelProperty(value = "ID")
    private java.lang.String id;
	/**测试记录ID*/
	@Excel(name = "测试记录ID", width = 15)
    @ApiModelProperty(value = "测试记录ID")
    private java.lang.String testRecordId;
	/**SITE*/
	@Excel(name = "SITE", width = 15)
    @ApiModelProperty(value = "SITE")
    private java.lang.String site;
	/**测试项目*/
	@Excel(name = "测试项目", width = 15)
    @ApiModelProperty(value = "测试项目")
    private java.lang.String testItem;
	/**区间比率*/
	@Excel(name = "区间比率", width = 15)
    @ApiModelProperty(value = "区间比率")
    private java.lang.Double sectionRate;
	/**区间最小值*/
	@Excel(name = "区间最小值", width = 15)
    @ApiModelProperty(value = "区间最小值")
    private java.lang.String sectionMin;
	/**区间最大值*/
	@Excel(name = "区间最大值", width = 15)
    @ApiModelProperty(value = "区间最大值")
    private java.lang.String sectionMax;
	/**落在该区间的样本量*/
	@Excel(name = "落在该区间的样本量", width = 15)
    @ApiModelProperty(value = "落在该区间的样本量")
    private java.lang.Integer sampleAmount;
}
