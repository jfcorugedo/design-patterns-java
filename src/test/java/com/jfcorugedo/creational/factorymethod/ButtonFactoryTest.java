package com.jfcorugedo.creational.factorymethod;

import com.jfcorugedo.creational.factorymethod.actions.PopupAction;
import com.jfcorugedo.creational.factorymethod.actions.SubmitAction;
import com.jfcorugedo.creational.factorymethod.behaviours.Clickable;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ButtonFactoryTest {

    @Test
    public void submitButtonIsClickable() {

        ButtonFactory buttonFactory = new ButtonFactory();

        assertThat(buttonFactory.createSubmitButton()).isInstanceOf(Clickable.class);
    }

    @Test
    public void submitButtonProducesSubmitActionWhenClicked() {

        ButtonFactory buttonFactory = new ButtonFactory();

        assertThat(buttonFactory.createSubmitButton().click()).isInstanceOf(SubmitAction.class);
    }

    @Test
    public void popupButtonIsClickable() {

        ButtonFactory buttonFactory = new ButtonFactory();

        assertThat(buttonFactory.createPopupButton()).isInstanceOf(Clickable.class);
    }

    @Test
    public void popupButtonProducesPopupActionWhenClicked() {

        ButtonFactory buttonFactory = new ButtonFactory();

        assertThat(buttonFactory.createPopupButton().click()).isInstanceOf(PopupAction.class);
    }
}
