# 🎯 Java Design Patterns (GoF) Collection

Welcome to the **Java Design Patterns (GoF)** repository! This project demonstrates the power of **Gang of Four (GoF)** design patterns with real-world, **mini systems** implemented in Java. Each pattern is clearly explained and organized into categories with dedicated examples.

---

## 🧠 About the Project

This repository is designed to help Java developers understand and implement core **Design Patterns** using practical, easy-to-understand **mini Java systems**. It covers **Creational**, **Structural**, and **Behavioral** design patterns, following best coding practices.

---

## 📁 Project Structure

<br>Food_Ordering_System/
<br>│
<br>├── IAbstractFactory.java         # Interface for the abstract factory
<br>├── IAppetizers.java              # Interface for appetizers
<br>├── IDesserts.java                # Interface for desserts
<br>├── IMainCourse.java              # Interface for main course
<br>│
<br>├── IndianFactory.java            # Concrete factory for Indian cuisine
<br>├── Indian_Appetizers.java        # Indian appetizers
<br>├── Indian_Desserts.java          # Indian desserts
<br>├── Indian_MainCourse.java        # Indian main course
<br>│
<br>├── ChineseFactory.java           # Concrete factory for Chinese cuisine
<br>├── Chines_Appetizers.java        # Chinese appetizers
<br>├── Chines_Desserts.java          # Chinese desserts
<br>├── Chines_MainCourse.java        # Chinese main course
<br>│
<br>└── Main.java                     # Entry point for user interaction


--- 

Each folder contains:
- 📄 **Java source code**
- 🧪 **Mini project/system** implementing the pattern
- 📘 Simple explanations comments,Structure Diagram,Class Diagram,Participants and Consequences

---

## 🧰 Covered Design Patterns

### 🔨 Creational Patterns
- **Abstract Factory** – Create families of related objects without specifying classes
- **Factory Method** – Define an interface for creating an object, but let subclasses decide the instantiation
- **Singleton** – Ensure a class has only one instance and provide a global access point
- **Prototype** – Clone objects instead of creating new ones

### 🏗️ Structural Patterns
- **Adapter** – Bridge between incompatible interfaces
- **Decorator** – Attach new behaviors to objects dynamically
- **Façade** – Provide a simplified interface to a complex subsystem
- **Proxy** – Represent another object with more control or access

### 🔁 Behavioral Patterns
- **Chain of Responsibility** – Pass requests along a chain of handlers
- **State** – Alter behavior when an object’s internal state changes
- **Strategy** – Define a family of algorithms and make them interchangeable
- **Observer** – Notify multiple objects about state changes

---

## 💻 Language & Tools

- 💡 **Language:** Java (JDK 8+)
- 📦 **Structure:** OOP principles
- ✅ **Tested:** All patterns compiled and tested with basic use cases

---

## 🚀 Getting Started

1. **Clone the repository**:
   ```sh
   git clone https://github.com/SonaniAkshit/Design-Patterns-Java.git
   cd Design-Patterns-Java
