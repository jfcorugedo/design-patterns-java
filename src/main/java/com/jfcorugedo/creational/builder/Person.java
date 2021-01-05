package com.jfcorugedo.creational.builder;

public class Person {

    private String name;

    public String getName() {
        return this.name;
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
    }

    private Person(String name) {this.name = name;}

    public static PersonBuilder builder() {
        return new PersonBuilder();
    }
}
