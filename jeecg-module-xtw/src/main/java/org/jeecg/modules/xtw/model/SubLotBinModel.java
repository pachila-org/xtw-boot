package org.jeecg.modules.xtw.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.jeecgframework.poi.excel.annotation.Excel;
import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Data
public class SubLotBinModel {

    /**测试记录ID*/
    private String testRecordId;

    /** 小批次*/
    private String subLot;

    /**bin1*/
    private String bin1;

    /**bin2*/
    private String bin2;

    /**bin3*/
    private String bin3;

    /**bin4*/
    private String bin4;

    /**bin5*/
    private String bin5;

    /**bin6*/
    private String bin6;

    /**bin7*/
    private String bin7;

    /**bin8*/
    private String bin8;

    /**bin9*/
    private String bin9;

    /**bin10*/
    private String bin10;

    /**bin11*/
    private String bin11;

    /**bin12*/
    private String bin12;

    /**bin13*/
    private String bin13;

    /**bin14*/
    private String bin14;

    /**bin15*/
    private String bin15;

    /**bin16*/
    private String bin16;

    /**bin17*/
    private String bin17;

    /**bin18*/
    private String bin18;

    /**bin19*/
    private String bin19;

    /**bin20*/
    private String bin20;

    /**bin21*/
    private String bin21;

    /**bin22*/
    private String bin22;

    /**bin23*/
    private String bin23;

    /**bin24*/
    private String bin24;

    /**bin25*/
    private String bin25;

    /**bin26*/
    private String bin26;

    /**bin27*/
    private String bin27;

    /**bin28*/
    private String bin28;

    /**bin29*/
    private String bin29;

    /**bin30*/
    private String bin30;

    /**bin31*/
    private String bin31;

    /**bin32*/
    private String bin32;

    /**bin33*/
    private String bin33;

    /**bin34*/
    private String bin34;

    /**bin35*/
    private String bin35;

    /**bin36*/
    private String bin36;

    /**bin37*/
    private String bin37;

    /**bin38*/
    private String bin38;

    /**bin39*/
    private String bin39;

    /**bin40*/
    private String bin40;

    /**bin41*/
    private String bin41;

    /**bin42*/
    private String bin42;

    /**bin43*/
    private String bin43;

    /**bin44*/
    private String bin44;

    /**bin45*/
    private String bin45;

    /**bin46*/
    private String bin46;

    /**bin47*/
    private String bin47;

    /**bin48*/
    private String bin48;

    /**bin49*/
    private String bin49;

    /**bin50*/
    private String bin50;

    /**bin51*/
    private String bin51;

    /**bin52*/
    private String bin52;

    /**bin53*/
    private String bin53;

    /**bin54*/
    private String bin54;

    /**bin55*/
    private String bin55;

    /**bin56*/
    private String bin56;

    /**bin57*/
    private String bin57;

    /**bin58*/
    private String bin58;

    /**bin59*/
    private String bin59;

    /**bin60*/
    private String bin60;

    /**bin61*/
    private String bin61;

    /**bin62*/
    private String bin62;

    /**bin63*/
    private String bin63;

    /**bin64*/
    private String bin64;


    public BigDecimal sumSYL() {
        BigDecimal element = new BigDecimal(0);
        BigDecimal denominator = new BigDecimal(0);

        element = element.add(new BigDecimal(bin1)).add(new BigDecimal(bin2));
        denominator = sumAllBin();
        System.out.println(element);
        System.out.println(denominator);
        System.out.println(element.divide(denominator, 4, RoundingMode.HALF_UP));
        return element.divide(denominator, 4, RoundingMode.HALF_UP);
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
