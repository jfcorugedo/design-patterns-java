package com.jfcorugedo.creational.abstractfactory.starfighter;

public class ImperialStarfighterFactory implements StarfighterFactory {
    @Override
    public Starfighter createStarfighter() {
        return new TIEAdvanced(0, 0, 0, 0, 50);
    }
}
