package com.jfcorugedo.creational.abstractfactory.starfighter;

import com.jfcorugedo.creational.abstractfactory.StarshipFactory;

public interface StarfighterFactory extends StarshipFactory {

    Starfighter createStarfighter();

    @Override
    default boolean canCreate(StarshipType type) {
        return StarshipType.STARFIGHTER.equals(type);
    }
}
