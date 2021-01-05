package com.jfcorugedo.creational.builder;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private List<String> skills;

    public String getName() {
        return this.name;
    }

    public List<String> getSkills() {
        return this.skills;
    }

    public static class PersonBuilder {
        private String name;
        private List<String> skills = new ArrayList<>();

        PersonBuilder(){}

        public Person build() {
            return new Person(this.name, this.skills);
        }

        public PersonBuilder name(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder skill(String skill) {
            this.skills.add(skill);
            return this;
        }
    }

    private Person(String name, List<String> skills) {
        this.name = name;
        this.skills = skills;
    }

    public static PersonBuilder builder() {
        return new PersonBuilder();
    }
}
