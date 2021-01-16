package com.jfcorugedo.structural.adapter;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EmployeeTest {

    @Test
    public void fullName() {

        Employee employee = Employee.builder().firstName("Juan Corugedo").build();

        assertThat(employee.getFullName()).isEqualTo("Juan Corugedo");
    }
}
