package com.jfcorugedo.creational.factorymethod;

import com.jfcorugedo.creational.factorymethod.actions.Action;
import com.jfcorugedo.creational.factorymethod.behaviours.Clickable;

public class InputFactory {
    public Clickable createClickable(Clickable.Type inputText) {
        return new Clickable() {
            @Override
            public Action click() {
                return null;
            }
        };
    }
}
