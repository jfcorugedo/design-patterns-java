package com.jfcorugedo.creational.abstractfactory.starfighter;

public class AllianceStarfighterFactory implements StarfighterFactory {
    @Override
    public Starfighter createStarfighter() {
        return new XWing(50, 0, 0, 0, 50);
    }
}
