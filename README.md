# java8-features

## Method Reference
A method reference is the shorthand syntax for a lambda expression that executes just ONE method. Here's the general syntax of a method reference:

**Object :: methodName**

**Example:**

***Consumer<String> c = s -> System.out.println(s);***

To make the code clearer, you can turn that lambda expression into a method reference:

***Consumer<String> c = System.out::println;***

First of all, a method reference can't be used for any method. They can only be used to replace a single-method lambda expression.

So to use a method reference, you first need a lambda expression with one method. And to use a lambda expression, you first need a functional interface, an interface with just one abstract method.

In other words:

Instead of using
```
AN ANONYMOUS CLASS
you can use
A LAMBDA EXPRESSION
And if this just calls one method, you can use
A METHOD REFERENCE
```
There are four types of method references:
```
A method reference to a static method.
A method reference to an instance method of an object of a particular type.
A method reference to an instance method of an existing object.
A method reference to a constructor.
```
