# 🗃️ Database Connection Manager - Factory Design Pattern (Java)

This Java project is a **console-based Database Connection Manager** that demonstrates the use of the **Factory Design Pattern**. It allows users to connect, query, and disconnect from different types of databases such as **MySQL**, **PostgreSQL**, and **MongoDB** using a unified interface.

---
## 🎯 Intent

> "**Define an interface for creating an object, but let subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses.**" – *GoF Book*

---
## 💡 Use Case

A DatabaseFactory provides database connection objects (MySQLConnection, PostgreSQLConnection, MongoDBConnection) based on the user’s choice. The client interacts through a common interface iDatabaseConnection to perform operations like connect, query, and disconnect.

---

## 🧱 Structure Diagram(ref. GoF)
             +---------------+                        +-----------------+
             |   Product     |                        |     Creator     |
             +---------------+                        +-----------------+
                     ▲                                | FactoryMethod() |             
                     |                                | AnOperation()   |
                     |                                +-----------------+
                     |                                         ▲
                     |                                         |
          +---------------------+                              |
          |   ConcreteProduct   |◄ ------------------ +-----------------+ 
          +---------------------+                     | ConcreteCreator | 
                                                      +-----------------+ 
                                                      | FactoryMethod() |
                                                      +-----------------+
  
---
## 🧱 Class Diagram

              +---------------------------+
              |   iDatabaseConnection     |                                   +------------------------------+
              |---------------------------|                                   |       DatabaseFactory        |
              | +connect() : String       |                                   |------------------------------|
              | +query()   : String       |                                   | +getDatabaseConnection(int)  |
              | +disconnect() : String    |                                   +------------------------------+
              +---------------------------+                                                   ◇  
                            ▲                                                                 | 
                            |                                                                 +---------------+ 
                            +----------------------------+                                                    |
                                                         |                                                    |  
                                                         |                                                    |  
                                                         |                                                    |  
                                                         |                                                    |  
                                                         |                                                    |  
                                                         |                                                    |  
                       ______________________________________________________________________                 |
                       |                                 |                                  |                 |
        +----------------------------+     +----------------------------+       +-------------------------+   |
        |     MySQLConnection        |     |   PostgreSQLConnection     |       |     MongoDBConnection   |   |
        +----------------------------+     +----------------------------+       +-------------------------+   |
        | +connect() : String        |     | +connect() : String        |       | +connect() : String     |   |
        | +query() : String          |     | +query() : String          |       | +query() : String       |   |
        | +disconnect() : String     |     | +disconnect() : String     |       | +disconnect() : String  |   |
        +----------------------------+     +----------------------------+       +-------------------------+   |
                       |                                 |                                  |                 |
                       |                                 |                                  |                 |  
                       +--------------------------------------------------------------------------------------+                                                                                               

---

## 🧩 Participants and Roles

| Participant               | Role                                                                                   |
|--------------------------|----------------------------------------------------------------------------------------|
| `Main`                   | Acts as the **Client**. It presents the menu to the user and uses the factory to get a specific database connection. |
| `iDatabaseConnection`    | The **Product Interface**. Declares common operations like `connect()`, `query()`, and `disconnect()`. |
| `MySQLConnection`        | A **Concrete Product**. Implements database operations specific to MySQL.              |
| `PostgreSQLConnection`   | A **Concrete Product**. Implements database operations specific to PostgreSQL.         |
| `MongoDBConnection`      | A **Concrete Product**. Implements database operations specific to MongoDB.            |
| `DatabaseFactory`        | The **Factory**. Contains logic to return an instance of the correct database connection implementation based on user input. |

---

## ✅ Consequences

### ✅ Advantages
- Encapsulates object creation logic in one place.
- Reduces dependencies between client code and specific implementations. 
- Makes it easy to introduce new database types.

### ⚠️ Disadvantages
- Number of classes increases as you add more types. 
- Factory logic can become complex over time if not well managed.



---
## 📁 Project Structure

    DatabaseConnectionManager/
    ├── iDatabaseConnection.java      # Common interface
    ├── MySQLConnection.java          # MySQL implementation
    ├── PostgreSQLConnection.java     # PostgreSQL implementation
    ├── MongoDBConnection.java        # MongoDB implementation
    ├── DatabaseFactory.java          # Factory class
    └── Main.java                     # Client

---
## 🧪 How to Run

1. Compile the Java files:

```bash
javac DatabaseConnectionManager/*.java
java DatabaseConnectionManager.Main

1) MySQL Connection
2) PostgreSQL Connection
3) MongoDB Connection
0) Exit

> 1

1) Connect
2) Query
3) Disconnect
0) Exit

> 1
Connected to MySQL Database.

> 2
Running MySQL query...

> 3
Disconnected from MySQL Database.

