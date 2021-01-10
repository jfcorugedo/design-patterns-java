package com.jfcorugedo.creational.abstractfactory.cruiser;

import com.jfcorugedo.creational.abstractfactory.StarshipFactory;
import com.jfcorugedo.creational.abstractfactory.starfighter.Starfighter;

public interface CruiserFactory extends StarshipFactory {

    Cruiser createCruiser(Starfighter... starfighters);

    @Override
    default boolean canCreate(StarshipType type) {
        return StarshipType.CRUISER.equals(type);
    }
}
