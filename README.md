# ☕ Java Database Connectivity (JDBC) & CRUD Operations

A foundational repository dedicated to connecting Java applications with relational databases using JDBC, implementing standard CRUD operations, and understanding database connectivity best practices.

---

### 🤔 What is JDBC?
**JDBC (Java Database Connectivity)** is an official Java API (Application Programming Interface) standard defined by Oracle that enables Java applications to interact with relational databases. It provides a standard set of classes and interfaces (`Connection`, `Statement`, `PreparedStatement`, `ResultSet`) so your Java code can talk to any database (MySQL, PostgreSQL, Oracle) uniformly without rewriting your core logic.

### 💡 Why is JDBC Important?
* **Database Independence:** By using JDBC interfaces, your application code remains decoupled from the specific database vendor.
* **Standardized Persistence:** It bridges the gap between object-oriented Java code and table-based relational databases.
* **Foundation for ORMs:** Learning raw JDBC gives you deep under-the-hood knowledge of how higher-level frameworks like **Hibernate** and **Spring Data JPA** operate beneath abstractions.

### 🐬 Why MySQL?
* **Relational Storage:** MySQL is one of the most widely used open-source Relational Database Management Systems (RDBMS) in enterprise software development.
* **Seamless Integration:** Combined with the MySQL JDBC Driver (`mysql-connector-j`), it allows lightning-fast execution of Structured Query Language (SQL) statements directly from Java runtimes.

---

### 🛠️ Core CRUD Operations Implemented
This repository covers the four fundamental operations required for persistent applications:

1. **Create (`INSERT`):** Adding new records into database tables securely using `PreparedStatement` to prevent SQL injection.
2. **Read (`SELECT`):** Fetching and mapping database records into Java objects using `ResultSet`.
3. **Update (`UPDATE`):** Modifying existing row attributes based on unique identifiers.
4. **Delete (`DELETE`):** Removing unnecessary records safely while respecting foreign key constraints.

---

### 🚀 Getting Started & Execution
1. **Prerequisites:** Ensure you have Java 17+, MySQL Server, and MySQL Workbench or Beekeeper Studio installed.
2. **Driver Dependency:** Include the MySQL JDBC driver (`mysql-connector-j`) in your project's build path or dependencies.
3. **Configuration:** Provide your local database credentials (`url`, `username`, `password`) inside your database connection utility.
4. **Run:** Execute your main class to test and verify database operations:
   ```bash
   javac Main.java
   java Main
