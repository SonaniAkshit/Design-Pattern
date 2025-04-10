# 📡  Email and SMS services(Observer Design Pattern)

This project demonstrates the **Observer Design Pattern** as described in the *"Design Patterns: Elements of Reusable Object-Oriented Software"* (GoF Book), using a simple example of order status notifications.

---

## 🎯 Intent

> "**Define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.**" – *GoF Book*

---

## 💡 Use Case

An `Order` (Subject) notifies `EmailObserver` and `SMSObserver` (Observers) whenever its status changes.

---

## 🧩 Participants and Roles

| Participant       | Role                                                                 |
|------------------|----------------------------------------------------------------------|
| `Subject`         | Stores references to observer objects. Provides methods to add/remove observers and notify them. |
| `Observer`        | Interface defining the `update()` method that observers must implement. |
| `ConcreteSubject` (`Order`) | Maintains the state of interest (`status`). Notifies all observers on state change. |
| `ConcreteObserver` (`EmailObserver`, `SMSObserver`) | Implements the `update()` method to respond when notified by the subject. |

---
## 📦 Class Diagram
    +------------------+         +------------------+
    |     Subject      |◇-------|    Observer      |
    +------------------+         +------------------+
    | +addObserver()   |         | +update()        |
    | +removeObserver()|         +------------------+
    | +notifyObservers()|                 ▲
    +------------------+                  |
             ▲             +--------------------------+
             |             |                          |
             |    +------------------+      +------------------+
             |    |  EmailObserver   |      |   SMSObserver    |
             |    +------------------+      +------------------+
             |    | +update()        |      | +update()        |
             |    +------------------+      +------------------+
             |
    +------------------+
    |     Order        |
    +------------------+
    | -status: String  |
    | +changeStatus()  |
    +------------------+

---
## 🧠 Consequences

| Advantage                         | Description                                                                            |
|----------------------------------|----------------------------------------------------------------------------------------|
| Loose coupling                   | Subjects and observers are loosely coupled. The subject only knows that observers implement the `Observer` interface. |
| Dynamic relationships            | Observers can be added/removed at runtime.                                             |
| Support for broadcast communication | One change can trigger updates to many observers simultaneously.                        |

| Limitation                        | Description                                                                            |
|----------------------------------|----------------------------------------------------------------------------------------|
| Order of notification            | Observers are notified in the order they were added—can lead to unpredictable results. |
| Unexpected updates               | Observers may receive updates they don't need unless proper filtering is done.        |

---

## 📂 Folder Structure
    src/EmailandSMSservices/
    ├── iObserver.java
    ├── EmailObserver.java
    ├── SMSObserver.java
    ├── Order.java
    └── Main.java
---
## 🚀 Compile & Run

```java
    javac EmailandSMSservices/*.java
    java EmailandSMSservices.Main

    🖥️Output
    Email Notification: Order status changed to PLACED
    SMS Notification: Order status changed to PLACED
    Email Notification: Order status changed to SHIPPED
    SMS Notification: Order status changed to SHIPPED
    Email Notification: Order status changed to DELIVERED
    SMS Notification: Order status changed to DELIVERED
    



