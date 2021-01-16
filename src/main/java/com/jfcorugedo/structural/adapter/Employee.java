package com.jfcorugedo.structural.adapter;

import lombok.Builder;

@Builder
public class Employee {

    private String firstName;

    public String getFullName() {
        return this.firstName;
    }
}
