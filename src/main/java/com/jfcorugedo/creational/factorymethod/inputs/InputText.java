package com.jfcorugedo.creational.factorymethod.inputs;

import com.jfcorugedo.creational.factorymethod.actions.Action;
import com.jfcorugedo.creational.factorymethod.behaviours.Clickable;

public class InputText implements Clickable {
    @Override
    public Action click() {
        return null;
    }
}
