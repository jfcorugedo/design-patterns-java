package com.jfcorugedo.structural.adapter;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EmployeeAdapterTest {

    @Test
    public void collaboratorNameAndSurnameToEmployeeFullName() {

        EmployeeAdapter employeeAdapter = EmployeeAdapter.builder(Collaborator.class).adaptee(
                Collaborator.builder().name("Juan").surname("Corugedo").build()
        ).fullNameAdapter(
                (collaborator) -> String.format("%s %s", collaborator.getName(), collaborator.getSurname())
        ).build();

        assertThat(employeeAdapter.getFullName()).isEqualTo("Juan Corugedo");
    }

    @Test
    public void collaboratorCompetencesToEmployeeSkills() {

        EmployeeAdapter employeeAdapter = EmployeeAdapter.builder(Collaborator.class).adaptee(
                Collaborator.builder().competencies("Java,javascript,TDD").build()
        ).build();

        assertThat(employeeAdapter.getSkills()).contains("Java", "javascript", "TDD");
    }
}
