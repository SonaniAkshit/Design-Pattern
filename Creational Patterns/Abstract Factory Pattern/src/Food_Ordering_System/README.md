# 🍽️ Food Ordering System - Abstract Factory Design Pattern (Java)

This Java project is a console-based **Food Ordering System** that uses the **Abstract Factory Design Pattern** to simulate food ordering from different cuisines (e.g., Indian and Chinese). Users can select a cuisine and then choose a type of dish (Appetizers, Main Course, or Desserts).

---

## 📁 Project Structure

<br>📁 Food_Ordering_System/
<br>│
<br>├── IAbstractFactory.java          # Abstract factory interface
<br>├── IAppetizers.java               # Appetizers interface
<br>├── IDesserts.java                 # Desserts interface
<br>├── IMainCourse.java               # Main course interface
<br>│
<br>├── IndianFactory.java             # Factory for Indian cuisine
<br>├── Indian_Appetizers.java         # Indian Appetizers
<br>├── Indian_Desserts.java           # Indian Desserts
<br>├── Indian_MainCourse.java         # Indian Main Course
<br>│
<br>├── ChineseFactory.java            # Factory for Chinese cuisine
<br>├── Chines_Appetizers.java         # Chinese Appetizers
<br>├── Chines_Desserts.java           # Chinese Desserts
<br>├── Chines_MainCourse.java         # Chinese Main Course
<br>│
<br>└── Main.java                      # Main class for interaction

---

## 📊 Class Diagram

             +----------------------+
             |  IAbstractFactory    |◄ ------------------------------------------------------------+
             |----------------------|                                                              |
             | +getAppetizers()     |                                                              |
             | +getDesserts()       |                                                              |
             | +getMainCourse()     |                                                              |
             +----------------------+                                                              |
                     _______________________________________________________________________________
                     ▲                                                                             ▲
                     |                                                                             |
         _____________________                                                          _____________________
         |  IndianFactory    |                                                          |  ChineseFactory   |      
         +-------------------+                                                          +-------------------+
         | +getAppetizers()  |                                                          | +getAppetizers()  |
         | +getDesserts()    |                  _____________________________           | +getDesserts()    |
         | +getMainCourse()  |                  |      <<IAppetizers>>      |           | +getMainCourse()  |
         +-------------------+                  +---------------------------+           +-------------------+
            ◇      ◇       ◇                  |+OrderAppetizers()         |              ◇       ◇       ◇      
            |       |       |                   +---------------------------+              |       |       |
      _____________________________                           ▲                      _____________________________
      | Indian_Appetizers         |---------------------------|----------------------| Chines_Appetizers         |
      +---------------------------+             _____________________________        +---------------------------+
      | +OrderAppetizers()        |             |        <<IDesserts>>      |        | +OrderAppetizers()        |
      _____________________________             +---------------------------+        _____________________________
      | Indian_Desserts           | ----------► |+OrderAppetizers()         | ◄ -----| Chines_Desserts           |
      +---------------------------+             +---------------------------+        +---------------------------+
      | +OrderDesserts()          |                                                  | +OrderDesserts()          |
      _____________________________             _____________________________        _____________________________
      | Indian_MainCourse         | ----------► |      <<IMainCourse>>      |◄ ----- | Chines_MainCourse         |
      +---------------------------+             +---------------------------+        +---------------------------+
      | +OrderMainCourse()        |             |+OrderAppetizers()         |        | +OrderMainCourse()        |
      +---------------------------+             +---------------------------+        +---------------------------+


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
