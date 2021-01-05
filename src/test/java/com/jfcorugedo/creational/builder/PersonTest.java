package com.jfcorugedo.creational.builder;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * TDD tests list:
 * - Builder can create instances of Person
 * - Builder can set name attribute inside Person instances
 * - Builder can set all the skills of this person
 * - Person instances are immutable
 */
public class PersonTest {

    @Test
    public void builderCanCreatePersonInstances() {

        Person person = Person.builder().build();

        assertThat(person).isNotNull();
    }

    @Test
    public void builderCanSetNameAttribute() {

        Person person = Person.builder().name("Juan").build();

        assertThat(person.getName()).isEqualTo("Juan");
    }
}
