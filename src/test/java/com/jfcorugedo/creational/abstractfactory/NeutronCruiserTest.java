package com.jfcorugedo.creational.abstractfactory;

import com.jfcorugedo.creational.abstractfactory.cruiser.Cruiser;
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

        Cruiser imperialDestroyer = new NeutronCruiser(600);

        assertThat(imperialDestroyer.getShield()).isEqualTo(600);
    }
}
