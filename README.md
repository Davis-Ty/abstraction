# Abstraction, Interface, Extend
- key concepts related to object-oriented programming and inheritance.

# Purpose
- This Java code defines an abstract class Human that implements the Animal interface. It contains properties like age, name, and days worked, along with getter and setter methods for these properties. Additionally, it declares an abstract method getTotalWork(). The isHuman() and notHuman() methods are implemented from the Animal interface, returning true and false respectively, indicating that a Human is a type of Animal. The Animal interface declares two boolean methods isHuman() and notHuman(), which any implementing class must define.

# Abstraction:
- Abstraction is a fundamental concept in object-oriented programming that refers to the process of hiding certain implementation details and showing only the essential features of an object.
- It allows developers to focus on what an object does rather than how it does it.
- In Java, abstraction is achieved through abstract classes and interfaces.

# Interface:
- An interface in Java is a reference type similar to a class, but it can only contain constants, method signatures, default methods, static methods, and nested types.
- It provides a way to achieve abstraction by specifying a set of methods that a class must implement.
- Interfaces are used to define contracts that classes can adhere to, allowing for polymorphism and loose coupling in the code.
- In Java, a class can implement multiple interfaces but can only extend one superclass.

# Extend:
- In Java, the extend keyword is used to create a subclass that inherits properties and behaviors from a superclass.
- When a class extends another class, it inherits all non-private fields and methods of the superclass.
- Subclasses can override superclass methods to provide their own implementations or extend the behavior of the superclass.
- Java supports single inheritance, meaning a class can only extend one superclass, but it can implement multiple interfaces.
- The relationship between a subclass and a superclass is often referred to as an "is-a" relationship, where a subclass is a specialized version of its superclass.

