package com.alfa.task12;

import java.util.Arrays;
import java.util.Random;

public class Runner {
    public void run() {
        Integer[] test1 = getIntegerArrays(10);
        System.out.println("Integer arrays" + Arrays.toString(test1));
        int intMaxValue = 40;
        System.out.println("Integer arrays num > " + intMaxValue + " = " + MyTestMethod.calcNum(test1, intMaxValue));

        Double[] test2 = getDoubleArrays(10);
        System.out.println("Double arrays" + Arrays.toString(test2));
        int doubleMaxValue = 20;
        System.out.println("Double arrays num > " + doubleMaxValue + " = " + MyTestMethod.calcNum(test2, doubleMaxValue));

        System.out.println("Integer arrays sum > " + intMaxValue + " = " + MyTestMethod.calcSum(test1, intMaxValue));
        System.out.println("Double arrays sum > " + doubleMaxValue + " = " + MyTestMethod.calcSum(test2, doubleMaxValue));



    }

    private Double[] getDoubleArrays(int maxValue) {
        Double[] arrays = new Double[maxValue];
        Random random = new Random();
        for (int i = 0; i < maxValue; i++) {
            arrays[i] = random.nextInt(100) * random.nextDouble();
        }
        return arrays;
    }

    public Integer[] getIntegerArrays(int maxValue) {
        Integer[] arrays = new Integer[maxValue];
        Random random = new Random();
        for (int i = 0; i < maxValue; i++) {
            arrays[i] = random.nextInt(100);
        }
        return arrays;
    }
}
