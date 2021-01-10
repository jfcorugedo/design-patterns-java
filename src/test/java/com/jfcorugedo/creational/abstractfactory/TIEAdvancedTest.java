package com.jfcorugedo.creational.abstractfactory;

import com.jfcorugedo.creational.abstractfactory.starfighter.*;
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

        Starfighter tieAdvanced = new ImperialFleetFactory().createStartfighter();

        assertThat(tieAdvanced.getShield()).isZero();
    }

    @Test
    public void move() {

        Starfighter tieAdvanced = new ImperialFleetFactory().createStartfighter();
        tieAdvanced.move();

        assertThat(tieAdvanced.getCurrentPosition().getX()).isEqualTo(1667);
        assertThat(tieAdvanced.getCurrentPosition().getY()).isZero();
    }

    @Test
    public void attack() {

        Starfighter tieAdvanced = new ImperialFleetFactory().createStartfighter();

        assertThat(tieAdvanced.attack()).isEqualTo(2*50);
    }
}
