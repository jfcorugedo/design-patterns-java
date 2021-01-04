package com.jfcorugedo.creational.singleton;

import java.util.Arrays;

public class CalculatorSingleton {

    /* Inner static classes are guaranteed to load lazily. */
    private static class SingletonHolder {
        public static final CalculatorSingleton singleton = new CalculatorSingleton();
    }

    private CalculatorSingleton() {

    }

    public static CalculatorSingleton getInstance() {
        return SingletonHolder.singleton;
    }

    public int sum(int... numbers) {
        return Arrays.stream(numbers).sum();
    }
}
