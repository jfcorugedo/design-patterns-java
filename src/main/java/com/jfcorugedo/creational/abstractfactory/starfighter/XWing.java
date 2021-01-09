package com.jfcorugedo.creational.abstractfactory.starfighter;

import java.awt.Point;
import java.awt.geom.Point2D;

public class XWing {

    private int shield;
    private Point2D currentPosition;

    public XWing(int shield, int x, int y) {
        this.shield = shield;
        this.currentPosition = new Point(x, y);
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
