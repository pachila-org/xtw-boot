package org.jeecg.modules.xtw.util;

import org.apache.commons.math3.stat.descriptive.rank.Percentile;

import java.math.BigDecimal;
import java.util.Arrays;

public class QuartileUtil {

    /**
     * 计算四分位数
     * @param values 数组
     * @param quartile 1:Q1, 2:Q2, 3:Q3
     * @return
     */
    public static BigDecimal calculate(BigDecimal[] values, int quartile) {
        double[] doubleValues = new double[values.length];
        for (int i = 0; i < values.length; i++) {
            doubleValues[i] = values[i].doubleValue();
        }
        Arrays.sort(doubleValues);

        Percentile percentile = new Percentile();

        switch (quartile) {
            case 1:
                quartile = 25;
                break;
            case 2:
                quartile = 50;
                break;
            case 3:
                quartile = 75;
                break;
            default:
                throw new IllegalArgumentException("Invalid quartile type: " + quartile);
        }
        return new BigDecimal(percentile.evaluate(doubleValues, quartile));
    }

//    public static BigDecimal calculate(BigDecimal[] array, int type) {
//        Arrays.sort(array); // 先把数组排序
//        int length = array.length;
//        int mid = length / 2;
//
//        BigDecimal q;
//        switch (type) {
//            case 1:
//                q = array[(mid - 1) / 2];
//                break;
//            case 2:
//                if (length % 2 == 0) {
//                    q = (array[mid - 1].add(array[mid])).divide(new BigDecimal(2));
//                } else {
//                    q = array[mid];
//                }
//                break;
//            case 3:
//                q = array[mid + ((length - mid) / 2)];
//                break;
//            default:
//                throw new IllegalArgumentException("Invalid quartile type: " + type);
//        }
//
//        return q;
//    }

    public static void main(String[] args) {
        BigDecimal[] array = { BigDecimal.valueOf(2), BigDecimal.valueOf(4), BigDecimal.valueOf(5),
                BigDecimal.valueOf(5), BigDecimal.valueOf(6), BigDecimal.valueOf(8), BigDecimal.valueOf(10),
                BigDecimal.valueOf(12), BigDecimal.valueOf(15) };

        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Q1: " + calculate(array, 1));
        System.out.println("Q2: " + calculate(array, 2));
        System.out.println("Q3: " + calculate(array, 3));
    }
}

