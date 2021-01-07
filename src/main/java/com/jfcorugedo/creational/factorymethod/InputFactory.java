package com.jfcorugedo.creational.factorymethod;

import com.jfcorugedo.creational.factorymethod.behaviours.Clickable;
import com.jfcorugedo.creational.factorymethod.inputs.InputText;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public class InputFactory {

    private Map<Clickable.Type, Supplier<Clickable>> inputs = new EnumMap<>(Clickable.Type.class);

    public InputFactory() {
        inputs.put(Clickable.Type.INPUT_TEXT, InputText::new);
    }

    public Clickable createClickable(Clickable.Type type) {
        return inputs.get(type).get();
    }
}
