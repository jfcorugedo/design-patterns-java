package com.jfcorugedo.creational.factorymethod;

import com.jfcorugedo.creational.factorymethod.actions.NoAction;
import com.jfcorugedo.creational.factorymethod.behaviours.Clickable;

public abstract class ClickableFactory {

    public Clickable createClickable(Clickable.Type type) {
        return NoAction::new;
    }
}
