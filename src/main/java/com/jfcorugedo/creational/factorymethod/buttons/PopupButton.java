package com.jfcorugedo.creational.factorymethod.buttons;

import com.jfcorugedo.creational.factorymethod.actions.Action;
import com.jfcorugedo.creational.factorymethod.actions.PopupAction;
import com.jfcorugedo.creational.factorymethod.behaviours.Clickable;

public class PopupButton implements Clickable {
    @Override
    public Action click() {
        return new PopupAction();
    }
}
