package com.jfcorugedo.creational.factorymethod;

import com.jfcorugedo.creational.factorymethod.behaviours.Clickable;
import com.jfcorugedo.creational.factorymethod.buttons.PopupButton;
import com.jfcorugedo.creational.factorymethod.buttons.SubmitButton;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class ButtonFactory {

    private Map<Clickable.Type, Supplier<Clickable>> buttons = new HashMap<>();

    public ButtonFactory() {
        buttons.put(Clickable.Type.SUBMIT, () -> new SubmitButton());
        buttons.put(Clickable.Type.POPUP, () -> new PopupButton());
    }

    public Clickable createClickable(Clickable.Type type) {

        return buttons.get(type).get();
    }
}
