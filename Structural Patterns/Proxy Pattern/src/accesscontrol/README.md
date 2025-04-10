# 🔐 Proxy Design Pattern - (Role-based Directory Access)

This project is a very simple implementation of the **Proxy Design Pattern** in Java. It demonstrates how to control access to directory operations like **create**, **rename**, and **delete** based on the **user's role** (`admin` or `user`).

---

## 🎯 Intent

> **"Provide a surrogate or placeholder for another object to control access to it."** – *Gang of Four (GoF)*

In this example, the proxy controls access to directory operations depending on the user’s role.

---

## 🔧 Use Case

Suppose we have a system where:
- Admins can **create**, **rename**, and **delete** directories.
- Normal users can only **create** directories.
  The Proxy design pattern helps us enforce these restrictions **without changing the real directory handling class.**

---

## 🧩 Participants

| Role            | Class Name        | Description |
|------------------|-------------------|-------------|
| **Subject**       | `DirectoryAccess` | Interface defining directory operations. |
| **RealSubject**   | `RealDirectory`   | Performs actual create, rename, and delete tasks. |
| **Proxy**         | `DirectoryProxy`  | Checks user role and controls access to `RealDirectory`. |
| **Client**        | `Main`            | Calls the proxy class to perform operations. |

---

## 🧱 Structure Diagram
                        +-------------+
                        |   Subject   | 
                        +-------------+
                               ▲ 
                               | 
              +---------------------------------+                  
              |                                 |
    +------------------+               +------------------+     
    |    RealSubject   | ◄ ------------|  RealDirectory   |     
    +------------------+               +------------------+
---

## 📦 Class Diagram

                       +----------------------+
                       |     <<interface>>    |
                       |    DirectoryAccess   |
                       +----------------------+
                       | + create(name)       |
                       | + rename(old, new)   |
                       | + delete(name)       |
                       +----------+-----------+
                                  ▲   
                                  |
                +--------------------------------------+
                |                                      |
    +------------------------+        +---------------------------+
    |     RealDirectory      |        |      DirectoryProxy       |
    |  (implements interface)|        |   (implements interface)  |
    +------------------------+◄ ------+---------------------------+
    | + create(name)         |        | - role : String           |
    | + rename(old, new)     |        | - real : RealDirectory    |
    | + delete(name)         |        | + create(name)            |
    |                        |        | + rename(old, new)        |
    |                        |        | + delete(name)            |
    +------------------------+        +---------------------------+

---

## ✅ Consequences

### 👍 Advantages:
- Adds access control **without modifying** the actual class.
- Helps separate **business logic** (RealDirectory) from **authorization logic** (Proxy).
- Easy to maintain and extend (e.g., more roles or more rules).

### 👎 Disadvantages:
- Slight overhead due to additional layer (proxy).
- Proxy must mirror the interface of the real object.

---

### 📁 Folder Structure

    accesscontrol/
    └── +
        ├── DirectoryAccess.java     // Interface with directory operations
        ├── RealDirectory.java       // Actual implementation of operations
        ├── DirectoryProxy.java      // Role-based access control proxy
        └── Main.java                // Client code to test the proxy

## 🛠️ Compile & Run the Program

```java

javac accesscontrol/proxy/*.java

▶️ 
java accesscontrol.Main

💻 Output
Directory 'Projects' created.
Directory renamed from 'Projects' to 'FinalProjects'.
Directory 'FinalProjects' deleted.

Directory 'Notes' created.
Access denied: Only admin can rename directories.
Access denied: Only admin can delete directories.



