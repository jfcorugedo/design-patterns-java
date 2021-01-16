package com.jfcorugedo.structural.adapter;

import lombok.Builder;
import lombok.Getter;

import java.util.Set;

@Builder
@Getter
public class Employee {

    private String fullName;
    private Set<String> skills;
    private Email email;
}
