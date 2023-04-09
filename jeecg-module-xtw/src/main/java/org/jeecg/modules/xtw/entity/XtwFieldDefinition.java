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
 * @Description: xtw_field_definition
 * @Author: jeecg-boot
 * @Date:   2023-04-09
 * @Version: V1.0
 */
@Data
@TableName("xtw_field_definition")
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="xtw_field_definition对象", description="xtw_field_definition")
public class XtwFieldDefinition implements Serializable {
    private static final long serialVersionUID = 1L;

	/**id*/
	@TableId(type = IdType.ASSIGN_ID)
    @ApiModelProperty(value = "id")
    private String id;
	/**测试项目*/
	@Excel(name = "测试项目", width = 15)
    @ApiModelProperty(value = "测试项目")
    private String fieldName;
	/**显示名称*/
	@Excel(name = "显示名称", width = 15)
    @ApiModelProperty(value = "显示名称")
    private String showName;
	/**是否显示*/
	@Excel(name = "是否显示", width = 15)
    @ApiModelProperty(value = "是否显示")
    private String isShow;
	/**是否计算*/
	@Excel(name = "是否计算", width = 15)
    @ApiModelProperty(value = "是否计算")
    private String isCal;
	/**是否计算分布*/
	@Excel(name = "是否计算分布", width = 15)
    @ApiModelProperty(value = "是否计算分布")
    private String calDistribution;
	/**源文件中名称*/
	@Excel(name = "源文件中名称", width = 15)
    @ApiModelProperty(value = "源文件中名称")
    private String sourceName;
	/**统计表中名称*/
	@Excel(name = "统计表中名称", width = 15)
    @ApiModelProperty(value = "统计表中名称")
    private String tableFieldName;
	/**创建人*/
    @ApiModelProperty(value = "创建人")
    private String createBy;
	/**创建日期*/
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @ApiModelProperty(value = "创建日期")
    private Date createTime;
	/**更新人*/
    @ApiModelProperty(value = "更新人")
    private String updateBy;
	/**更新日期*/
	@JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @ApiModelProperty(value = "更新日期")
    private Date updateTime;
	/**所属部门*/
    @ApiModelProperty(value = "所属部门")
    private String sysOrgCode;
}
