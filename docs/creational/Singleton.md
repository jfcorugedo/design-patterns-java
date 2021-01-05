# Concepts

Ensure a class only has one instance, and provide a global point of access to it.

* **Only one instance:** This pattern guarantees that only one instance of the given object will be created.

* **Control:** In addition, it also guarantees the control of the resource. Only one entity knows how to create the object: the object itself.

* **Lazily loaded:** I might be lazily loaded, so the instance will be created only when needed

There are a lot of examples of this pattern inside Java API and frameworks. Just to mention some of them: Runtime, Logger, etc...

Inside Spring, the beans are created following a Singleton pattern by default (instead of Prototype), so only one instance of each bean will exist inside Spring context.

# Design

The class is responsible for its lifecycle.

It has a static nature, but it is not recommended coding this pattern using static classes, since we want this singleton instance to be thread safe, and static classes does not guarantee that.

In Java it is pretty common to code this pattern using a private instance of the object inside the class as well as a private constructor.

To get the instance of the singleton there is an static method, and it should not require any parameter. Otherwise we were implementing a factory pattern, instead of a Singleton.

So to create a singleton you need to guarantee these properties:
* No one can create an instance, but the singleton class
* Only one instance should be created no mather who is accessing it
* It can be lazily loaded
* It must be thread safe

# Pitfalls

It is often overused. Keep in mind that this kind of objects cannot represent a domain object, since it will be just one instance and its status will be shared among all the threads.

It cannot have an interface, and it is not a very flexible object. It is useful to have a set of pure functions that are very correlated grouped in an object.
 
It is sometimes confused for a Factory. A singleton always returns the same instance, but a factory returns new instances (Prototype).

Some objects that look like a singleton are no singleton in fact. For example java.util.Calendar is not a singleton, since it returns a new instance every time you call getInstance method.
