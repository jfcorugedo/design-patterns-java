package com.jfcorugedo.structural.adapter;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EmployeeAdapterTest {

    @Test
    public void collaboratorNameAndSurnameToEmployeefullName() {

        EmployeeAdapter employeeAdapter = EmployeeAdapter.builder(Collaborator.class).adaptee(
                Collaborator.builder().name("Juan").surname("Corugedo").build()
        ).build();

        assertThat(employeeAdapter.getFullName()).isEqualTo("Juan Corugedo");
    }
}
