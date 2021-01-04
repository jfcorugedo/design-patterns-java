package com.jfcorugedo.creational.singleton;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorSingletonTest {

    @Test
    public void sumOneNumber() {

        CalculatorSingleton calculator = CalculatorSingleton.getInstance();

        assertThat(calculator.sum(1)).isEqualTo(1);
    }
}
