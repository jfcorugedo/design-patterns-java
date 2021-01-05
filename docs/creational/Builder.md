# Concepts

It is a useful pattern to create objects that have a lot of properties and tha are going to be immutable after creation.

* **Handles complex constructors:** By using this pattern you can deal with complex constructors easier.

* **Large number of parameters:** With the fluent api it is easier to deal with objects that need a lot of parameters

* **Force Immutability:** It will help you ensure that instances of this object are going to be immutable.

* **Solve telescoping constructors problem:** Instead of having a lot of overloaded constructors it is better to have a Builder pattern

There are a lot of examples of this pattern inside Java API and frameworks. Just to mention some of them: StringBuilder, Locale.Builder, etc...

# Design

This pattern can solve a common problem when an object has several constructors and we need to call one or another depending on the parametters available.

It usually uses a static inner class to act as a builder.

You can easily use this patter with lombok [@Builder annotation](https://projectlombok.org/features/Builder).

So to create a builder you need to guarantee these properties:
* The resulting instance is immutable
* It calls the appropiate constructor based on the given properties

# Pitfalls

It does not have any big pitfall or drawback.

If we compare it with the Prototype patter, both tries to solve the problem of creating objects with complex constructors or forcing immutability. But Prototype does not rely on constructors, but on cloning objects.
