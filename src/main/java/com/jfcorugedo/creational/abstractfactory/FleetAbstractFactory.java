package com.jfcorugedo.creational.abstractfactory;

import com.jfcorugedo.creational.abstractfactory.cruiser.Cruiser;
import com.jfcorugedo.creational.abstractfactory.starfighter.Starfighter;

public interface FleetAbstractFactory {

    Starfighter createStartfighter();

    Cruiser createCruiser(Starfighter... starfighters);
}
