package com.jfcorugedo.structural.adapter;

import org.junit.Test;

import java.util.HashSet;

import static org.assertj.core.api.Assertions.assertThat;

public class EmployeeTest {

    @Test
    public void fullName() {

        Employee employee = Employee.builder().firstName("Juan Corugedo").build();

        assertThat(employee.getFullName()).isEqualTo("Juan Corugedo");
    }

    @Test
    public void skills() {

        Employee employee = Employee.builder().skills("Java",
                "Javascript",
                "TDD",
                "micronaut",
                "Reactive microservices",
                "web components").build();

        assertThat(employee.getSkills()).containsSequence(
                "Java",
                "Javascript",
                "TDD",
                "micronaut",
                "Reactive microservices",
                "web components"
        );
    }
}
