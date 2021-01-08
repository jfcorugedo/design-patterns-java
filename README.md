# Design Patterns (java implementation) following TDD

This repository contains all the design patterns described by the gang of four, coded using Java.

## Why did I create this repository?

I've been using design patterns for a lot of years, but I decided to create this repository **to practice TDD creating all of them**.

## A few words about Test Driven Development

The main goal of TDD is quite simple: 

*Try to deliver only Clean code that works*

However, every software engineer knows that this is not always an easy task. 

Deadlines, complex features, accidental complexity, lack of automatic tests, poor designs... are only a handful of things that can ruin your objective.

TDD try to get to this goal using a simple but disrupting technique: start thinking about the automatic tests before coding a single line of the feature.

In fact its process consists on a loop of three states: **red**, **green** and **refactor**.

To see these steps in more detail:

1. Write a test 
2. Make it compile 
3. Run it to see that it fails 
4. Make it run 
5. Remove duplication 

So you need to start writing the test, even if it does not compile!

To be honest it made me crazy the first time it tried this approach. For a long time I've been codign the logic first, and the automatic tests.

However, this approach has some drawbacks: Some times your business code is hard to be tested, just because you didn't thing about testing when you write it. Other times it is overcomplicated, just because you were thinking about some future needs that you really don't know if they are going to be need or not.

I finally realized that the problems I found trying to code automatic tests are in fact design problems in my code, and I need to address them in advance.

That's the reason I read this fantastic book: *Test-Driven Development By Example* written by Kent Beck. It is an amazing book, very easy to read since it follows a practical example.

I started to follow these principles, and I need to say that is hard but very stimulating. It helps me improve my designs from the very beginning and in addition I have an excellent test coverage and quality without an extra effort.

In addition I started to have this great side effects:
* I started to make decision based on the code, not on opinions or abstract ideas.
* My development environment started to give me feedback about any change in my code immediately.
* Making the test first drive me to a more cohesive and less coupled components. High coupled components are hard to test, so I tend to avoid coupling. And start thinking about the test help me follow the single responsibility principle, rising the cohesion of my components.

Nevertheless, it is not an easy path. You need to choose between a *Fake it* approach or an *Obvious implementation*. Or you might need to triangulate the problem. 
                                       
If you know what to type and the design: Obvious implementation. If you don't know what to type: fake it. If the right design isn't clear: triangulate. 

So the purpose of this repository is to code all the design patterns, but following the TDD loop: starting with the test and improving the designs step by step. 

## What are patters a useful tool?

I usually use patterns to apply two different rules:
 * Don't reinvent the wheel all the time
 * Use a common language tu explain problems and talk about technical topics
 
Patterns are some very good abstractions to solve many common problems we tend to find while we are working.

It may seem like we solve completely different problems all the time.

However, most of the problems we solve are generated by the tools we use, not by the external problem at hand (accidental complexity comes here).

This is where patterns come to the rescue. They are common solutions to common problems in a wide range of external problem contexts.

In addition, when you are dealing with a well-known problem, it is quite useful to talk about it with your colleges using a common language. Patterns are key words that help everyone understand the problem.
Imagine you are describing a house, you might say: "It is one-bathroom, three-bedrooms house". In this context, Bathroom and Bedroom are keywords.
In a technical conversation: Strategy, Visitor, Chain of responsability are also valuable keywords to explain a problem and a possible solution. It is some kind of common vocabulary.

NOTE: Be aware that each pattern is an abstraction and adds some level of complexity to the code. So it must be chosen wisely, to avoid overcomplicated solutions.

## Patterns groups

Patterns are grouped in three main categories based on the kind of problems they try to solve:

### Creational

This group consists on all the patterns that solves how objects are created:

* [Singleton](./docs/creational/Singleton.md)
* [Builder](./docs/creational/Builder.md)
* [Prototype](./docs/creational/Prototype.md)
* [Factory](./docs/creational/FactoryMethod.md)
* [AbstractFactory](./docs/creational/AbstractFactory.md)


### Structural
//TODO

### Behavioral
//TODO
