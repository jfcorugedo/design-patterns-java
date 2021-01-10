package com.jfcorugedo.creational.abstractfactory.starfighter;

import java.awt.geom.Point2D;

public class TIEAdvanced extends Starfighter{

    private int speedPerRound = 1667;

    public TIEAdvanced(int shield, int x, int y, double initialAngle, int laserPower) {
        super(shield, x, y, initialAngle, laserPower);
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
        return 2 * this.getLaserPower();
    }
}
