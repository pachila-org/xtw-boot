package org.jeecg.modules.xtw.util;

import java.math.BigDecimal;
import java.util.Arrays;

public class QuartileUtil {

    public static BigDecimal calculate(BigDecimal[] array, int type) {
        Arrays.sort(array); // 先把数组排序
        int length = array.length;
        int mid = length / 2;

        BigDecimal q;
        switch (type) {
            case 1:
                q = array[(mid - 1) / 2];
                break;
            case 2:
                if (length % 2 == 0) {
                    q = (array[mid - 1].add(array[mid])).divide(new BigDecimal(2));
                } else {
                    q = array[mid];
                }
                break;
            case 3:
                q = array[mid + ((length - mid) / 2)];
                break;
            default:
                throw new IllegalArgumentException("Invalid quartile type: " + type);
        }

        return q;
    }

    public static void main(String[] args) {
        BigDecimal[] array = { BigDecimal.valueOf(2), BigDecimal.valueOf(3), BigDecimal.valueOf(5),
                BigDecimal.valueOf(5), BigDecimal.valueOf(6), BigDecimal.valueOf(8), BigDecimal.valueOf(10),
                BigDecimal.valueOf(12), BigDecimal.valueOf(15) };

        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Q1: " + calculate(array, 1));
        System.out.println("Q2: " + calculate(array, 2));
        System.out.println("Q3: " + calculate(array, 3));
    }
}