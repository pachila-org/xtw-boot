package org.jeecg.modules.xtw.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.jeecgframework.poi.excel.annotation.Excel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.jetbrains.annotations.NotNull;

/**
 * @Description: xtw_test_bin_detail
 * @Author: jeecg-boot
 * @Date:   2023-04-07
 * @Version: V1.0
 */
@Data
@TableName("xtw_test_bin_detail")
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="xtw_test_bin_detail对象", description="xtw_test_bin_detail")
public class TestBinDetail implements Serializable {
    private static final long serialVersionUID = 1L;

	/**id*/
	@TableId(type = IdType.ASSIGN_ID)
    @ApiModelProperty(value = "id")
    private String id;
	/**测试记录ID*/
	@Excel(name = "测试记录ID", width = 15)
    @ApiModelProperty(value = "测试记录ID")
    private String testRecordId;
	/**Site*/
	@Excel(name = "Site", width = 15)
    @ApiModelProperty(value = "Site")
    private String site;
	/**bin1*/
	@Excel(name = "bin1", width = 15)
    @ApiModelProperty(value = "bin1")
    private String bin1;
	/**bin2*/
	@Excel(name = "bin2", width = 15)
    @ApiModelProperty(value = "bin2")
    private String bin2;
	/**bin3*/
	@Excel(name = "bin3", width = 15)
    @ApiModelProperty(value = "bin3")
    private String bin3;
	/**bin4*/
	@Excel(name = "bin4", width = 15)
    @ApiModelProperty(value = "bin4")
    private String bin4;
	/**bin5*/
	@Excel(name = "bin5", width = 15)
    @ApiModelProperty(value = "bin5")
    private String bin5;
	/**bin6*/
	@Excel(name = "bin6", width = 15)
    @ApiModelProperty(value = "bin6")
    private String bin6;
	/**bin7*/
	@Excel(name = "bin7", width = 15)
    @ApiModelProperty(value = "bin7")
    private String bin7;
	/**bin8*/
	@Excel(name = "bin8", width = 15)
    @ApiModelProperty(value = "bin8")
    private String bin8;
	/**bin9*/
	@Excel(name = "bin9", width = 15)
    @ApiModelProperty(value = "bin9")
    private String bin9;
	/**bin10*/
	@Excel(name = "bin10", width = 15)
    @ApiModelProperty(value = "bin10")
    private String bin10;
	/**bin11*/
	@Excel(name = "bin11", width = 15)
    @ApiModelProperty(value = "bin11")
    private String bin11;
	/**bin12*/
	@Excel(name = "bin12", width = 15)
    @ApiModelProperty(value = "bin12")
    private String bin12;
	/**bin13*/
	@Excel(name = "bin13", width = 15)
    @ApiModelProperty(value = "bin13")
    private String bin13;
	/**bin14*/
	@Excel(name = "bin14", width = 15)
    @ApiModelProperty(value = "bin14")
    private String bin14;
	/**bin15*/
	@Excel(name = "bin15", width = 15)
    @ApiModelProperty(value = "bin15")
    private String bin15;
	/**bin16*/
	@Excel(name = "bin16", width = 15)
    @ApiModelProperty(value = "bin16")
    private String bin16;
	/**bin17*/
	@Excel(name = "bin17", width = 15)
    @ApiModelProperty(value = "bin17")
    private String bin17;
	/**bin18*/
	@Excel(name = "bin18", width = 15)
    @ApiModelProperty(value = "bin18")
    private String bin18;
	/**bin19*/
	@Excel(name = "bin19", width = 15)
    @ApiModelProperty(value = "bin19")
    private String bin19;
	/**bin20*/
	@Excel(name = "bin20", width = 15)
    @ApiModelProperty(value = "bin20")
    private String bin20;
	/**bin21*/
	@Excel(name = "bin21", width = 15)
    @ApiModelProperty(value = "bin21")
    private String bin21;
	/**bin22*/
	@Excel(name = "bin22", width = 15)
    @ApiModelProperty(value = "bin22")
    private String bin22;
	/**bin23*/
	@Excel(name = "bin23", width = 15)
    @ApiModelProperty(value = "bin23")
    private String bin23;
	/**bin24*/
	@Excel(name = "bin24", width = 15)
    @ApiModelProperty(value = "bin24")
    private String bin24;
	/**bin25*/
	@Excel(name = "bin25", width = 15)
    @ApiModelProperty(value = "bin25")
    private String bin25;
	/**bin26*/
	@Excel(name = "bin26", width = 15)
    @ApiModelProperty(value = "bin26")
    private String bin26;
	/**bin27*/
	@Excel(name = "bin27", width = 15)
    @ApiModelProperty(value = "bin27")
    private String bin27;
	/**bin28*/
	@Excel(name = "bin28", width = 15)
    @ApiModelProperty(value = "bin28")
    private String bin28;
	/**bin29*/
	@Excel(name = "bin29", width = 15)
    @ApiModelProperty(value = "bin29")
    private String bin29;
	/**bin30*/
	@Excel(name = "bin30", width = 15)
    @ApiModelProperty(value = "bin30")
    private String bin30;
	/**bin31*/
	@Excel(name = "bin31", width = 15)
    @ApiModelProperty(value = "bin31")
    private String bin31;
	/**bin32*/
	@Excel(name = "bin32", width = 15)
    @ApiModelProperty(value = "bin32")
    private String bin32;
	/**bin33*/
	@Excel(name = "bin33", width = 15)
    @ApiModelProperty(value = "bin33")
    private String bin33;
	/**bin34*/
	@Excel(name = "bin34", width = 15)
    @ApiModelProperty(value = "bin34")
    private String bin34;
	/**bin35*/
	@Excel(name = "bin35", width = 15)
    @ApiModelProperty(value = "bin35")
    private String bin35;
	/**bin36*/
	@Excel(name = "bin36", width = 15)
    @ApiModelProperty(value = "bin36")
    private String bin36;
	/**bin37*/
	@Excel(name = "bin37", width = 15)
    @ApiModelProperty(value = "bin37")
    private String bin37;
	/**bin38*/
	@Excel(name = "bin38", width = 15)
    @ApiModelProperty(value = "bin38")
    private String bin38;
	/**bin39*/
	@Excel(name = "bin39", width = 15)
    @ApiModelProperty(value = "bin39")
    private String bin39;
	/**bin40*/
	@Excel(name = "bin40", width = 15)
    @ApiModelProperty(value = "bin40")
    private String bin40;
	/**bin41*/
	@Excel(name = "bin41", width = 15)
    @ApiModelProperty(value = "bin41")
    private String bin41;
	/**bin42*/
	@Excel(name = "bin42", width = 15)
    @ApiModelProperty(value = "bin42")
    private String bin42;
	/**bin43*/
	@Excel(name = "bin43", width = 15)
    @ApiModelProperty(value = "bin43")
    private String bin43;
	/**bin44*/
	@Excel(name = "bin44", width = 15)
    @ApiModelProperty(value = "bin44")
    private String bin44;
	/**bin45*/
	@Excel(name = "bin45", width = 15)
    @ApiModelProperty(value = "bin45")
    private String bin45;
	/**bin46*/
	@Excel(name = "bin46", width = 15)
    @ApiModelProperty(value = "bin46")
    private String bin46;
	/**bin47*/
	@Excel(name = "bin47", width = 15)
    @ApiModelProperty(value = "bin47")
    private String bin47;
	/**bin48*/
	@Excel(name = "bin48", width = 15)
    @ApiModelProperty(value = "bin48")
    private String bin48;
	/**bin49*/
	@Excel(name = "bin49", width = 15)
    @ApiModelProperty(value = "bin49")
    private String bin49;
	/**bin50*/
	@Excel(name = "bin50", width = 15)
    @ApiModelProperty(value = "bin50")
    private String bin50;
	/**bin51*/
	@Excel(name = "bin51", width = 15)
    @ApiModelProperty(value = "bin51")
    private String bin51;
	/**bin52*/
	@Excel(name = "bin52", width = 15)
    @ApiModelProperty(value = "bin52")
    private String bin52;
	/**bin53*/
	@Excel(name = "bin53", width = 15)
    @ApiModelProperty(value = "bin53")
    private String bin53;
	/**bin54*/
	@Excel(name = "bin54", width = 15)
    @ApiModelProperty(value = "bin54")
    private String bin54;
	/**bin55*/
	@Excel(name = "bin55", width = 15)
    @ApiModelProperty(value = "bin55")
    private String bin55;
	/**bin56*/
	@Excel(name = "bin56", width = 15)
    @ApiModelProperty(value = "bin56")
    private String bin56;
	/**bin57*/
	@Excel(name = "bin57", width = 15)
    @ApiModelProperty(value = "bin57")
    private String bin57;
	/**bin58*/
	@Excel(name = "bin58", width = 15)
    @ApiModelProperty(value = "bin58")
    private String bin58;
	/**bin59*/
	@Excel(name = "bin59", width = 15)
    @ApiModelProperty(value = "bin59")
    private String bin59;
	/**bin60*/
	@Excel(name = "bin60", width = 15)
    @ApiModelProperty(value = "bin60")
    private String bin60;
	/**bin61*/
	@Excel(name = "bin61", width = 15)
    @ApiModelProperty(value = "bin61")
    private String bin61;
	/**bin62*/
	@Excel(name = "bin62", width = 15)
    @ApiModelProperty(value = "bin62")
    private String bin62;
	/**bin63*/
	@Excel(name = "bin63", width = 15)
    @ApiModelProperty(value = "bin63")
    private String bin63;
	/**bin64*/
	@Excel(name = "bin64", width = 15)
    @ApiModelProperty(value = "bin64")
    private String bin64;
	/**良率*/
	@Excel(name = "良率", width = 15)
    @ApiModelProperty(value = "良率")
    private BigDecimal syl;

