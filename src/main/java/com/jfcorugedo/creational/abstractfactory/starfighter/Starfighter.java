package com.jfcorugedo.creational.abstractfactory.starfighter;

public abstract class Starfighter {
    protected int shield;

    public Starfighter(int shield) {
        this.shield = shield;
    }

    public int getShield() {
        return shield;
    }
}
