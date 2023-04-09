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
 * @Description: xtw_test_record
 * @Author: jeecg-boot
 * @Date:   2023-04-09
 * @Version: V1.0
 */
@Data
@TableName("xtw_test_record")
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="xtw_test_record对象", description="xtw_test_record")
public class XtwTestRecord implements Serializable {
    private static final long serialVersionUID = 1L;

	/**id*/
	@TableId(type = IdType.ASSIGN_ID)
    @ApiModelProperty(value = "id")
    private String id;
	/**文件日期*/
	@Excel(name = "文件日期", width = 15)
    @ApiModelProperty(value = "文件日期")
    private String fileDate;
	/**文件名*/
	@Excel(name = "文件名", width = 15)
    @ApiModelProperty(value = "文件名")
    private String fileName;
	/**批次号*/
	@Excel(name = "批次号", width = 15)
    @ApiModelProperty(value = "批次号")
    private String waferLot;
	/**IC的产品名称*/
	@Excel(name = "IC的产品名称", width = 15)
    @ApiModelProperty(value = "IC的产品名称")
    private String icName;
	/**子批次*/
	@Excel(name = "子批次", width = 15)
    @ApiModelProperty(value = "子批次")
    private String subLot;
	/**初测标志*/
	@Excel(name = "初测标志", width = 15)
    @ApiModelProperty(value = "初测标志")
    private String firstTestFlag;
	/**电脑名称*/
	@Excel(name = "电脑名称", width = 15)
    @ApiModelProperty(value = "电脑名称")
    private String hostname;
	/**测试程序*/
	@Excel(name = "测试程序", width = 15)
    @ApiModelProperty(value = "测试程序")
    private String testProgram;
	/**批次整体信息*/
	@Excel(name = "批次整体信息", width = 15)
    @ApiModelProperty(value = "批次整体信息")
    private String wholeLog;
	/**测试仪ID*/
	@Excel(name = "测试仪ID", width = 15)
    @ApiModelProperty(value = "测试仪ID")
    private String testId;
	/**测试时间*/
	@Excel(name = "测试时间", width = 15)
    @ApiModelProperty(value = "测试时间")
    private String testTime;
	/**测试时间*/
	@Excel(name = "测试时间", width = 15)
    @ApiModelProperty(value = "测试时间")
    private String testYear;
	/**测试时间*/
	@Excel(name = "测试时间", width = 15)
    @ApiModelProperty(value = "测试时间")
    private String testMonth;
	/**测试时间*/
	@Excel(name = "测试时间", width = 15)
    @ApiModelProperty(value = "测试时间")
    private String testDay;
}
