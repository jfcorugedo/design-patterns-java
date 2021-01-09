package com.jfcorugedo.creational.abstractfactory.starfighter;


import java.awt.geom.Point2D;

public class XWing {

    private int speedPerRound = 1458;
    private int shield;
    private Point2D currentPosition;
    private double directionAngle;

    public XWing(int shield, int x, int y, double initialAngle) {
        this.shield = shield;
        this.currentPosition = new Point2D.Double(x, y);
        this.directionAngle = initialAngle;
    }

    public int getSpeedPerRound() {
        return this.speedPerRound;
    }

    public int getShield() {
        return shield;
    }

    public void move() {
        double newX = this.currentPosition.getX() + getSpeedPerRound() *Math.cos(this.directionAngle);
        double newY = this.currentPosition.getY() + getSpeedPerRound()*Math.sin(this.directionAngle);

        this.currentPosition = new Point2D.Double(newX, newY);
    }

    public Point2D getPosition() {
        return this.currentPosition;
    }

    public int attack() {
        return 200;
    }
}
