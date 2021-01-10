package com.jfcorugedo.creational.abstractfactory.cruiser;

import com.jfcorugedo.creational.abstractfactory.starfighter.Starfighter;

public interface CruiserFactory {

    Cruiser createCruiser(Starfighter... starfighters);
}
