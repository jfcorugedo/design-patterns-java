package com.jfcorugedo.structural.adapter;

import org.junit.Test;

import java.util.Set;

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
        ).skills(
                (collaborator) -> Set.of(collaborator.getCompetencies().split(","))
        ).build();

        assertThat(employeeAdapter.getSkills()).contains("Java", "javascript", "TDD");
    }

    @Test
    public void collaboratorContactInfoToEmployeeEmail() {

        EmployeeAdapter employeeAdapter = EmployeeAdapter.builder(Collaborator.class).adaptee(
                Collaborator.builder().contactInfo("jfco@patterns.com").build()
        ).email(
                (collaborator) -> Email.builder()
                        .localPart(
                                collaborator.getContactInfo().split("@")[0]
                        ).domain(
                                collaborator.getContactInfo().split("@")[1]
                        ).build()
        ).build();

        assertThat(employeeAdapter.getEmail()).hasToString("jfco@patterns.com");
    }
}
