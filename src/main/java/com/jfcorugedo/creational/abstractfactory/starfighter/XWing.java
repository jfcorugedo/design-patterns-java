package com.jfcorugedo.creational.abstractfactory.starfighter;

import java.awt.Point;
import java.awt.geom.Point2D;

public class XWing {

    private int shield;

    public XWing(int shield) {
        this.shield = shield;
    }

    public int getShield() {
        return shield;
    }

    public void move() {

    }

    public Point2D getPosition() {
        return new Point(1458, 0);
    }
}
