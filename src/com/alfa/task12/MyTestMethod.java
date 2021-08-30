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
}
