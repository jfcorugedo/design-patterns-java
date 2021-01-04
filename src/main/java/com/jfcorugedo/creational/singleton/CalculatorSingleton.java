package com.jfcorugedo.creational.singleton;

import java.util.Arrays;

public class CalculatorSingleton {

    public static CalculatorSingleton getInstance() {
        return new CalculatorSingleton();
    }

    public int sum(int... numbers) {
        return Arrays.stream(numbers).sum();
    }
}
