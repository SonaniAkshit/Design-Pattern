# 🔁 State Design Pattern - (Fan States)

This is a very simple implementation of the **State Design Pattern** in Java, inspired by the Gang of Four (GoF). It simulates a fan that changes its speed (OFF → LOW → HIGH) each time a button is pressed.

---

## 🎯 Intent

> **"Allow an object to alter its behavior when its internal state changes. The object will appear to change its class."**  
> – *Gang of Four (GoF)*

This pattern helps avoid complex `if-else` or `switch` statements by representing each state as a separate class.

---

## 🔧 Use Case

We have a **Fan** that changes speed when a button is pressed:
- If the fan is **OFF**, it goes to **LOW**.
- If it's **LOW**, it goes to **HIGH**.
- If it's **HIGH**, it turns **OFF**.

Each state has its own behavior, and the fan's current state determines what pressing the button will do.

---

## 🧱 Structure Diagram
    
            +-----------+            +-----------+
            |  Context  |◇----------►|  State    |
            +-----------+            +-----------+
                                           ▲
                                           | 
                               +-----------------------+
                               |           |           |
                       +-----------+ +------------+ +------------+
                       | Concrete  | | Concrete   | | Concrete   |
                       | State1    | | State2     | | State1     |
                       +-----------+ +------------+ +------------+
---
## 📦 Class Diagram
    
    +-----------------+                 +----------------------+
    |   Fan           |◇---------------►|      FanState        |
    +-----------------+                 |----------------------|
    | - state         |                 | + pressButton(Fan)   |
    | + pressButton() |                 +----------▲-----------+
    | + setState()    |                            |
    +-----------------+          +-------------------------------------+
                                 |                 |                   |
                        +----------------+  +----------------+  +----------------+
                        |   OffState     |  |   LowState     |  |   HighState    |
                        +----------------+  +----------------+  +----------------+
                        | + pressButton()|  | + pressButton()|  | + pressButton()|
                        +----------------+  +----------------+  +----------------+
---
## 🧩 Participants

| Role              | Class Name   | Responsibility                                 |
|-------------------|--------------|------------------------------------------------|
| **Context**        | `Fan`        | Maintains current state and delegates behavior |
| **State (interface)** | `FanState`   | Declares method `pressButton()`               |
| **Concrete States** | `OffState`, `LowState`, `HighState` | Implement behavior for each state            |
| **Client**         | `Main`       | Simulates button presses                      |

---
## ✅ Consequences
### ✅ Advantages:
- Cleaner code by removing complex if-else or switch. 
- Each state is encapsulated in its own class. 
- Easy to add new states or modify behavior independently.

### ⚠️ Disadvantages:
- More classes to maintain. 
- Logic is distributed across multiple files.
---
## 📁 Folder Structure
    FanStates/
    ├── FanState.java
    ├── OffState.java
    ├── LowState.java
    ├── HighState.java
    ├── Fan.java
    └── Main.java
---
## 🚀 Compile and Run

```java

🛠️ Compile
javac FanStates/*.java
▶️ Run
java statepattern.Main
💻 Output
Turning fan to LOW
Turning fan to HIGH
Turning fan OFF


