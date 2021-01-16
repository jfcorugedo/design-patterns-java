# Concepts

This pattern allows diferent objects to work together even if there are some incompatibilities between the interface the client is expecting to use.
So this pattern converts the interface of a class into another interface clients expect. 

* **Solve incompatibilities:** Use it when you need to use an existing class, and its interface does not match the one you need.

* **Composition or Inheritance:** It can use both: inheritance (abstraction operations) and composition (delegate objects) to provide this compatibility. However, it is always a good point to use composition over inheritance.

* **Deal with Legacy and libraries:** It is quite useful when you need to deal with legacy code or components of an external library. In those cases you cannot change a the source code of the components you want to use.

A good example inside Java is the Arrays and Lists classes.

# Design

It is very client centric. It helps you integrate new components in an old system or the other way around.

Since it can be implementing by subclassing the expected component, it works very good using composition.

When you need to work with adapters it is very important to find a *narrow* interface, that is, the smallest set of operations you need to implement.
It is easier to adapt an interface with just two operations than an interface with twelve operations.

# Pitfalls

Don't over complicate them. It is intended to make things compatible, but without adding new functionalitiy.

If you need to enrich the object with new features, consider using the Decorator pattern. 
