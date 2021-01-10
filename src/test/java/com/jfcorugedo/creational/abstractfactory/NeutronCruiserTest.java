package com.jfcorugedo.creational.abstractfactory;

import com.jfcorugedo.creational.abstractfactory.cruiser.AllianceCruiserFactory;
import com.jfcorugedo.creational.abstractfactory.cruiser.Cruiser;
import com.jfcorugedo.creational.abstractfactory.starfighter.AllianceStarfighterFactory;
import com.jfcorugedo.creational.abstractfactory.starfighter.Starfighter;
import com.jfcorugedo.creational.abstractfactory.starfighter.XWing;
import org.junit.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * TDD tests list:
 * - Neutron Cruiser moves 1400 meters per round (one round is 5 seconds)
 * - Neutron Cruiser attack produces an impact of a heavy laser cannon
 * - Neutron Cruiser has 600 units of shield to protect itself
 * - Neutron Cruiser can deploy new Starfighters to the battlefield
 */
public class NeutronCruiserTest {

    /* Lets start with the simplest one following the rule Start Simple */
    @Test
    public void initialShield() {

        Cruiser neutronCruiser = new AllianceCruiserFactory().createCruiser();

        assertThat(neutronCruiser.getShield()).isEqualTo(600);
    }

    @Test
    public void move() {

        Cruiser neutronCruiser = new AllianceCruiserFactory().createCruiser();
        neutronCruiser.move();

        assertThat(neutronCruiser.getCurrentPosition().getX()).isEqualTo(1400);
        assertThat(neutronCruiser.getCurrentPosition().getY()).isZero();
    }

    @Test
    public void attack() {

        Cruiser neutronCruiser = new AllianceCruiserFactory().createCruiser();

        assertThat(neutronCruiser.attack()).isEqualTo(250);
    }

    @Test
    public void deploy() {

        Cruiser neutronCruiser = new AllianceCruiserFactory().createCruiser( new AllianceStarfighterFactory().createStartfighter());

        Optional<Starfighter> starfighter = neutronCruiser.deploy();

        assertThat(starfighter)
                .isNotEmpty()
                .containsInstanceOf(XWing.class);
    }
}
