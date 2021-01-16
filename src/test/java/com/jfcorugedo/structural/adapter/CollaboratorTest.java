package com.jfcorugedo.structural.adapter;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CollaboratorTest {

    @Test
    public void name() {

        Collaborator collaborator = Collaborator.builder().name("Juan").build();

        assertThat(collaborator.getName()).isEqualTo("Juan");
    }

    @Test
    public void surename() {

        Collaborator collaborator = Collaborator.builder().surname("Corugedo").build();

        assertThat(collaborator.getSurname()).isEqualTo("Corugedo");
    }

    @Test
    public void competencies() {

        Collaborator collaborator = Collaborator.builder().competencies("Java,javascript,TDD").build();

        assertThat(collaborator.getCompetencies()).isEqualTo("Java,javascript,TDD");
    }
}
