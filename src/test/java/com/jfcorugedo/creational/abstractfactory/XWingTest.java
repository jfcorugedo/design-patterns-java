package com.jfcorugedo.creational.abstractfactory;

import com.jfcorugedo.creational.abstractfactory.starfighter.Starfighter;
import com.jfcorugedo.creational.abstractfactory.starfighter.XWing;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * TDD tests list:
 * - X-Wing Starfighter moves 1458 meters per round (one round is 5 seconds)
 * - X-Wing Starfighter attack produces 4 laser impacts that hits everything in front of it at 1000 meters or less
 * - X-Wing Starfighter has 50 units of shield to protect itself
 */
public class XWingTest {

    /* Lets start with the simplest one following the rule Start Simple */
    @Test
    public void initialShield() {

        Starfighter xWing = new AllianceFleetFactory().createStartfighter();

        assertThat(xWing.getShield()).isEqualTo(50);
    }

    @Test
    public void move() {

        Starfighter xWing = new AllianceFleetFactory().createStartfighter();
        xWing.move();

        assertThat(xWing.getCurrentPosition().getX()).isEqualTo(1458);
        assertThat(xWing.getCurrentPosition().getY()).isZero();
    }

    @Test
    public void attack() {

        XWing xWing = (XWing) new AllianceFleetFactory().createStartfighter();

        assertThat(xWing.attack()).isEqualTo(4*50);
    }
}
