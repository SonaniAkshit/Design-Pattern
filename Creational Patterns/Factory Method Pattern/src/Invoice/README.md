# 🧾 Invoice Generator - Factory Design Pattern (Java)

This Java project is a console-based **Invoice Generator** that uses the **Factory Design Pattern** to simulate generating invoices of various formats (with or without headers, footers, or both). It demonstrates how to decouple object creation logic from the main program using a factory class.

---

## 📁 Project Structure

<br>📁 Invoice_Generator/
<br>│
<br>├── Invoice.java                               # Invoice interface
<br>├── Invoice_with_all.java                      # Invoice with header and footer
<br>├── Invoice_with_header.java                   # Invoice with header only
<br>├── Invoice_with_footer.java                   # Invoice with footer only
<br>├── Invoice_without_all.java                   # Invoice without header and footer
<br>├── Invoice_without_header_with_footer.java    # Invoice with footer only
<br>├── Invoice_without_footer_with_header.java    # Invoice with header only
<br>├── InvoiceFactory.java                        # Factory class to return invoice types
<br>└── Main.java                                  # Main class to interact with user

---
## 🧱 Structure Diagram(ref. GoF)
             +---------------+                        +-----------------+
             |   Product     |                        |     Product     |
             +---------------+                        +-----------------+
                     ▲                                | FactoryMethod() |             
                     |                                | AnOperation()   |
                     |                                +-----------------+
                     |                                         ▲
                     |                                         |
          +---------------------+                              |
          |   ConcreteProduct   |◄ ------------------ +-----------------+ 
          +---------------------+                     |     Product     | 
                                                      +-----------------+ 
                                                      | FactoryMethod() |
                                                      +-----------------+
  
---

## 🧠 Class Diagram

          +----------------------+
          |      Invoice         |<-------------------------------+
          |----------------------|                                |
          | +getItype() : String |                                |
          +----------------------+                                |
                   ▲                                             ▲
     +------------------------------+               +------------------------------+
     |     Invoice_with_all         |               |     Invoice_with_header       |
     +------------------------------+               +------------------------------+
     | +getItype() : String         |               | +getItype() : String         |
     +------------------------------+               +------------------------------+
                   ▲                                             ▲
     +------------------------------+               +------------------------------+
     |     Invoice_with_footer      |               |   Invoice_without_all         |
     +------------------------------+               +------------------------------+
     | +getItype() : String         |               | +getItype() : String         |
     +------------------------------+               +------------------------------+
                   ▲                                             ▲
     +------------------------------------------------+   +----------------------------------------------+
     | Invoice_without_footer_with_header             |   | Invoice_without_header_with_footer          |
     +------------------------------------------------+   +----------------------------------------------+
     | +getItype() : String                            |   | +getItype() : String                         |
     +------------------------------------------------+   +----------------------------------------------+

                         +------------------------------+
                         |       InvoiceFactory         |
                         |------------------------------|
                         | +getInvoice(int) : Invoice   |
                         +------------------------------+


---

## 👥 Participants

| Class/Interface                     | Role |
|------------------------------------|------|
| `Invoice`                          | Interface defining the contract for all invoice types. |
| `Invoice_with_all`                | Concrete class representing an invoice with header and footer. |
| `Invoice_with_header`             | Concrete class for invoice with header only. |
| `Invoice_with_footer`             | Concrete class for invoice with footer only. |
| `Invoice_without_all`            | Represents a plain invoice without any header/footer. |
| `Invoice_without_header_with_footer` | Footer only invoice. |
| `Invoice_without_footer_with_header` | Header only invoice. |
| `InvoiceFactory`                  | Provides the appropriate `Invoice` object based on user choice. |
| `Main`                             | Acts as the client. Handles user interaction and displays results. |

---

## ✅ Benefits of Using Factory Design Pattern

### ✅ Advantages
- Simplifies object creation logic.
- Promotes loose coupling between classes.
- Easy to extend and maintain.

### ⚠️ Disadvantages
- Can increase the number of classes in larger projects.
- Might add complexity for very simple use-cases.

---

## 🧪 How to Run

1. Compile all Java files:
```bash
javac Invoice/*.java

****menu****
1)Invoice with all
2)Invoice with header
3)Invoice with footer
4)Invoice without all
5)Invoice without footer with header
6)Invoice without header with footer
0 for Exit
************
>1
Invoice With All.
