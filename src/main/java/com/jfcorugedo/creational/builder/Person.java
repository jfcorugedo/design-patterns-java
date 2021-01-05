package com.jfcorugedo.creational.builder;

import java.util.List;

public class Person {

    private String name;

    public String getName() {
        return this.name;
    }

    public List<String> getSkills() {
        return List.of("Java");
    }

    public static class PersonBuilder {
        private String name;

        PersonBuilder(){}

        public Person build() {
            return new Person(this.name);
        }

        public PersonBuilder name(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder skill(String skill) {
            return this;
        }
    }

    private Person(String name) {this.name = name;}

    public static PersonBuilder builder() {
        return new PersonBuilder();
    }
}
