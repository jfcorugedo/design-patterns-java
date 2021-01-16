package com.jfcorugedo.structural.adapter;

import org.junit.Test;

import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class EmployeeTest {

    @Test
    public void fullName() {

        Employee employee = Employee.builder().fullName("Juan Corugedo").build();

        assertThat(employee.getFullName()).isEqualTo("Juan Corugedo");
    }

    @Test
    public void skills() {

        Employee employee = Employee.builder().skills(Set.of("Java",
                "Javascript",
                "TDD",
                "micronaut",
                "Reactive microservices",
                "web components")).build();

        assertThat(employee.getSkills()).contains(
                "Java",
                "Javascript",
                "TDD",
                "micronaut",
                "Reactive microservices",
                "web components"
        );
    }

    @Test
    public void email() {

        Employee employee = Employee.builder().email(
                Email.builder().localPart("jfco").domain("patterns.com").build()
        ).build();

        assertThat(employee.getEmail()).hasToString("jfco@patterns.com");
    }
}
