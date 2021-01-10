package com.jfcorugedo.creational.abstractfactory.cruiser;

import java.awt.geom.Point2D;

public class ImperialDestroyer {
    private int shield;
    private int speedPerRound = 1354;
    private Point2D currentPosition;
    private double directionAngle;
    private int ionCannonPower;

    public ImperialDestroyer(int shield, int x, int y, double initialAngle) {
        this.shield = shield;
        this.setCurrentPosition(new Point2D.Double(x, y));
        this.directionAngle = initialAngle;
        this.ionCannonPower = 500;
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

    public int getSpeedPerRound() {
        return this.speedPerRound;
    }

    public void move() {
        double newX = this.getCurrentPosition().getX() + getSpeedPerRound() *Math.cos(this.getDirectionAngle());
        double newY = this.getCurrentPosition().getY() + getSpeedPerRound()*Math.sin(this.getDirectionAngle());

        this.setCurrentPosition(new Point2D.Double(newX, newY));
    }

    public int attack() {
        return ionCannonPower;
    }
}
