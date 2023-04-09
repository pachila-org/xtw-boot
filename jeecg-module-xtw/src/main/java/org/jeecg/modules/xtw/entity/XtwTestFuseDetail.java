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
 * @Description: xtw_test_fuse_detail
 * @Author: jeecg-boot
 * @Date:   2023-04-09
 * @Version: V1.0
 */
@Data
@TableName("xtw_test_fuse_detail")
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="xtw_test_fuse_detail对象", description="xtw_test_fuse_detail")
public class XtwTestFuseDetail implements Serializable {
    private static final long serialVersionUID = 1L;

	/**id*/
	@TableId(type = IdType.ASSIGN_ID)
    @ApiModelProperty(value = "id")
    private java.lang.String id;
	/**测试记录ID*/
	@Excel(name = "测试记录ID", width = 15)
    @ApiModelProperty(value = "测试记录ID")
    private java.lang.String testRecordId;
	/**Site*/
	@Excel(name = "Site", width = 15)
    @ApiModelProperty(value = "Site")
    private java.lang.String site;
	/**V-FUSE-1*/
	@Excel(name = "V-FUSE-1", width = 15)
    @ApiModelProperty(value = "V-FUSE-1")
    private java.lang.String vFuse1;
	/**V-FUSE-2*/
	@Excel(name = "V-FUSE-2", width = 15)
    @ApiModelProperty(value = "V-FUSE-2")
    private java.lang.String vFuse2;
	/**V-FUSE-3*/
	@Excel(name = "V-FUSE-3", width = 15)
    @ApiModelProperty(value = "V-FUSE-3")
    private java.lang.String vFuse3;
	/**V-FUSE-4*/
	@Excel(name = "V-FUSE-4", width = 15)
    @ApiModelProperty(value = "V-FUSE-4")
    private java.lang.String vFuse4;
	/**I-FUSE-1*/
	@Excel(name = "I-FUSE-1", width = 15)
    @ApiModelProperty(value = "I-FUSE-1")
    private java.lang.String iFuse1;
	/**I-FUSE-2*/
	@Excel(name = "I-FUSE-2", width = 15)
    @ApiModelProperty(value = "I-FUSE-2")
    private java.lang.String iFuse2;
	/**I-FUSE-3*/
	@Excel(name = "I-FUSE-3", width = 15)
    @ApiModelProperty(value = "I-FUSE-3")
    private java.lang.String iFuse3;
	/**I-FUSE-4*/
	@Excel(name = "I-FUSE-4", width = 15)
    @ApiModelProperty(value = "I-FUSE-4")
    private java.lang.String iFuse4;
	/**I-FUSE-5*/
	@Excel(name = "I-FUSE-5", width = 15)
    @ApiModelProperty(value = "I-FUSE-5")
    private java.lang.String iFuse5;
}
