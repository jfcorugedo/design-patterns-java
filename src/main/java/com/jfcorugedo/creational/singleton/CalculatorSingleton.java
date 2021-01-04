package com.jfcorugedo.creational.singleton;

import java.util.Arrays;

public class CalculatorSingleton {

    private static CalculatorSingleton singleton;

    private CalculatorSingleton() {

    }

    public static CalculatorSingleton getInstance() {
        if(singleton == null) {
            singleton = new CalculatorSingleton();
        }

        return singleton;
    }

    public int sum(int... numbers) {
        return Arrays.stream(numbers).sum();
    }
}
