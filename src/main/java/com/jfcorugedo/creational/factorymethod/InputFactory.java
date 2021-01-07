package com.jfcorugedo.creational.factorymethod;

import com.jfcorugedo.creational.factorymethod.behaviours.Clickable;
import com.jfcorugedo.creational.factorymethod.inputs.InputText;

public class InputFactory {

    public Clickable createClickable(Clickable.Type type) {
        return new InputText();
    }
}
