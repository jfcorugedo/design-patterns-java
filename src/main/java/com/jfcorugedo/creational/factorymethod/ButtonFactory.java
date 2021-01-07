package com.jfcorugedo.creational.factorymethod;

import com.jfcorugedo.creational.factorymethod.buttons.PopupButton;
import com.jfcorugedo.creational.factorymethod.buttons.SubmitButton;

public class ButtonFactory {

    public SubmitButton createSubmitButton() {
        return new SubmitButton();
    }

    public PopupButton createPopupButton() {
        return new PopupButton();
    }
}
