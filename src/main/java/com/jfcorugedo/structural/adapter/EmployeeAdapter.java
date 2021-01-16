package com.jfcorugedo.structural.adapter;

import java.util.Set;
import java.util.function.Function;

public class EmployeeAdapter<T> implements Employee {

    private T adaptee;
    private Function<T, String> fullNameAdapter;

    EmployeeAdapter(T adaptee, Function<T, String> fullNameAdapter) {
        this.adaptee = adaptee;
        this.fullNameAdapter = fullNameAdapter;
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
        return null;
    }

    @Override
    public Email getEmail() {
        return null;
    }

    public static class EmployeeAdapterBuilder<T> {
        private T adaptee;
        private Function<T, String> fullNameAdapter;

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

        public EmployeeAdapter<T> build() {
            return new EmployeeAdapter<>(adaptee, fullNameAdapter);
        }

        public String toString() {
            return "EmployeeAdapter.EmployeeAdapterBuilder(adaptee=" + this.adaptee + ", fullNameAdapter=" + this.fullNameAdapter + ")";
        }
    }
}
