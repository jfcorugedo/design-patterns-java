package com.jfcorugedo.creational.abstractfactory.cruiser;

import java.awt.geom.Point2D;

public class NeutronCruiser extends Cruiser {
    private int speedPerRound = 1400;

    public NeutronCruiser(int shield, int x, int y, double initialAngle) {
        super(shield, x, y, initialAngle);
    }

    public int getSpeedPerRound() {
        return this.speedPerRound;
    }

    @Override
    public void move() {
        double newX = this.getCurrentPosition().getX() + getSpeedPerRound() *Math.cos(this.getDirectionAngle());
        double newY = this.getCurrentPosition().getY() + getSpeedPerRound()*Math.sin(this.getDirectionAngle());

        this.setCurrentPosition(new Point2D.Double(newX, newY));
    }

    @Override
    public int attack() {
        return 0;
    }
}
