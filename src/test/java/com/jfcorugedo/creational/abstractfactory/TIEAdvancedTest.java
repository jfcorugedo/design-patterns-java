package com.jfcorugedo.creational.abstractfactory;

import com.jfcorugedo.creational.abstractfactory.starfighter.ImperialStarfighterFactory;
import com.jfcorugedo.creational.abstractfactory.starfighter.Starfighter;
import com.jfcorugedo.creational.abstractfactory.starfighter.TIEAdvanced;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * TDD tests list:
 * - TIE Advanced Starfighter moves 1667 meters per round (one round is 5 seconds)
 * - TIE Advanced Starfighter attack produces 2 laser impacts that hits everything in front of it at 1000 meters or less
 * - TIE Advanced Starfighter has no units of shield to protect itself
 */
public class TIEAdvancedTest {

    /* Lets start with the simplest one following the rule Start Simple */
    @Test
    public void initialShield() {

        Starfighter tieAdvanced = new ImperialStarfighterFactory().createStartfighter();

        assertThat(tieAdvanced.getShield()).isZero();
    }

    @Test
    public void move() {

        Starfighter tieAdvanced = new ImperialStarfighterFactory().createStartfighter();
        tieAdvanced.move();

        assertThat(tieAdvanced.getPosition().getX()).isEqualTo(1667);
        assertThat(tieAdvanced.getPosition().getY()).isZero();
    }
}
