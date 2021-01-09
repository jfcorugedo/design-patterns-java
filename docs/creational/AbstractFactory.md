# Concepts

It provides an interface for creating families of related or dependent objects without specifying their concrete classes. 

It defines an interface for creating an object, but let subclasses decide which class to instantiate. 

* **Does not expose instantiation logic:** The client does not need to know how the objects are created, just requests them.

* **Defer to subclasses:** This pattern is very common when a class can't anticipate the class of objects it must create. To solve the problem, this class delegates responsability of creation to one or several helper subclasses.

* **Common interface:** It advocates the OOP principle "Program to an interface, not an implementation". To be able to use the new objects without actually knowing the current implementation, all the created objects needs to implement a common interface.

* **Provides hooks for subclasses:** Creating objects inside a class with a factory method is always more flexible than creating an object directly. Factory Method gives subclasses a hook for providing an extended version of an object.

* **Family of objects:** It helps you enforce a family of related products are used together.

* **Easy to change the whole families:** Due to all the factories of each family is created inside abstract factory, it is easy to change all of them by changing the abstract factory implementation. 


There are a lot of examples of this pattern inside Java API and frameworks. Just to mention some of them: Calendar (which is not a Singleton), ResourceBundle, NumberFormat, etc...

Inside Spring, the beans are created following a Singleton pattern by default (instead of Prototype), so only one instance of each bean will exist inside Spring context.

# Design

The concrete implementation of the abstract factory is usually a singleton, since there is no need of having more than one instance of this class.

It groups a collection of factories together, and each factory is in charge of creating a type of product.

Each object produced must implement a common interface, so the client does not need to worry about the concrete class created.

It is pretty common to use Factory Method pattern to implement the factories created for each type of object. So there will be a factory of factories and one or more factories of objects.

So to create an Abstract Factory you need to guarantee these properties:
* There is a common interface that allow clients to create any kind of products of the given family
* There is a common interface inside each product type, so the client no need to worry about implementations
* There might be more than one implemetation of the abstract factory, with its own factories for each type of object created
* The clients know nothing about the creation process of the instances
* Each instance should be a new object (instead of Singleton pattern)

# Pitfalls

It is a bit complex compared with Prototype or Singleton. It requires more classes and relations that the previous ones.

Adding a new type of family is difficult. You need to change the abstract factory to add a new factory for this family of objects and deal with the default behaviour of the already created instances of abstract factory.

Regarding Factory Method, from implementation point of view, the key difference between the factory method and abstract factory patterns is that factory method is just a method to create objects of a single type, while abstract factory is an object to create families of objects. It is some kind of factory of factories.
