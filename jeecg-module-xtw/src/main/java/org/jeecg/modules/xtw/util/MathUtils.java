package org.jeecg.modules.xtw.util;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class MathUtils {

    /**
     * 取指定2个数的中位数。俩个参数以BigDecimal型传入
     */
    public static BigDecimal mean(BigDecimal a, BigDecimal b) {
        return a.add(b).divide(new BigDecimal("2.0"), 8, RoundingMode.HALF_DOWN);
    }

    /**
     * 取指定数组的中位数。 
     * 参数1 arr: BigDecimal[] 型的数组
     * 参数1 quartile: 四分位数的类型，可能的值为1，2，3
     */
    public static BigDecimal quartile(BigDecimal[] arr, int quartile) {
        if (arr.length == 0) {
            return new BigDecimal(0);
        }
        Arrays.sort(arr);
    
        int length = arr.length;
        int index = length * quartile / 4;
    
        switch (length % 4) {
            case 0:
                return arr[index - 1].add(arr[index]).divide(new BigDecimal("2.0"), 4, RoundingMode.HALF_DOWN);
            case 1:
                return arr[index];
            case 2:
                return arr[index].add(arr[index + 1]).divide(new BigDecimal("2.0"),4, RoundingMode.HALF_DOWN);
            default:
                BigDecimal weight1 = new BigDecimal("0.25");
                BigDecimal weight2 = new BigDecimal("0.75");
                return arr[index].multiply(weight1).add(arr[index + 1].multiply(weight2));
        }
    }

    public static double getQuartile(double[] arr, int quart) {
        Arrays.sort(arr);
        int n = arr.length;
        double pos = (double) (quart * (n + 1)) / 4;
        if (pos < 1) {
            return arr[0];
        }
        if (pos >= n) {
            return arr[n - 1];
        }
        int lower = (int) pos;
        double fraction = pos - lower;
        return arr[lower - 1] * (1 - fraction) + arr[lower] * fraction;
    }

    public static void main(String [] args) {
//        BigDecimal[] arr = {
//                new BigDecimal("1.0"),
//                new BigDecimal("2.0"),
//                new BigDecimal("3.0"),
//                new BigDecimal("4.0"),
//                new BigDecimal("5.0"),
//                new BigDecimal("6.0"),
//                new BigDecimal("7.0"),
//                new BigDecimal("8.0"),
//                new BigDecimal("9.0"),
//                new BigDecimal("10.0")
//        };
//        System.out.println(MathUtils.quartile(arr, 1));
//        System.out.println(MathUtils.quartile(arr, 2));
//        System.out.println(MathUtils.quartile(arr, 3));
//
//        BigDecimal[] arrnull = {};
//        System.out.println(MathUtils.quartile(arrnull, 1));

        // Create an array of doubles
        double[] arr = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0,9.0, 10.0};
        System.out.println(MathUtils.getQuartile(arr, 1));
        System.out.println(MathUtils.getQuartile(arr, 2));
        System.out.println(MathUtils.getQuartile(arr, 3));

        

    }
}