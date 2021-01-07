package com.jfcorugedo.creational.factorymethod;

public class SubmitButton implements Clickable {
    @Override
    public Action click() {
        return new SubmitAction();
    }
}
