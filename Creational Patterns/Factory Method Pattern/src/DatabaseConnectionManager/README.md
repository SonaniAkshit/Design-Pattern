# 🗃️ Database Connection Manager - Factory Design Pattern (Java)

This Java project is a **console-based Database Connection Manager** that demonstrates the use of the **Factory Design Pattern**. It allows users to connect, query, and disconnect from different types of databases such as **MySQL**, **PostgreSQL**, and **MongoDB** using a unified interface.

---

## 📁 Project Structure

<br>📁 DatabaseConnectionManager/
<br>│
<br>├── DatabaseFactory.java            # Factory class to return database connection objects
<br>├── iDatabaseConnection.java        # Interface defining connection methods
<br>│
<br>├── MySQLConnection.java            # MySQL database connection implementation
<br>├── PostgreSQLConnection.java       # PostgreSQL database connection implementation
<br>├── MongoDBConnection.java          # MongoDB database connection implementation
<br>│
<br>└── Main.java                       # Main class for user interaction


---
## 🧱 Structure Diagram


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

## 👥 Participants

| Role                    | Description |
|-------------------------|-------------|
| `Main.java`             | Acts as the client. Displays menu and processes user input. |
| `iDatabaseConnection`   | Common interface for all database connections. |
| `MySQLConnection`       | Provides connect, query, and disconnect behavior for MySQL. |
| `PostgreSQLConnection`  | Provides connect, query, and disconnect behavior for PostgreSQL. |
| `MongoDBConnection`     | Provides connect, query, and disconnect behavior for MongoDB. |
| `DatabaseFactory`       | Factory class that creates appropriate database connection objects based on user input. |

---

## ✅ Benefits of Using Factory Pattern

### ✅ Advantages
- Promotes loose coupling between client code and concrete classes.
- Simplifies object creation logic in one place.
- Easy to add support for new database types in the future.

### ⚠️ Considerations
- Slightly increases the number of classes.
- Logic in the factory can grow complex if too many types are added.

---

## 🧪 How to Run

1. Compile the Java files:

```bash
javac DatabaseConnectionManager/*.java


1)MySQL Connection.
2)PostgreSQL Connection
3)MongoDBConnection
0 For Exit
> 1

1)Connect.
2)Query.
3)Disconnect.
0 For Exit
> 1
Connected to MySQL Database.