    public BigDecimal sumSYL() {
        BigDecimal element = new BigDecimal(0);
        BigDecimal denominator = new BigDecimal(0);

        element = element.add(new BigDecimal(bin1)).add(new BigDecimal(bin2));
        denominator = sumAllBin();

        return element.divide(denominator);

    }

    public BigDecimal sumAllBin() {
        BigDecimal result = new BigDecimal(0);
        result = getBigDecimal(result, bin1, bin2, bin3, bin4, bin5, bin6, bin7, bin8, bin9, bin10);
        result = getBigDecimal(result, bin11, bin12, bin13, bin14, bin15, bin16, bin17, bin18, bin19, bin20);
        result = getBigDecimal(result, bin21, bin22, bin23, bin24, bin25, bin26, bin27, bin28, bin29, bin30);
        result = getBigDecimal(result, bin31, bin32, bin33, bin34, bin35, bin36, bin37, bin38, bin39, bin40);
        result = getBigDecimal(result, bin41, bin42, bin43, bin44, bin45, bin46, bin47, bin48, bin49, bin50);
        result = getBigDecimal(result, bin51, bin52, bin53, bin54, bin55, bin56, bin57, bin58, bin59, bin60);
        result = result.add(new BigDecimal(bin61));
        result = result.add(new BigDecimal(bin62));
        result = result.add(new BigDecimal(bin63));
        result = result.add(new BigDecimal(bin64));
        return result;
    }

    @NotNull
    private BigDecimal getBigDecimal(BigDecimal result, String bin1, String bin2, String bin3, String bin4, String bin5,
                                     String bin6, String bin7, String bin8, String bin9, String bin10) {
        result = result.add(new BigDecimal(bin1));
        result = result.add(new BigDecimal(bin2));
        result = result.add(new BigDecimal(bin3));
        result = result.add(new BigDecimal(bin4));
        result = result.add(new BigDecimal(bin5));
        result = result.add(new BigDecimal(bin6));
        result = result.add(new BigDecimal(bin7));
        result = result.add(new BigDecimal(bin8));
        result = result.add(new BigDecimal(bin9));
        result = result.add(new BigDecimal(bin10));
        return result;
    }
}
