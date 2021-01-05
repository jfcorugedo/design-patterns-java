# Concepts

Specify the kinds of objectsto create using a prototypical instance, and
create new objects by copying this prototype.

It is based on a prototypical instance which is cloned to produce a new instance. 

Use the Prototype pattern when a system should be independent of how its products are created, composed, and represented.

It is often an alternative to Abstract Factory pattern, to avoid building a class hierarchy of factories that parallels the class hierarchy of products.

It is also useful when instances of a class have one of only a few different combinations of state. It may be more convenient to install a corresponding number of prototypes and clone them rather than instantiating the class manually, each time with the appropriate state

* **Avoid costly creation:** By using the prototypical instance creating new objects is easier

* **Does not use 'new':** After creating the prototypical instance it does not longer use new, but it uses clone instead.

* **Construction not handled by client:** The client does not need to know all the values needed to create an instance. The prototypical object is the one knows how to clone itself with proper values.

* **Shallow vs Deep copy:** You need to choose whether or not you need to copy everything (deep copy) or just the immediate properties (shallow), and pass a reference to the same sub objects.

* **Prototype manager:** When the number of prototypes in a system isn't fixed (that is, they can be created and destroyed dynamically), keep a registry of available prototypes. A prototype manager is an associative store that returns the prototype match- ing a given key. It has operations for registering a prototype under a key and for unregistering it. Clients can change or even browse through the registry at run-time. 

The main example inside Java API is Object.clone method.

# Design

This pattern can solve a common problem when an object has several constructors and we need to call one or another depending on the parametters available.

It usually uses a static inner class to act as a builder.

You can easily use this patter with lombok [@Builder annotation](https://projectlombok.org/features/Builder).

So to create a builder you need to guarantee these properties:
* The resulting instance is immutable
* It calls the appropiate constructor based on the given properties

# Pitfalls

The main drawback is that any subclass of Prototype must implement clone method, which may be difficult depending on the nature of the object.
Cicular referencies or objects inside the prototype that does not support clone can make implementing clone method difficult.

You also need to think carefully about when to copy properties of a sub object (deep copy) or when not to do it (Shallow). As a rule, shallow is only recommended if sub objects are Immutable, otherwise it is quite dangerous.

In Java, instead of using Cloneable interface and clone method it is recomended to use a copy constructor:

```
public class MyClass {
  // ...

  /* Copy constructor to make a clone of the given object */
  MyClass (MyClass source) {
    //...
  }
}
```