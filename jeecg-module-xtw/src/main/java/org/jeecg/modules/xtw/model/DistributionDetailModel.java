package org.jeecg.modules.xtw.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.jeecgframework.poi.excel.annotation.Excel;

import java.math.BigDecimal;

@Data
public class DistributionDetailModel {

    /** 大批次 */
    private String waferLot;

    /** 产品名 */
    private String icName;

    /** 小批次*/
    private String subLot;

    /** 测试项目 */
    private String testItem;

    /** SITE */
    private java.lang.String site;

    /**区间比率*/
    private java.lang.Double sectionRate;
    /**区间最小值*/
    private BigDecimal sectionMin;
    /**区间最大值*/
    private BigDecimal sectionMax;
    /**落在该区间的样本量*/
    private java.lang.Integer sampleAmount;

    public Double getSectionRate100() {
        // 保留1位小数
        BigDecimal bg = new BigDecimal(sectionRate*100);
        return bg.setScale(1, BigDecimal.ROUND_HALF_UP).doubleValue();
    }
}
