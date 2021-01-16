package com.jfcorugedo.structural.adapter;

import java.util.Set;
import java.util.function.Function;

public class EmployeeAdapter<T> implements Employee {

    private T adaptee;
    private Function<T, String> fullNameAdapter;
    private Function<T, Set<String>> skills;
    private Function<T, Email> email;

    EmployeeAdapter(T adaptee, Function<T, String> fullNameAdapter, Function<T, Set<String>> skills, Function<T, Email> email) {
        this.adaptee = adaptee;
        this.fullNameAdapter = fullNameAdapter;
        this.skills = skills;
        this.email = email;
    }

    public static <T> EmployeeAdapterBuilder<T> builder(Class<T> clazz) {
        return new EmployeeAdapterBuilder<>();
    }

    @Override
    public String getFullName() {
        return fullNameAdapter.apply(adaptee);
    }

    @Override
    public Set<String> getSkills() {
        return skills.apply(adaptee);
    }

    @Override
    public Email getEmail() {
        return email.apply(adaptee);
    }

    public static class EmployeeAdapterBuilder<T> {
        private T adaptee;
        private Function<T, String> fullNameAdapter;
        private Function<T, Set<String>> skills;
        private Function<T, Email> email;

        EmployeeAdapterBuilder() {
        }

        public EmployeeAdapterBuilder<T> adaptee(T adaptee) {
            this.adaptee = adaptee;
            return this;
        }

        public EmployeeAdapterBuilder<T> fullNameAdapter(Function<T, String> fullNameAdapter) {
            this.fullNameAdapter = fullNameAdapter;
            return this;
        }

        public EmployeeAdapterBuilder<T> skills(Function<T, Set<String>> skills) {
            this.skills = skills;
            return this;
        }

        public EmployeeAdapterBuilder<T> email(Function<T, Email> email) {
            this.email = email;
            return this;
        }

        public EmployeeAdapter<T> build() {
            return new EmployeeAdapter<>(adaptee, fullNameAdapter, skills, email);
        }
    }
}
