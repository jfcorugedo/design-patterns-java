package com.jfcorugedo.creational.factorymethod;

import com.jfcorugedo.creational.factorymethod.behaviours.Clickable;

public abstract class ClickableFactory {

    public abstract Clickable createClickable(Clickable.Type type);
}
