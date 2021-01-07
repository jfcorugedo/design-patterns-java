package com.jfcorugedo.creational.factorymethod;

import com.jfcorugedo.creational.factorymethod.actions.SubmitAction;
import com.jfcorugedo.creational.factorymethod.behaviours.Clickable;
import com.jfcorugedo.creational.factorymethod.buttons.SubmitButton;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ButtonFactoryTest {

    @Test
    public void submitButtonIsClickable() {

        assertThat(new SubmitButton()).isInstanceOf(Clickable.class);
    }

    @Test
    public void submitButtonProducesSubmitActionWhenClicked() {

        Clickable submitButton = new SubmitButton();

        assertThat(submitButton.click()).isInstanceOf(SubmitAction.class);
    }
}
