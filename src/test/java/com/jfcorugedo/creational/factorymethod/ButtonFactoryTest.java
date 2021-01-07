package com.jfcorugedo.creational.factorymethod;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ButtonFactoryTest {

    @Test
    public void submitButtonIsClickable() {

        assertThat(new SubmitButton()).isInstanceOf(Clickable.class);
    }
}
