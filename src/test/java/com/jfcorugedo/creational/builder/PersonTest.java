package com.jfcorugedo.creational.builder;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * TDD tests list:
 * - Builder can create instances of Person
 * - Builder can set name attribute inside Person instances
 * - Builder can set all the skills of this person
 * - Equality of person instances
 * - Person instances are immutable (No idea how to test this)
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

    @Test
    public void builderCanSetSkills() {

        Person person = Person.builder().skill("Java").build();

        assertThat(person.getSkills()).hasSize(1);
        assertThat(person.getSkills()).containsExactly("Java");
    }

    @Test
    public void personInstancesWithSameAttributesAreEquals() {

        assertThat(Person.builder().name("Juan").build()).isEqualTo(Person.builder().name("Juan").build());
        // another assert to triangulate solution
        assertThat(Person.builder().name("Juan").build()).isNotEqualTo(Person.builder().name("Pablo").build());
        // Adds more assert because of a feeling about how equals deals with List attributes
        assertThat(Person.builder().skill("Java").build()).isEqualTo(Person.builder().skill("Java").build());
        assertThat(Person.builder().skill("Java").build()).isNotEqualTo(Person.builder().skill("Javascript").build());
    }
}
