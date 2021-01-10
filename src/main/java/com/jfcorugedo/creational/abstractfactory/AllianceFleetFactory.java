package com.jfcorugedo.creational.abstractfactory;

import com.jfcorugedo.creational.abstractfactory.cruiser.AllianceCruiserFactory;
import com.jfcorugedo.creational.abstractfactory.cruiser.Cruiser;
import com.jfcorugedo.creational.abstractfactory.cruiser.CruiserFactory;
import com.jfcorugedo.creational.abstractfactory.starfighter.AllianceStarfighterFactory;
import com.jfcorugedo.creational.abstractfactory.starfighter.Starfighter;
import com.jfcorugedo.creational.abstractfactory.starfighter.StarfighterFactory;

import java.util.List;

public class AllianceFleetFactory implements FleetAbstractFactory {

    private List<StarshipFactory> factories = List.of(
            new AllianceStarfighterFactory(),
            new AllianceCruiserFactory()
    );

    @Override
    public Starfighter createStartfighter() {
        return ((StarfighterFactory)factories.stream()
                .filter( factory -> factory.canCreate(StarshipFactory.StarshipType.STARFIGHTER))
                .findAny()
                .get())
                .createStartfighter();
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
