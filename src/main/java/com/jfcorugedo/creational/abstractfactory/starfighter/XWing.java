package com.jfcorugedo.creational.abstractfactory.starfighter;


import java.awt.geom.Point2D;

public class XWing {

    private int shield;
    private Point2D currentPosition;
    private double directionAngle;

    public XWing(int shield, int x, int y, double initialAngle) {
        this.shield = shield;
        this.currentPosition = new Point2D.Double(x, y);
        this.directionAngle = initialAngle;
    }

    public int getShield() {
        return shield;
    }

    public void move() {
        double newX = this.currentPosition.getX() + 1458*Math.cos(this.directionAngle);
        double newY = this.currentPosition.getY() + 1458*Math.sin(this.directionAngle);

        this.currentPosition = new Point2D.Double(newX, newY);
    }

    public Point2D getPosition() {
        return this.currentPosition;
    }
}
