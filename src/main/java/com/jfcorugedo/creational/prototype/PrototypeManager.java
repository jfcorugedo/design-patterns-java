package com.jfcorugedo.creational.prototype;

public class PrototypeManager {

    private PrototypeManager() {}

    public static Rectangle buildRectangle() {
        return new Rectangle(20, 10);
    }
}
