package org.jeecg.modules.xtw.model;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @Description: 良率统计数据对象
 * @Author: LuYuan
 * @Date:  2023-04-10
 * @Version: V1.0
 */
@Data
public class SylWaferlotModel {
    public static String YIELD = "yield";
    public static String MEAN = "robust mean";
    public static String PLUS_XIGEMA = "mean+3xgm";
    public static String MINUS_XIGEMA = "mean-3xgm";
    public static String CONTROL = "control line";

    /**
     * 产品名
     */
    private String icName;

    /**
     * 大批次
     */
    private String name;

    /**
     * 良率分类：
     *  yield : 良率
     *  robust mean: 良率中位数
     *  mean - 3xgm:
     *  control line:
     */
    private String type;

    /**
     * 良率值
     */
    private BigDecimal value;

    public String getKey() {
        return icName + "@" + name;
    }

    public void setKey(String key) {
        String spitChar = "@";
        String[] keys = key.split(spitChar);
        if (keys.length >= 2) {
            icName = keys[0];
            name = keys[1];
        }
    }

}
