# Concepts

This pattern allows the client to create objects with a given responsibility (follows a common interface) without having to define in advance the concrete implementation. 

It defines an interface for creating an object, but let subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses.

* **Does not expose instantiation logic:** The client does not need to know how the objects are created, just requests them.

* **Defer to subclasses:** This pattern is very common when a class can't anticipate the class of objects it must create. To solve the problem, this class delegates responsability of creation to one or several helper subclasses.

* **Common interface:** It advocates the OOP principle "Program to an interface, not an implementation". To be able to use the new objects without actually knowing the current implementation, all the created objects needs to implement a common interface.

* **Provides hooks for subclasses:** Creating objects inside a class with a factory method is always more flexible than creating an object directly. Factory Method gives subclasses a hook for providing an extended version of an object.

* **Specified by an architecture/framework, implemented by the user:** It is a quite well-known pattern in frameworks and architectures, where the framework cannot know in advance the specific concrete class to instantiate. It is in charge of the user of the framework to instantiate the implementation it wants. 


There are a lot of examples of this pattern inside Java API and frameworks. Just to mention some of them: Calendar (which is not a Singleton), ResourceBundle, NumberFormat, etc...

Inside Spring, the beans are created following a Singleton pattern by default (instead of Prototype), so only one instance of each bean will exist inside Spring context.

# Design

Factory is responsible for the lifecycle of the created instances.

The instances created must implement a common interface so clients can use them without needing to know the current implementation.

For example, you can use a Calendar instance without worrying about whether it is a GregorianCalendar or something else.

There are two major varieties: The one in which the factory is abstract and the must be at least one implementation of the factory that knows how to create instances. The other one is a concrete factory which has a default implementation of the factory method. So you can use that implementation or subclass the factory and override that method to create your own implementations.

It is pretty common to have the factory method parameterized, so clients can give information that helps factory decide which implementation should be created. 

So to create a factory method you need to guarantee these properties:
* There is a common interface that defines the operations of a specific object
* There is a method that returns implementations of that interface in an abstract factory
* There must be at least one implementation of that abstract factory that knows how to create instances of the given interface
* The clients know nothing about the creation process of the instances
* Each instance should be a new object (instead of Singleton pattern)

# Pitfalls

It is a bit complex compared with Prototype or Singleton. It requires more classes and relations that the previous ones.

One of the common mistakes implementing this pattern is that you don't have to code the factory method at the first time. Subclasses of the factory are the ones in charge of implementing the abstract factory method.

And that is a potential disadvantage of factory methods, because clients might have to subclass the Factory class just to create a particular implementation of the given interface. 

It is not easy to change some existing code to use this pattern. It should be a patter to be considered from the very beginning. 

It is the opposite pattern of a Singleton. Instead of returning always the same instance, it returns a new instance every time.

Regarding Abstract Factory, from implementation point of view, the key difference between the factory method and abstract factory patterns is that factory method is just a method to create objects of a single type, while abstract factory is an object to create families of objects.
