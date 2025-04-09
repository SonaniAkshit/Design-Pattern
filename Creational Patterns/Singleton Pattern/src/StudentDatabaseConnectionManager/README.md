# 🎓 Student Database Management - Singleton Design Pattern (Java)

This is a simple **Java console application** that demonstrates the **Singleton Design Pattern** by managing a single database connection for a Student Management System.

---

## 🎯 Intent

> "**Ensure a class has only one instance and provide a global point of access to it.**" – *GoF Design Patterns*

---

## 🧩 Use Case

In a Student Management System, multiple parts of the application may need access to the database. To avoid opening multiple database connections and wasting resources, we use the **Singleton pattern** to ensure **only one connection instance** is used throughout the application.

---


## 🧱 Class Diagram

                          +-------------+
                          |             |
           <<Singleton>>  ◆             |  
    +--------------------------+        |
    |   DatabaseConnection     |--------+
    +--------------------------+
    | -instance: static        |
    | -DatabaseConnection()    |
    +--------------------------+
    | +getInstance(): Object   |
    | +query(sql: String)      |
    +--------------------------+

---

## 🧩 Participants and Roles

| Participant             | Role                                                                 |
|------------------------|----------------------------------------------------------------------|
| `DatabaseConnection`   | **Singleton Class**. Ensures only one instance is created and provides a global point of access. |
| `Main`                 | **Client**. Requests the instance and performs queries using it.     |

---

## ✅ Benefits of Singleton Pattern

| Advantage                      | Description                                                                 |
|-------------------------------|-----------------------------------------------------------------------------|
| Single Instance                | Ensures only one object exists throughout the application.                 |
| Resource Efficient             | Prevents multiple database connections, saving memory and resources.       |
| Global Access Point            | Provides a centralized way to access the database connection.              |

---

## ⚠️ Consequences / Considerations

| Limitation                     | Description                                                                 |
|-------------------------------|-----------------------------------------------------------------------------|
| Global State                   | Acts as a global variable which might be misused.                          |
| Thread Safety (Basic version) | This example is not thread-safe. For multithreading, synchronization is required. |

---

## 🚀 How to Run

### Compile
```bash
javac StudentDatabaseManagement/*.java

Database connected.
Running query: SELECT * FROM students
Running query: SELECT * FROM courses
Are both connections same? true



