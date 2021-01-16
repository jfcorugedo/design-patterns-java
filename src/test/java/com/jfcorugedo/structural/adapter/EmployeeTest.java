package com.jfcorugedo.structural.adapter;

import org.junit.Test;

import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class EmployeeTest {

    @Test
    public void fullName() {

        Employee employee = CompanyEmployee.builder().fullName("Juan Corugedo").build();

        assertThat(employee.getFullName()).isEqualTo("Juan Corugedo");
    }

    @Test
    public void skills() {

        Employee employee = CompanyEmployee.builder().skills(Set.of("Java",
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

        Employee employee = CompanyEmployee.builder().email(
                Email.builder().localPart("jfco").domain("patterns.com").build()
        ).build();

        assertThat(employee.getEmail()).hasToString("jfco@patterns.com");
    }
}
