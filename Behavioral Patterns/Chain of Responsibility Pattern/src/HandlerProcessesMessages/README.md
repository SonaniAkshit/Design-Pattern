# 🔗 Handler Processes Messages - Chain of Responsibility Pattern

This is a very simple implementation of the **Chain of Responsibility** design pattern in Java for students and beginners.

---

## 🎯 Intent

> **"Avoid coupling the sender of a request to its receiver by giving more than one object a chance to handle the request. Chain the receiving objects and pass the request along the chain until an object handles it."**  
> – *Gang of Four (GoF)*

---

## 🔧 Use Case

In this example, a message is passed through a chain of handlers:
- If a handler can process the message based on its **level** (`INFO`, `DEBUG`, `ERROR`), it handles it.
- If it can't, it forwards the message to the **next handler** in the chain.

---

## 🧱 Structure Diagram

                    +-----------+
                    |  Handler  | 
                    +-----------+
                          ▲ 
                          |
             +--------------------------+
             |            |             |
       +----------+ +-----------+ +-----------+
       | Concrete | | Concrete  | | Concrete  |
       | Handler1 | | Handler1  | | Handler1  |
       +----------+ +-----------+ +-----------+
---
## 📦 Class Diagram

                       +---------------------+
                       |     Handler         |
                       |---------------------|
                       | - next : Handler    |
                       | + setNext(handler)  |
                       | + handle(level, msg)|
                       +----------+----------+
                                  ▲
                                  |
               +-----------------------------------+
               |                |                  |
    +----------------+  +----------------+  +----------------+
    |  InfoHandler   |  |  DebugHandler  |  |  ErrorHandler  |
    +----------------+  +----------------+  +----------------+
    | + handle()     |  | + handle()     |  | + handle()     |
    +----------------+  +----------------+  +----------------+

---
## 🧩 Participants

| Participant       | Class Name     | Responsibility                                      |
|------------------|----------------|------------------------------------------------------|
| **Handler (interface/abstract)** | `Handler`       | Defines a method to set the next handler and handle requests |
| **ConcreteHandler** | `InfoHandler`, `DebugHandler`, `ErrorHandler` | Check if they can handle the request; otherwise pass it on |
| **Client**         | `Main`         | Sends messages to the first handler in the chain     |

---
## ✅ Consequences
### ✅ Advantages:
- Flexible: You can add/remove/reorder handlers easily. 
- Decouples sender and receiver. 
- Responsibility is spread across multiple objects.

### ⚠️ Disadvantages:
- A request might not be handled if no handler is responsible. 
- Hard to trace how requests move through the chain in large systems.
---

## 📁 Folder Structure
    HandlerProcessesMessages/
    ├── Handler.java
    ├── InfoHandler.java
    ├── DebugHandler.java
    ├── ErrorHandler.java
    └── Main.java
---

## 🚀 Compile & Run

```java
🛠️ Compile
javac HandlerProcessesMessages/*.java

▶️ Run
java chainofresponsibility.Main

💻 Output
Info: This is an info message.
Debug: This is a debug message.
Error: This is an error message.

