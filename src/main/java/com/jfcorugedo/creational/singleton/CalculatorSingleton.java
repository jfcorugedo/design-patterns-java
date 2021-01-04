package com.jfcorugedo.creational.singleton;

public class CalculatorSingleton {

    public static CalculatorSingleton getInstance() {
        return new CalculatorSingleton();
    }

    public int sum(int numbers) {
        return numbers;
    }
}
