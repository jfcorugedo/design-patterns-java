# Concepts

Decouple an abstraction from its implementation so that the two can vary independently.

* **Decouple abstraction and implementation:** When an abstraction can have one of several possible implementations, the usual way to accommodate them is to use inheritance. But this approach isn't always flexible enough. Inheritance binds an implemen- tation to the abstraction permanently, which makes it difficult to modify, extend, and reuse abstractions and implementations independently.

* **Encapsulation, Composition and Inheritance:** It uses these three techniques to decouple interfaces and abstractions from their implementations.

* **Implementation can be selected at runtime:** It is a good pattern when the implementation must be selected or switched at run-time.

* **Changes in abstraction won't affect clients:** Any change in the implementation of an abstraction should have no impact on clients.

* **Avoid exponential grow of your hierarchy:** Use this pattern when you need to extend your feature in some dimensions

A good example inside Java is all the drivers, for example JDBC, that is a bridge between our code (the client) and the implementation (the database).

# Design

It is a bit more complex than the adapter pattern. It uses both composition and inheritance but it also places an emphasis on composition over inheritance.

With this pattern, your application is design to expect changes in both sides: the client and the implementation.

It prevents your code to grow exponential when new types are needed.


# Pitfalls

Don't over complicate them. It is intended to make things compatible, but without adding new functionalitiy.

If you need to enrich the object with new features, consider using the Decorator pattern. 
