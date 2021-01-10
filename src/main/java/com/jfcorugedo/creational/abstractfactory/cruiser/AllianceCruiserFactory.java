package com.jfcorugedo.creational.abstractfactory.cruiser;

import com.jfcorugedo.creational.abstractfactory.starfighter.Starfighter;

public class AllianceCruiserFactory implements CruiserFactory {
    @Override
    public Cruiser createCruiser(Starfighter... starfighters) {
        return new NeutronCruiser(600, 0, 0, 0, starfighters);
    }
}
