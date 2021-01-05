package com.jfcorugedo.creational.builder;

public class Person {

    public static class PersonBuilder {
        PersonBuilder(){}
        public Person build() {
            return new Person();
        }
    }

    private Person() {}

    public static PersonBuilder builder() {
        return new PersonBuilder();
    }
}
