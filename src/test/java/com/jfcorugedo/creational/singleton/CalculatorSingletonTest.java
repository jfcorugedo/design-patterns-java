package com.jfcorugedo.creational.singleton;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * TDD Tests lists:
 *
 * - Sum just one number should return the same number
 * - Sum two or more numbers should return the sum of all the values
 * - Since the implementation is a Singleton, there should be just one instance of the Calculator
 *
 */
public class CalculatorSingletonTest {

    @Test
    public void sumOneNumber() {

        CalculatorSingleton calculator = CalculatorSingleton.getInstance();

        assertThat(calculator.sum(1)).isEqualTo(1);
    }

    @Test
    public void sumSeveralNumbers() {

        CalculatorSingleton calculator = CalculatorSingleton.getInstance();

        assertThat(calculator.sum(0,1)).isEqualTo(1);
    }
}
