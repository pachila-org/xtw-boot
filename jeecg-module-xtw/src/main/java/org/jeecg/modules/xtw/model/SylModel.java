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

    public String getValid() {
        // 如果 yield 在 mean - 3xgm 和 mean + 3xgm 之间，则为有效数据 而且 yield >= control line
        if(yield != null && robustMean != null && meanMinus3xgm != null && meanPlus3xgm != null && controlLine != null
                && yield.compareTo(meanMinus3xgm) >= 0 && yield.compareTo(meanPlus3xgm) <= 0 && yield.compareTo(controlLine) >= 0)
            return "1";
        return "0";
    }
}
