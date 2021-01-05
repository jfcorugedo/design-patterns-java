package com.jfcorugedo.creational.prototype;

public class Rectangle {

    private int width;
    private int height;

    protected Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    /*
     * Copy constructor used to simulate the behaviour of Object#clone operation
     */
    protected Rectangle(Rectangle rectangle) {
        this.width = rectangle.getWidth();
        this.height = rectangle.getHeight();
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }
}
