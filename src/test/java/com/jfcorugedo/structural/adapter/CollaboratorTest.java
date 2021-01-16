package com.jfcorugedo.structural.adapter;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CollaboratorTest {

    @Test
    public void name() {

        Collaborator collaborator = Collaborator.builder().name("Juan").build();

        assertThat(collaborator.getName()).isEqualTo("Juan");
    }
}
