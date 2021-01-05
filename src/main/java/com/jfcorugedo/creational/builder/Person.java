package com.jfcorugedo.creational.builder;

public class Person {

    public String getName() {
        return null;
    }

    public static class PersonBuilder {
        PersonBuilder(){}
        public Person build() {
            return new Person();
        }

        public PersonBuilder name(String name) {
            return null;
        }
    }

    private Person() {}

    public static PersonBuilder builder() {
        return new PersonBuilder();
    }
}
