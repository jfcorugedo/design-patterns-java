package com.jfcorugedo.creational.abstractfactory;

import com.jfcorugedo.creational.abstractfactory.starfighter.XWing;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * TDD tests list:
 * - X-Wing Starfighter moves 1458 meters per round (one round is 10 seconds)
 * - X-Wing Starfighter attack produces 4 laser impacts that hits everything in front of it at 1000 meters or less
 * - X-Wing Starfighter has 50 units of shield to protect itself
 */
public class XWingTest {

    /* Lets start with the simplest one following the rule Start Simple */
    @Test
    public void initialShield() {

        XWing xWing = new XWing(50, 0, 0, 0);

        assertThat(xWing.getShield()).isEqualTo(50);
    }

    @Test
    public void moveXWing() {

        XWing xWing = new XWing(50, 0, 0, 0);
        xWing.move();

        assertThat(xWing.getPosition().getX()).isEqualTo(xWing.getSpeedPerRound());
        assertThat(xWing.getPosition().getY()).isZero();
    }

    @Test
    public void attack() {

        XWing xWing = new XWing(50, 0, 0, 0);

        assertThat(xWing.attack()).isEqualTo(4*50);
    }
}
