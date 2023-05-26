package org.jeecg.modules.xtw.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class DistributionStatisticsModel {

    /** 大批次 */
    private String waferLot;

    /** 产品名 */
    private String icName;

//    /** 小批次*/
//    private String subLot;

    /** 测试项目 */
    private String testItem;

    /** 区间最小值*/
    private BigDecimal sectionMin;

    /** 区间最大值*/
    private BigDecimal sectionMax;

    /** 样本数量 */
    private Integer value;

    public BigDecimal getName() {
        return sectionMin;
    }

}
