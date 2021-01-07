package com.jfcorugedo.creational.factorymethod.buttons;

import com.jfcorugedo.creational.factorymethod.behaviours.Clickable;
import com.jfcorugedo.creational.factorymethod.actions.Action;
import com.jfcorugedo.creational.factorymethod.actions.SubmitAction;

public class SubmitButton implements Clickable {
    @Override
    public Action click() {
        return new SubmitAction();
    }
}
