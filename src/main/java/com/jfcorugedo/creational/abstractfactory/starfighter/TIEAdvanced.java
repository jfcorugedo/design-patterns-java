package com.jfcorugedo.creational.abstractfactory.starfighter;

import java.awt.geom.Point2D;

public class TIEAdvanced extends Starfighter{

    private int speedPerRound = 1667;
    private Point2D currentPosition;
    private double directionAngle;

    public TIEAdvanced(int shield, int x, int y, double initialAngle) {
        super(shield);
        this.currentPosition = new Point2D.Double(x, y);
        this.directionAngle = initialAngle;
    }

    public int getSpeedPerRound() {
        return this.speedPerRound;
    }

    public void move() {
        double newX = this.currentPosition.getX() + getSpeedPerRound() *Math.cos(this.directionAngle);
        double newY = this.currentPosition.getY() + getSpeedPerRound()*Math.sin(this.directionAngle);

        this.currentPosition = new Point2D.Double(newX, newY);
    }

    public Point2D getPosition() {
        return this.currentPosition;
    }
}
