package com.jfcorugedo.creational.prototype;

public class Rectangle {

    private int width;
    private int height;

    protected Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }
}
