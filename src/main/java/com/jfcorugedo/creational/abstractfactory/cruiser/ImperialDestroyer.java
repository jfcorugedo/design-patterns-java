package com.jfcorugedo.creational.abstractfactory.cruiser;

import com.jfcorugedo.creational.abstractfactory.starfighter.Starfighter;

import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ImperialDestroyer extends Cruiser {
    private int speedPerRound = 1354;
    private int ionCannonPower;
    private List<Starfighter> starfighters = new ArrayList<>();

    public ImperialDestroyer(int shield, int x, int y, double initialAngle, Starfighter... starfighters) {
        super(shield, x, y, initialAngle);
        this.ionCannonPower = 500;
        this.starfighters.addAll(List.of(starfighters));
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
        return ionCannonPower;
    }

    @Override
    public Optional<Starfighter> deploy() {
        return Optional.of(this.starfighters.remove(0));
    }
}
