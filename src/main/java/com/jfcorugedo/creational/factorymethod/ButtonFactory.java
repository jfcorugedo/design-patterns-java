package com.jfcorugedo.creational.factorymethod;

import com.jfcorugedo.creational.factorymethod.behaviours.Clickable;
import com.jfcorugedo.creational.factorymethod.buttons.PopupButton;
import com.jfcorugedo.creational.factorymethod.buttons.SubmitButton;

public class ButtonFactory {

    public Clickable createClickable(Clickable.Type type) {
        switch (type) {
            case SUBMIT: return new SubmitButton();
            case POPUP: return new PopupButton();
            default: return () -> null;
        }
    }
}
