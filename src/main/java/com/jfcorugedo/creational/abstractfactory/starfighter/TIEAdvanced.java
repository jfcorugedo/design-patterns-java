package com.jfcorugedo.creational.abstractfactory.starfighter;

import java.awt.geom.Point2D;

public class TIEAdvanced extends Starfighter{

    private int speedPerRound = 1667;

    public TIEAdvanced(int shield, int x, int y, double initialAngle) {
        super(shield, x, y, initialAngle);
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
        return 100;
    }
}
