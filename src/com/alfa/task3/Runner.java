package com.alfa.task3;

import java.util.Arrays;

public class Runner {
    public void run() {
        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        MyMixer<?> mixer = new MyMixer<>(intArray);
        mixer.shuflle();
        intArray = (Integer[]) mixer.getArray();
        System.out.println(Arrays.toString(intArray));

        String[] strArray = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
        mixer = new MyMixer<>(strArray);
        mixer.shuflle();
        strArray = (String[]) mixer.getArray();
        System.out.println(Arrays.toString(strArray));
    }

}
