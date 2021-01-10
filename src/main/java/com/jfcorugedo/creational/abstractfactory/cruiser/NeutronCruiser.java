package com.jfcorugedo.creational.abstractfactory.cruiser;

public class NeutronCruiser extends Cruiser {
    public NeutronCruiser(int shield, int x, int y, double initialAngle) {
        super(shield, x, y, initialAngle);
    }

    @Override
    public void move() {

    }

    @Override
    public int attack() {
        return 0;
    }
}
