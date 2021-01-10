package com.jfcorugedo.creational.abstractfactory.cruiser;

import java.awt.geom.Point2D;

public abstract class Cruiser {
    protected int shield;
    protected double directionAngle;
    private Point2D currentPosition;

    protected Cruiser(int shield, int x, int y, double initialAngle) {
        this.shield = shield;
        this.directionAngle = initialAngle;
        this.setCurrentPosition(new Point2D.Double(x, y));
    }

    public Point2D getCurrentPosition() {
        return currentPosition;
    }

    protected void setCurrentPosition(Point2D currentPosition) {
        this.currentPosition = currentPosition;
    }

    public double getDirectionAngle() {
        return directionAngle;
    }

    public int getShield() {
        return this.shield;
    }

    public abstract void move();

    public abstract int attack();
}
