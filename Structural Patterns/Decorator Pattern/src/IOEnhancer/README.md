# 📄 IOEnhancer - Decorator Design Pattern (Java)

This project demonstrates the **Decorator Design Pattern** using a simple **InputStream enhancer system**. It allows for dynamic addition of functionality like logging and character counting without modifying the original input stream logic.

---

## 🎯 Intent (GoF)

> "**Attach additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.**" -"*GoF Book*"

---

## 📚 Use Case

We enhance a basic text input stream (`SimpleTextReader`) with decorators that:
- 🔢 Count the number of characters read.
- 📝 Log each character read.

All decorators are dynamically added at runtime without changing the base stream class.

---
## 🧱 Class Diagram

                            +-----------------+
                            |   TextReader    |<------------------+
                            +-----------------+                   |
                            | +readChar()     |                   |
                            +-----------------+                   |
                                    ▲                             |
                                    |                             |
                +--------------------------------------+          |                                                             
                |                                      |          ◇  
    +-----------------------+                 +------------------------+
    |   SimpleTextReader    |                 |  TextReaderDecorator   |
    +-----------------------+                 +------------------------+
    | +readChar()           |                 | +readChar()            |
    +-----------------------+                 +------------------------+
                                                          ▲
                                                          |
                                     +--------------------+--------------------+
                                     |                                         |
                         +------------------------+              +-------------------------+
                         |   LoggingTextReader     |              |  CountingTextReader     |
                         +------------------------+              +-------------------------+
                         | +readChar()            |              | +readChar()             |
                         +------------------------+              | +getCharCount()         |
                                                                 +-------------------------+


## 🧩 Participants and Roles

| Participant             | Role                                                                 |
|------------------------|----------------------------------------------------------------------|
| `TextReader`           | **Component**: Defines the interface for reading characters.         |
| `SimpleTextReader`     | **ConcreteComponent**: Reads characters from standard input.         |
| `TextReaderDecorator`  | **Decorator**: Abstract class that wraps a `TextReader` object.      |
| `LoggingTextReader`    | **ConcreteDecorator**: Logs every character read.                    |
| `CountingTextReader`   | **ConcreteDecorator**: Counts total characters read.                 |

---
## ✅ Consequences

### ✅ Advantages

| Benefit                     | Description                                                                 |
|----------------------------|-----------------------------------------------------------------------------|
| ✔ Flexible Extension        | Add new behavior (e.g., logging or counting) without modifying core logic. |
| ✔ Reusable Decorators      | Each decorator is independent and can be reused or combined flexibly.       |
| ✔ Follows Open/Closed Principle | Classes are open for extension but closed for modification.            |

### ⚠️ Limitations

| Limitation                 | Description                                                               |
|---------------------------|---------------------------------------------------------------------------|
| ❌ Complexity              | Many small classes for each feature might increase system complexity.     |
| ❌ Debugging Difficulty    | Multiple nested decorators can make debugging harder.                     |

---

## 🚀 How to Compile and Run

```java
javac IOEnhancer/*.java
java IOEnhancer.Main

Type something and press Enter (Ctrl+Z to stop):
Hello World
LOG: Read char -> H
LOG: Read char -> e
...
Total characters read: 11




