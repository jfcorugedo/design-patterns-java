package com.jfcorugedo.creational.builder;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PersonTest {

    @Test
    public void builderCanCreatePersonInstances() {

        Person person = Person.builder().build();

        assertThat(person).isNotNull();
    }
}
