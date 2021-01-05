package com.jfcorugedo.creational.prototype;

public class PrototypeManager {

    private static final Rectangle RECTANGLE_PROTOTYPE = new Rectangle(20, 10);

    private PrototypeManager() {}

    public static Rectangle buildRectangle() {
        return new Rectangle(RECTANGLE_PROTOTYPE);
    }
}
