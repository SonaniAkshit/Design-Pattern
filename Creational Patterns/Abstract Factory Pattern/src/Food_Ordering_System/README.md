# 🍽️ Food Ordering System - Abstract Factory Design Pattern (Java)

This Java project is a console-based **Food Ordering System** that uses the **Abstract Factory Design Pattern** to simulate food ordering from different cuisines (e.g., Indian and Chinese). Users can select a cuisine and then choose a type of dish (Appetizers, Main Course, or Desserts).

---

## 📁 Project Structure

- Food_Ordering_System/

    <br>IAbstractFactory.java         &nbsp;# Interface for the abstract factory
    <br>IAppetizers.java              &nbsp;# Interface for appetizers
    <br>IDesserts.java                &nbsp;# Interface for desserts
    <br>IMainCourse.java              &nbsp;# Interface for main course

    <br>IndianFactory.java            &nbsp;# Concrete factory for Indian cuisine
    <br>Indian_Appetizers.java        &nbsp;# Indian appetizers
    <br>Indian_Desserts.java          &nbsp;# Indian desserts
    <br>Indian_MainCourse.java        &nbsp;# Indian main course

    <br>ChineseFactory.java           &nbsp;# Concrete factory for Chinese cuisine
    <br>Chines_Appetizers.java        &nbsp;# Chinese appetizers
    <br>Chines_Desserts.java          &nbsp;# Chinese desserts
    <br>Chines_MainCourse.java        &nbsp;# Chinese main course

    <br>Main.java                     &nbsp;# Entry point for user interaction

---

## 📊 Structure & Class Diagram

              +----------------------+
             |  IAbstractFactory    |<-------------------------+
             |----------------------|                          |
             | +getAppetizers()     |                          |
             | +getDesserts()       |                          |
             | +getMainCourse()     |                          |
             +----------------------+                          |
                     ▲                                        ▲
         +-------------------+                    +-------------------+
         |  IndianFactory     |                    |  ChineseFactory   |
         +-------------------+                    +-------------------+
         | +getAppetizers()  |                    | +getAppetizers()  |
         | +getDesserts()    |                    | +getDesserts()    |
         | +getMainCourse()  |                    | +getMainCourse()  |
         +-------------------+                    +-------------------+
                ▲       ▲       ▲                        ▲       ▲       ▲
                |       |       |                        |       |       |
      +---------------------------+            +---------------------------+
      | Indian_Appetizers         |            | Chines_Appetizers         |
      +---------------------------+            +---------------------------+
      | +OrderAppetizers()        |            | +OrderAppetizers()        |
      +---------------------------+            +---------------------------+
      | Indian_Desserts           |            | Chines_Desserts           |
      +---------------------------+            +---------------------------+
      | +OrderDesserts()          |            | +OrderDesserts()          |
      +---------------------------+            +---------------------------+
      | Indian_MainCourse         |            | Chines_MainCourse         |
      +---------------------------+            +---------------------------+
      | +OrderMainCourse()        |            | +OrderMainCourse()        |
      +---------------------------+            +---------------------------+

---

## 👥 Participants

| Role                    | Description |
|-------------------------|-------------|
| `Main.java`             | Acts as the client. Takes user input and uses the factory to create appropriate dishes. |
| `IAbstractFactory`      | Abstract interface for all cuisine factories. |
| `IndianFactory`, `ChineseFactory` | Concrete factories for different cuisines. |
| `IAppetizers`, `IDesserts`, `IMainCourse` | Interfaces for product categories. |
| `Indian_*`, `Chines_*` Classes    | Concrete implementations of dishes based on cuisine and category. |

---

## ✅ Consequences of Using Abstract Factory

### ✅ Advantages
- Easy to extend and maintain.
- Encourages loose coupling and clear separation of concerns.
- Supports the Open/Closed Principle.

### ⚠️ Disadvantages
- Can introduce complexity due to a large number of classes.
- Adding a new dish type (e.g., Beverages) requires changes across all factories and interfaces.

---

## 🧪 How to Run

1. Compile the Java files:

```bash
javac Food_Ordering_System/*.java

Enter the [Indian,Chinese]
Indian
Enter the cuisine name [Appetizers,Desserts,MainCourse]
MainCourse
Indian Main Course Ordered
