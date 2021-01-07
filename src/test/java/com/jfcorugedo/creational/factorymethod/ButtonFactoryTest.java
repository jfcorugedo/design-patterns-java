package com.jfcorugedo.creational.factorymethod;

import com.jfcorugedo.creational.factorymethod.actions.NoAction;
import com.jfcorugedo.creational.factorymethod.actions.PopupAction;
import com.jfcorugedo.creational.factorymethod.actions.SubmitAction;
import com.jfcorugedo.creational.factorymethod.behaviours.Clickable;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ButtonFactoryTest {

    @Test
    public void submitButtonIsClickable() {

        ButtonFactory buttonFactory = new ButtonFactory();

        assertThat(buttonFactory.createClickable(Clickable.Type.SUBMIT)).isInstanceOf(Clickable.class);
    }

    @Test
    public void submitButtonProducesSubmitActionWhenClicked() {

        ButtonFactory buttonFactory = new ButtonFactory();

        assertThat(buttonFactory.createClickable(Clickable.Type.SUBMIT).click()).isInstanceOf(SubmitAction.class);
    }

    @Test
    public void popupButtonIsClickable() {

        ButtonFactory buttonFactory = new ButtonFactory();

        assertThat(buttonFactory.createClickable(Clickable.Type.POPUP)).isInstanceOf(Clickable.class);
    }

    @Test
    public void popupButtonProducesPopupActionWhenClicked() {

        ButtonFactory buttonFactory = new ButtonFactory();

        assertThat(buttonFactory.createClickable(Clickable.Type.POPUP).click()).isInstanceOf(PopupAction.class);
    }

    @Test
    public void askingForNonButtonClickableProducesNoActionWhenClicked() {

        ButtonFactory buttonFactory = new ButtonFactory();

        assertThat(buttonFactory.createClickable(Clickable.Type.INPUT_TEXT).click()).isInstanceOf(NoAction.class);
    }
}
