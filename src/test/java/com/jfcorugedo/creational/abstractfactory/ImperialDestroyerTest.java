package com.jfcorugedo.creational.abstractfactory;

import com.jfcorugedo.creational.abstractfactory.cruiser.Cruiser;
import com.jfcorugedo.creational.abstractfactory.cruiser.ImperialDestroyer;
import com.jfcorugedo.creational.abstractfactory.starfighter.ImperialStarfighterFactory;
import com.jfcorugedo.creational.abstractfactory.starfighter.Starfighter;
import com.jfcorugedo.creational.abstractfactory.starfighter.TIEAdvanced;
import org.junit.Test;

import java.util.Optional;

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

        Cruiser imperialDestroyer = new ImperialDestroyer(1000, 0, 0, 0);

        assertThat(imperialDestroyer.getShield()).isEqualTo(1000);
    }

    @Test
    public void move() {

        Cruiser imperialDestroyer = new ImperialDestroyer(1000, 0, 0, 0);
        imperialDestroyer.move();

        assertThat(imperialDestroyer.getCurrentPosition().getX()).isEqualTo(1354);
        assertThat(imperialDestroyer.getCurrentPosition().getY()).isZero();
    }

    @Test
    public void attack() {

        Cruiser imperialDestroyer = new ImperialDestroyer(1000, 0, 0, 0);

        assertThat(imperialDestroyer.attack()).isEqualTo(500);
    }

    @Test
    public void deploy() {

        ImperialDestroyer imperialDestroyer = new ImperialDestroyer(1000, 0, 0, 0, new ImperialStarfighterFactory().createStartfighter());

        Optional<Starfighter> starfighter = imperialDestroyer.deploy();

        assertThat(starfighter)
                .isNotEmpty()
                .containsInstanceOf(TIEAdvanced.class);
    }
}
