package com.jfcorugedo.structural.adapter;

import lombok.Builder;

import java.util.Set;

@Builder
public class Employee {

    private String firstName;
    private Set<String> skills;

    public String getFullName() {
        return this.firstName;
    }

    public Set<String> getSkills() {
        return this.skills;
    }
}
