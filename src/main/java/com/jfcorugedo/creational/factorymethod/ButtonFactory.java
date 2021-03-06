package com.jfcorugedo.creational.factorymethod;

import com.jfcorugedo.creational.factorymethod.behaviours.Clickable;
import com.jfcorugedo.creational.factorymethod.buttons.PopupButton;
import com.jfcorugedo.creational.factorymethod.buttons.SubmitButton;

import java.util.EnumMap;
import java.util.function.Supplier;

public class ButtonFactory extends ClickableFactory {

    private EnumMap<Clickable.Type, Supplier<Clickable>> buttons = new EnumMap<>(Clickable.Type.class);

    public ButtonFactory() {
        buttons.put(Clickable.Type.SUBMIT, SubmitButton::new);
        buttons.put(Clickable.Type.POPUP, PopupButton::new);
    }

    @Override
    public Clickable createClickable(Clickable.Type type) {

        return buttons.getOrDefault(type, () -> super.createClickable(type)).get();
    }
}
