package com.jfcorugedo.creational.abstractfactory;

public interface StarshipFactory {

    enum StarshipType {
        STARFIGHTER, CRUISER
    }

    boolean canCreate(StarshipType type);
}
