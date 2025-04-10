# 🧱 Turning on a Computer - Facade Design Pattern

This is a **very simple implementation** of the **Facade Design Pattern** as defined by the Gang of Four (GoF). It demonstrates how to simplify interactions with complex subsystems (CPU, Memory, HardDrive) using a single entry point: `ComputerFacade`.

---

## 🎯 Intent

> **"Provide a unified interface to a set of interfaces in a subsystem. The Facade defines a higher-level interface that makes the subsystem easier to use."** – *Gang of Four*

---

## 🛠️ Use Case

When starting a computer, many low-level operations (freezing CPU, reading from hard drive, loading memory, etc.) are required. Instead of the client dealing with each operation, we use a `ComputerFacade` that exposes a simple method: `startComputer()`.

---

## 🏗️ Structure Diagram (Simplified View)

                       <-- Facade -->
                  +----------------------+
                  |        Facade        |
                  +----------------------+
    +-------------|                      |-------------+
    |             +----------------------+             |
    |              |        |           |              |
    |              v        v           v              |  
    | +-------------+  +------------+ +------------+   |  
    | | subsystem1  |  | subsystem2 | | subsystem3 |   |  
    | +-------------+  +------------+ +------------+   |
    +--------------------------------------------------+

---

## 📦 Class Diagram

    
    
                        <-- Facade -->
                    +----------------------+
                    |    ComputerFacade    |  
                    +----------------------+
                    | - CPU cpu            |
                    | - Memory memory      |
                    | - HardDrive hdd      |
                    +----------------------+
      +-------------| +startComputer()     |----------+
      |             +----------------------+          |
      |              |        |         |             |
      |              v        v         v             |  
      |         +------+  +--------+ +-----------+    |  
      |         | CPU  |  | Memory | | HardDrive |    |  
      |         +------+  +--------+ +-----------+    |
      +-----------------------------------------------+
---

## 🧑‍💻 Participants

| Role             | Class Name       | Description |
|------------------|------------------|-------------|
| **Facade**        | `ComputerFacade` | Provides a simplified interface to complex subsystems. |
| **Subsystem 1**   | `CPU`            | Represents CPU operations like freezing and executing. |
| **Subsystem 2**   | `Memory`         | Responsible for loading data into memory. |
| **Subsystem 3**   | `HardDrive`      | Reads data from the disk. |
| **Client**        | `FacadePatternDemo` | Uses the facade to start the computer easily. |

---

## ✅ Consequences

✅ Advantages:

- Simplifies complex subsystems. 
- Reduces coupling between client and subsystems. 
- Improves readability and maintainability.

❌ Disadvantages:
- Facade might become a "god object" if not carefully designed. 
- Can limit subsystem functionality by only exposing a subset of features.
---

## 📂 Example Directory Structure
    /TurningonaComputer
    │
    ├── CPU.java
    ├── Memory.java
    ├── HardDrive.java
    ├── ComputerFacade.java
    └── FacadePatternDemo.java
---

### 🛠️ Compile & Run the Program

```java
javac IOEnhancer/*.java

▶️
java IOEnhancer.Main

✅
Freezing CPU...
Loading data 'OS Boot Files' at position 100
Executing instructions...


