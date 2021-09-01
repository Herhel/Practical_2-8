package com.alfa.task12;

import java.util.Arrays;

public class MyTestMethod {
    public static <T extends Number> int calcNum(T[] arrays, T maxValue) {
        int counter = 0;
        for (T t : arrays) {
            if (t.doubleValue() > maxValue.doubleValue()) {
                counter++;
            }
        }
        return counter;
    }

    public static <N extends Number> double calcSum(N[] array, N maxValue) {
        double sum = 0.0;
        for (N element : array) {
            if (element.doubleValue() > maxValue.doubleValue()) {
                sum += element.doubleValue();
            }
        }
        return sum;
    }
}
