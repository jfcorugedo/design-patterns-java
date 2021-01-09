package com.jfcorugedo.creational.abstractfactory;

import com.jfcorugedo.creational.abstractfactory.starfighter.AllianceStarfighterFactory;
import com.jfcorugedo.creational.abstractfactory.starfighter.TIEAdvanced;
import com.jfcorugedo.creational.abstractfactory.starfighter.XWing;
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

        TIEAdvanced tieAdvanced = new TIEAdvanced(0);

        assertThat(tieAdvanced.getShield()).isEqualTo(0);
    }

    @Test
    public void move() {

        TIEAdvanced tieAdvanced = new TIEAdvanced(0, 0, 0);
        tieAdvanced.move();

        assertThat(tieAdvanced.getPosition().getX()).isEqualTo(tieAdvanced.getSpeedPerRound());
        assertThat(tieAdvanced.getPosition().getY()).isZero();
    }
}
