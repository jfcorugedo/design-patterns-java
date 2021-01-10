package com.jfcorugedo.creational.abstractfactory.cruiser;

import java.awt.*;
import java.awt.geom.Point2D;

public class ImperialDestroyer {
    private int shield;

    public ImperialDestroyer(int shield) {
        this.shield = shield;
    }

    public int getShield() {
        return this.shield;
    }

    public void move() {
    }

    public Point2D getPosition() {
        return new Point2D.Double(1354, 0);
    }
}
