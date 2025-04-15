# 🐍 Strategy Pattern - Snake Bite Behavior System (Java)

This project demonstrates the **Strategy Design Pattern** using a simple snake system where different snakes (poisonous and non-poisonous) have different **bite behaviors**.

---

## 📌 Intent

**Strategy Pattern** is used to define a family of algorithms (behaviors), encapsulate each one, and make them interchangeable. This allows the algorithm to vary independently from clients that use it.

> In this system, snakes can change their bite behavior (poisonous or non-poisonous) at runtime without altering the `Snake` class.

---

## 🎯 Use Case

- Model snakes with different bite behaviors.
- Allow dynamic change of bite behavior during runtime.
- Separate the behavior logic from the main class (Snake).
- Demonstrate a simple real-life example of the Strategy Pattern for learning purposes.

---

## 📦 Structure Diagram


---

## 👥 Participants

| Class             | Role                                                                 |
|------------------|----------------------------------------------------------------------|
| `BiteBehavior`    | Strategy interface. Defines the bite behavior method.                |
| `PoisonousBite`   | Concrete strategy. Implements venomous snake behavior.               |
| `NonPoisonousBite`| Concrete strategy. Implements harmless bite behavior.                |
| `Snake`           | Context class. Uses a `BiteBehavior` to delegate the bite behavior.  |

---

## ⚠️ Consequences

✅ **Advantages:**
- **Flexible**: Can change behavior at runtime using `setBiteBehavior()`.
- **Clean Code**: Behavior is separated from the `Snake` class.
- **Open/Closed Principle**: New bite behaviors can be added without modifying existing code.

⚠️ **Disadvantages:**
- Increases number of classes.
- Might be overkill for very simple behaviors unless extensibility is needed.

---

## 🚀 How to Run

1. Compile the code using `javac StrategyPatternDemo.java`
2. Run using `java StrategyPatternDemo`

---

## 🧠 Example Output


---

## 📚 Related Concepts

- **Design Principles**: Favor composition over inheritance.
- **Design Patterns**: Strategy, State, Command.

---
```bash
               +--------------------+
               |   BiteBehavior     |<<interface>>
               +--------------------+
               | +bite(): void      |
               +--------------------+
                        ▲
       -----------------+-----------------
       |                                 |
+---------------------+       +------------------------+
|   PoisonousBite     |       |  NonPoisonousBite      |
+---------------------+       +------------------------+
| +bite(): void       |       | +bite(): void          |
+---------------------+       +------------------------+

               +----------------------+
               |        Snake         |
               +----------------------+
               | -biteBehavior: BiteBehavior |
               +----------------------+
               | +performBite(): void       |
               | +setBiteBehavior(b: BiteBehavior): void |
               +----------------------+

