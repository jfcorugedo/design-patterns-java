package com.jfcorugedo.creational.abstractfactory.starfighter;

import java.awt.geom.Point2D;

public abstract class Starfighter {
    protected int shield;
    protected Point2D currentPosition;
    protected double directionAngle;

    protected Starfighter(int shield, int x, int y, double initialAngle) {
        this.shield = shield;
        this.currentPosition = new Point2D.Double(x, y);
        this.directionAngle = initialAngle;
    }

    public int getShield() {
        return shield;
    }

    public Point2D getPosition() {
        return this.currentPosition;
    }

    public abstract void move();
}
