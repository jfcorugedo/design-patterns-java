package com.jfcorugedo.creational.abstractfactory.starfighter;

import java.awt.geom.Point2D;

public abstract class Starfighter {
    private int shield;
    private Point2D currentPosition;
    private double directionAngle;
    private int laserPower;

    protected Starfighter(int shield, int x, int y, double initialAngle, int laserPower) {
        this.shield = shield;
        this.setCurrentPosition(new Point2D.Double(x, y));
        this.directionAngle = initialAngle;
        this.laserPower = laserPower;
    }

    public Point2D getCurrentPosition() {
        return currentPosition;
    }

    public double getDirectionAngle() {
        return directionAngle;
    }

    public int getLaserPower() {
        return laserPower;
    }

    public int getShield() {
        return shield;
    }

    public Point2D getPosition() {
        return this.getCurrentPosition();
    }

    public abstract void move();

    public abstract int attack();

    protected void setCurrentPosition(Point2D currentPosition) {
        this.currentPosition = currentPosition;
    }
}
