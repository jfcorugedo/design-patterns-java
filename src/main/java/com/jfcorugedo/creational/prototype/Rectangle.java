package com.jfcorugedo.creational.prototype;

public class Rectangle {

    private int width;

    protected Rectangle(int width) {
        this.width = width;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return 10;
    }
}
