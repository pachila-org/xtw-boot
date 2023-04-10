package org.jeecg.modules.xtw.util;

import java.math.BigDecimal;
import java.util.Arrays;

public class MathUtils {

    public static BigDecimal quartile(BigDecimal[] arr, int quartile) {
        Arrays.sort(arr);

        int length = arr.length;
        int index = length * quartile / 4;

        if (length % 4 == 0) {
            return arr[index - 1].add(arr[index]).divide(new BigDecimal("2.0"));
        } else if (length % 4 == 1) {
            return arr[index];
        } else if (length % 4 == 2) {
            return arr[index].add(arr[index + 1]).divide(new BigDecimal("2.0"));
        } else {
            BigDecimal weight1 = new BigDecimal("0.25");
            BigDecimal weight2 = new BigDecimal("0.75");
            return arr[index].multiply(weight1).add(arr[index + 1].multiply(weight2));
        }
    }
//    public static BigDecimal quartile(BigDecimal[] arr, int quartile) {
//        Arrays.sort(arr);
//
//        int length = arr.length;
//        int index = length * quartile / 4;
//
//        if (length % 4 == 0) {
//            return (arr[index - 1].add(arr[index])).divide(new BigDecimal("2.0"));
//        } else if (length % 4 == 1) {
//            return arr[index];
//        } else if (length % 4 == 2) {
//            return (arr[index].add(arr[index + 1])).divide(new BigDecimal("2.0"));
//        } else {
//            BigDecimal weight1 = new BigDecimal("0.75");
//            BigDecimal weight2 = new BigDecimal("0.25");
//            return (arr[index].multiply(weight1).add(arr[index + 1].multiply(weight2)));
//        }
//    }

    public static void main(String [] args) {
        BigDecimal[] arr = {
                new BigDecimal("1.0"),
                new BigDecimal("2.0"),
                new BigDecimal("3.0"),
                new BigDecimal("4.0"),
                new BigDecimal("5.0"),
                new BigDecimal("6.0"),
                new BigDecimal("7.0"),
                new BigDecimal("8.0"),
                new BigDecimal("9.0"),
                new BigDecimal("10.0")
        };
        System.out.println(MathUtils.quartile(arr, 1));
        System.out.println(MathUtils.quartile(arr, 2));
        System.out.println(MathUtils.quartile(arr, 3));
    }
}
