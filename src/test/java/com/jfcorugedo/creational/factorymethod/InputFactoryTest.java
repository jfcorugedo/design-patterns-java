package com.jfcorugedo.creational.factorymethod;

import com.jfcorugedo.creational.factorymethod.actions.NoAction;
import com.jfcorugedo.creational.factorymethod.behaviours.Clickable;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class InputFactoryTest {

    @Test
    public void inputTextIsClickable() {

        InputFactory inputFactory = new InputFactory();

        assertThat(inputFactory.createClickable(Clickable.Type.INPUT_TEXT)).isInstanceOf(Clickable.class);
    }

    @Test
    public void inputTextProducesWritableActionWhenClicked() {

        InputFactory inputFactory = new InputFactory();

        assertThat(inputFactory.createClickable(Clickable.Type.INPUT_TEXT).click()).isInstanceOf(WritableAction.class);
    }

    @Test
    public void askingForNonInputClickableProducesNoActionWhenClicked() {

        InputFactory inputFactory = new InputFactory();

        assertThat(inputFactory.createClickable(Clickable.Type.SUBMIT).click()).isInstanceOf(NoAction.class);
    }
}
