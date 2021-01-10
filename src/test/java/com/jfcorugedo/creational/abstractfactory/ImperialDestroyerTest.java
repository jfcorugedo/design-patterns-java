package com.jfcorugedo.creational.abstractfactory;

import com.jfcorugedo.creational.abstractfactory.cruiser.ImperialDestroyer;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * TDD tests list:
 * - Imperial Destroyer Cruiser moves 1354 meters per round (one round is 5 seconds)
 * - Imperial Destroyer Cruiser attack produces an impact of a heavy ion cannon
 * - Imperial Destroyer Cruiser has 1000 units of shield to protect itself
 * - Imperial Destroyer Cruiser can deploy new Starfighters to the battlefield
 */
public class ImperialDestroyerTest {

    /* Lets start with the simplest one following the rule Start Simple */
    @Test
    public void initialShield() {

        ImperialDestroyer imperialDestroyer = new ImperialDestroyer(1000);

        assertThat(imperialDestroyer.getShield()).isEqualTo(1000);
    }
}
