package com.jfcorugedo.creational.abstractfactory;

import com.jfcorugedo.creational.abstractfactory.cruiser.Cruiser;
import com.jfcorugedo.creational.abstractfactory.cruiser.CruiserFactory;
import com.jfcorugedo.creational.abstractfactory.cruiser.ImperialCruiserFactory;
import com.jfcorugedo.creational.abstractfactory.starfighter.ImperialStarfighterFactory;
import com.jfcorugedo.creational.abstractfactory.starfighter.Starfighter;
import com.jfcorugedo.creational.abstractfactory.starfighter.StarfighterFactory;

import java.util.List;

public class ImperialFleetFactory implements FleetAbstractFactory {

    private List<StarshipFactory> factories = List.of(
            new ImperialStarfighterFactory(),
            new ImperialCruiserFactory()
    );

    @Override
    public Starfighter createStartfighter() {
        return ((StarfighterFactory)factories.stream()
                .filter( factory -> factory.canCreate(StarshipFactory.StarshipType.STARFIGHTER))
                .findAny()
                .get())
                .createStarfighter();
    }

    @Override
    public Cruiser createCruiser(Starfighter... starfighters) {
        return ((CruiserFactory)factories.stream()
                .filter( factory -> factory.canCreate(StarshipFactory.StarshipType.CRUISER))
                .findAny()
                .get())
                .createCruiser(starfighters);
    }
}
