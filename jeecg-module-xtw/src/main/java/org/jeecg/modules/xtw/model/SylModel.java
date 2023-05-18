package org.jeecg.modules.xtw.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class SylModel {

    /**
     * 产品名
     */
    private String icName;

    /**
     * 大批次
     */
    private String waferLot;

    /**
     * 小批次
     */
    private String subLot;

    /**
     * 良率值：
     *  yield : 良率
     *  robust mean: 良率中位数
     *  mean - 3xgm:
     *  control line:
     */
    private BigDecimal yield;

    /**
     * robust mean: 良率中位数
     */
    private BigDecimal robustMean;

    /**
     * mean - 3xgm:
     */
    private BigDecimal meanMinus3xgm;

    /**
     * mean + 3xgm:
     */
    private BigDecimal meanPlus3xgm;

    /**
     * control line:
     */
    private BigDecimal controlLine;

}
