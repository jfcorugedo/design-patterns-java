package com.jfcorugedo.creational.abstractfactory.cruiser;

import com.jfcorugedo.creational.abstractfactory.starfighter.Starfighter;

public class ImperialCruiserFactory implements CruiserFactory {
    @Override
    public Cruiser createCruiser(Starfighter... starfighters) {
        return new ImperialDestroyer(1000, 0, 0, 0, starfighters);
    }
}
