package com.jfcorugedo.creational.abstractfactory.starfighter;


import java.awt.geom.Point2D;

public class XWing extends Starfighter{

    private int speedPerRound = 1458;
    private int laserPower;

    public XWing(int shield, int x, int y, double initialAngle, int laserPower) {
        super(shield, x, y, initialAngle);
        this.currentPosition = new Point2D.Double(x, y);
        this.directionAngle = initialAngle;
        this.laserPower = laserPower;
    }

    public int getSpeedPerRound() {
        return this.speedPerRound;
    }

    @Override
    public void move() {
        double newX = this.currentPosition.getX() + getSpeedPerRound() *Math.cos(this.directionAngle);
        double newY = this.currentPosition.getY() + getSpeedPerRound()*Math.sin(this.directionAngle);

        this.currentPosition = new Point2D.Double(newX, newY);
    }

    public int attack() {
        return this.laserPower;
    }
}
