## 💻 Java Programming Problems and Concepts

This repository contains a collection of Java programming problems and fundamental concepts, designed to help in understanding various aspects of the language and serves as a comprehensive reference guide.

---

### I. 🔢 Basic Number Operations & Data Types

| Topic | Description | Example Files |
| :--- | :--- | :--- |
| **Number Check** | Programs to check properties of numbers (e.g., positive, negative, zero, even, odd). | `NumberCheck.java` |
| **Accept an Integer** | Demonstrates how to take integer input from the user (using `Scanner`). | `AcceptInput.java` |
| **Saving Amount** | Simple program simulating saving or calculating interest/balances. | `SavingAmount.java` |
| **Round the Number** | Examples of rounding numbers using `Math.round()` and other methods. | `RoundNumber.java` |
| **Float to Integer** | Converting a floating-point number to an integer, demonstrating type casting. | `FloatToInt.java` |
| **ASCII Values** | Program to find the ASCII value of a character and vice versa. | `ASCIIValues.java` |
| **Return Double** | Method examples that are designed to return a `double` type. | `ReturnDoubleMethod.java` |
| **Long to HexString** | Converting a `long` value to its hexadecimal string representation. | `LongToHex.java` |

---

### II. 🕰 Utility and Logic Problems

* **NQT Problem:** A typical problem often asked in the NQT (National Qualifier Test) or similar competitive exams (e.g., array manipulation, string processing).
* **TimeConverter:** Methods to convert time units (e.g., hours to minutes, seconds to milliseconds).
* **Password Generator:** Program to generate a random, secure password based on specified criteria.
* **Volume Calculation:** Methods to calculate the volume of various geometric shapes (e.g., sphere, cube, cylinder).

---

### III. ⚙️ Flow Control and Memory

* **Jumping Statements:** Examples and usage of `break`, `continue`, and `return` statements in loops and methods.
* **Memory Allocation in Java:** Overview of how memory (Heap, Stack, Method Area) is allocated in Java. 
    * **Memory Allocation in Method:** Focusing on how method calls and local variables are managed on the **Stack** memory.

---

### IV. 🛠 Methods in Java

#### A. Fundamentals

* **Math Methods in Java:** Usage of common predefined methods from the `java.lang.Math` class.
* **User Defined Methods:** Creating and implementing custom methods in a class.
* **Calling Predefined Methods:** Examples of invoking methods from standard Java libraries.
* **Methods Calling in Java:** Demonstrating how one method can call another method.
* **Methods in Different Ways:** Exploring different method structures (with/without parameters/return values).

#### B. Instance vs. Static Methods

| Concept | Description |
| :--- | :--- |
| **Instance Method** | Methods associated with an object and require an instance to be called. |
| **Calling Instance Method** | How to invoke an instance method using an object reference. |
| **Void Instance Methods without Parameter** | Simple instance methods that perform an action without returning a value or taking input. |
| **Instance Method with Parameter** | Instance methods that accept input arguments. |
| **Static Method Cannot Access Instance Variable** | Rule demonstration: Static methods belong to the class and cannot directly use non-static (instance) variables. |
| **Static Methods Accessed from Both Static and Non-Static Methods** | Proof that static methods can be called from any context. |

#### C. Parameter Passing

* **Passing Primitive Types:** Example of **Pass-by-Value** for primitive data types (a copy of the value is passed).
* **Passing Reference Types:** Example of passing object references (a copy of the reference is passed, allowing modification of the object).
* **Type 2 Parameter Passing:** Specific scenario demonstrating parameter passing behavior.
* **Type 2 Reference Method in Java:** Advanced example focusing on how references are handled in method calls.

#### D. Specialized Methods

* **Accessor and Mutator Methods:** Implementing **Getters** (Accessor) and **Setters** (Mutator) for encapsulated data fields.
* **Business Logic Method:** Methods encapsulating core application logic (e.g., complex calculation, data validation).
* **Amount Deposit and Withdraw Check using Method:** Practical application of methods for transactional logic with validation checks.

---

### V. 🔒 Access Modifiers

| Modifier | Accessibility | Within Class | Within Package | Subclass (Outside Pkg) | Outside Package |
| :--- | :--- | :--- | :--- | :--- | :--- |
| **Public** | Universal access | Yes | Yes | Yes | Yes |
| **Protected** | Package and Subclass access | Yes | Yes | Yes | No |
| **Private** | Class-level access only | Yes | No | No | No |

* **Access Modifiers in Java Public:** Detailed examples of the `public` modifier.
* **Access Modifier Protected in Java:** Detailed examples of the `protected` modifier.
* **Private Access Modifier in Java:** Detailed examples of the `private` modifier.
* **Example 2 in Private Access Modifier in Java:** Further use cases demonstrating the importance of encapsulation. 

---

### VI. ⚙️ Command Line Arguments

* **Command Line Arguments in Java:** How to pass and access arguments using the `main(String[] args)` array.
* **Command Line Argument in Java Using For Each Loop in Java:** Iterating over the arguments array using the enhanced `for` loop.
* **Command Line Argument in Java Use to Calculate Sum of Two Numbers:** A practical example using command line arguments for simple arithmetic.
