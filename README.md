# 🎯 Java Design Patterns (GoF) Collection 

Welcome to the **Java Design Patterns (GoF)** repository! This project demonstrates the power of **Gang of Four (GoF)** design patterns through real-world **mini systems** implemented in Java. Each pattern is neatly explained and organized into categories with dedicated examples.

---

# 🧠 About the Project

This repository is built to help Java developers **learn, understand, and implement** core **Design Patterns** through practical, easy-to-understand **mini Java systems**. It covers the three main categories:

- 🛠️ **Creational Patterns**
- 🏗️ **Structural Patterns**
- 🔁 **Behavioral Patterns**

All examples follow **best coding practices** and include visual aids and commentary to enhance comprehension.

---

## 📁 Project Structure


- 📂 Example path:
Design-Patterns/ Creational Patterns/ AbstractFactory Pattern/ src/ Food_Ordering_System/

---

### Each pattern is organized in its own folder and includes:

- 📄 Java source code
- 🧪 A mini project/system implementing the pattern
- 📘 Inline comments, structure diagram, class diagram, participants, and consequences

---

## 🧰 Covered Design Patterns(TO-DO List)

| 🔨 Creational Patterns | 🏗️ Structural Patterns | 🔁 Behavioral Patterns         |
|------------------------|------------------------|--------------------------------|
| ✅ Factory              | ❌ Adapter             | ✅ Chain of Responsibility(COR) |
| ✅ Abstract Factory     | ❌ Bridge              | ❌ Command                      |
| ❌ Builder              | ❌ Composite           | ❌ Iterator                     |
| ❌ Prototype            | ✅ Decorator           | ❌ Mediator                     |
| ✅ Singleton            | ✅ Facade              | ❌ Memento                      |
|                        | ❌ Flyweight           | ✅ Observer                     |
|                        | ✅ Proxy               | ✅ State                        |
|                        |                        | ❌ Strategy                     |
|                        |                        | ❌ Template Method              |
|                        |                        | ❌ Visitor                      |

✅ = Implemented | ❌ = Coming Soon

---


## 💻 Language & Tools

- 💡 **Language:** Java (JDK 8+)
- 🧱 **Architecture:** Object-Oriented Programming (OOP)
- ✅ **Status:** All implemented patterns are compiled and tested with sample use cases

---
# 📘 What is a Design Pattern?

## ✅ Definition (Based on GoF)

A **design pattern** is a **reusable solution** to a **common problem** that occurs in software design.

It is **not a complete code**, but a **template or guide** for how to solve a problem that keeps coming up in different projects.

> **GoF Definition:**  
> "*A design pattern describes a problem which occurs over and over again in our environment, and then describes the core of the solution to that problem in such a way that you can use this solution a million times over, without ever doing it the same way twice.*"

---

## 🧠 Key Points

- Design patterns are **tried and tested solutions**.
- They are **language-independent** (but can be implemented in Java, C++, etc.).
- Improve **code reuse**, **flexibility**, and **maintainability**.
- GoF categorized **23 design patterns** into:
   - **Creational Patterns**
   - **Structural Patterns**
   - **Behavioral Patterns**

---
# 🧭 How to Select a Design Pattern & Solve Design Problems ? (GoF Way)

## ✅ Step-by-Step Approach from GoF

The **Gang of Four (GoF)** suggests using patterns by **understanding the problem first**, then finding a pattern that fits. Here's how:

---

## 🛠️ 1. Understand the Problem

- **What are you trying to solve?**
- Is it about **object creation**, **object structure**, or **object behavior**?
- Example questions:
   - Do you want to restrict object creation? (→ *Creational*)
   - Do you want to make objects easier to change or extend? (→ *Structural*)
   - Do you want objects to communicate flexibly? (→ *Behavioral*)

---

## 🔍 2. Classify the Problem

Check what kind of problem you're solving:

| Type         | Pattern Category |
|--------------|------------------|
| Object creation | Creational       |
| Class structure | Structural       |
| Object behavior | Behavioral       |

---

## 🧩 3. Look for Similar Use Cases

Read the **intent** and **applicability** section of each pattern in the GoF book.

Example:
> Want to ensure only one instance of a class?  
> ✅ Use **Singleton Pattern**

---
# 💡 What Do You Mean by "Instance" in Java?

## ✅ Definition

An **instance** is a **concrete object** created from a **class**.  
You can think of a class as a **blueprint**, and an instance as the **actual object** built using that blueprint.

---

## 🏠 Real-life Analogy

- **Class** = House Blueprint
- **Instance** = The actual House built from that blueprint

So when you create an object using `new`, you're **instantiating** a class — creating an instance!

---

## ☕ Java Example

```java
class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    void sayHello() {
        System.out.println("Hello, my name is " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Aman"); // s1 is an instance of Student
        Student s2 = new Student("Riya"); // s2 is another instance

        s1.sayHello();  // Output: Hello, my name is Aman
        s2.sayHello();  // Output: Hello, my name is Riya
    }
}
```
---
## 🧠 4. Use Pattern Selection Hints (GoF Tips)

GoF provides clues based on problem types:

| Situation | Pattern Suggestion |
|-----------|--------------------|
| You want to vary object creation | Abstract Factory, Builder, Prototype |
| You want one object only | Singleton |
| You want to compose objects into trees | Composite |
| You want to change behavior at runtime | Strategy, State |
| You want to avoid tight coupling | Observer, Mediator |

---

## ☕ Example: Solving with Design Pattern in Java

**Problem:** You need to create different types of documents (PDF, Word) but don’t want to hardcode creation.

**Solution:** Use **Factory Method** pattern.

```java
abstract class Document {
    public abstract void open();
}

class PDFDocument extends Document {
    public void open() {
        System.out.println("Opening PDF Document");
    }
}

class WordDocument extends Document {
    public void open() {
        System.out.println("Opening Word Document");
    }
}

abstract class Application {
    public abstract Document createDocument();
}

class PDFApp extends Application {
    public Document createDocument() {
        return new PDFDocument();
    }
}

class WordApp extends Application {
    public Document createDocument() {
        return new WordDocument();
    }
}
```

## 🚀 Getting Started

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/SonaniAkshit/Design-Patterns-Java.git
   cd Design-Patterns-Java
___
![Java](https://img.shields.io/badge/language-Java-blue.svg)

[//]: # (![Build]&#40;https://img.shields.io/badge/build-passing-brightgreen.svg&#41;)
[//]: # (![License]&#40;https://img.shields.io/badge/license-MIT-lightgrey.svg&#41;)
![Stars](https://img.shields.io/github/stars/SonaniAkshit/Design-Pattern?style=social)
