package com.jfcorugedo.creational.factorymethod.behaviours;

import com.jfcorugedo.creational.factorymethod.actions.Action;

public interface Clickable {
    Action click();

    public enum Type {SUBMIT, INPUT_TEXT, POPUP}
}
