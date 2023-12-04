<!-- omit in toc -->
# Data Modeling Using RDBMS (DDL & DML) - 12/04

In the digital era, where data plays a pivotal role in shaping decisions and driving innovations, databases serve as the foundational infrastructure for storing, managing, and retrieving information.

<!-- omit in toc -->
## Content

- [What is a Database?](#what-is-a-database)
  - [Key Components of a Database](#key-components-of-a-database)
  - [Types of Databases](#types-of-databases)
  - [Significance of Databases](#significance-of-databases)
- [SQL](#sql)
  - [Key Features of SQL](#key-features-of-sql)
  - [Fundamental SQL Concepts](#fundamental-sql-concepts)
    - [Tables](#tables)
    - [Constraints](#constraints)
    - [Joins](#joins)
    - [Indexes](#indexes)
- [MySQL](#mysql)
  - [Key Features of MySQL](#key-features-of-mysql)
  - [MySQL Architecture](#mysql-architecture)
  - [MySQL in Action](#mysql-in-action)
- [Data Definition Language (DDL) in SQL](#data-definition-language-ddl-in-sql)
  - [Creating a Database](#creating-a-database)
  - [Creating Tables](#creating-tables)
  - [Defining Constraints](#defining-constraints)
  - [Altering Tables](#altering-tables)
  - [Dropping Tables and Databases](#dropping-tables-and-databases)
  - [Views](#views)
  - [Indexes](#indexes-1)
  - [Triggers](#triggers)
- [Data Manipulation Language (DML) in SQL](#data-manipulation-language-dml-in-sql)
  - [SELECT Statement](#select-statement)
  - [2. INSERT Statement](#2-insert-statement)
  - [UPDATE Statement](#update-statement)
  - [DELETE Statement](#delete-statement)
  - [Transactions](#transactions)
  - [MERGE Statement](#merge-statement)
  - [Cursors](#cursors)
  - [Common Table Expressions (CTEs)](#common-table-expressions-ctes)
- [Defining Constraints in SQL](#defining-constraints-in-sql)
  - [Primary Key Constraint](#primary-key-constraint)
  - [Foreign Key Constraint](#foreign-key-constraint)
  - [Unique Constraint](#unique-constraint)
  - [Check Constraint](#check-constraint)
  - [Not Null Constraint](#not-null-constraint)
  - [Default Constraint](#default-constraint)
  - [Naming Constraints](#naming-constraints)

## What is a Database?

A database is a systematic collection of data organized in a structured format, designed to be easily accessed, managed, and updated. It serves as a centralized repository for storing and retrieving information, providing a reliable and efficient way to manage vast amounts of data. Databases are essential in various applications, ranging from simple desktop applications to complex enterprise systems.

### Key Components of a Database

1. **Tables**   
   At the core of any database are tables, which organize data into rows and columns. Each table is designed to represent a specific entity, such as customers, products, or transactions. The columns define the attributes of the entity, while the rows contain the actual data.

2. **Fields (Attributes)**   
   Fields, also known as attributes, are the individual data elements within a table. They represent the properties of the entities and hold specific types of information, such as names, dates, or numerical values.

3. **Records (Rows)**   
   A record is a complete set of information related to a specific entity in a table. It consists of values for each field, representing a single instance of the entity being modeled.

4. **Keys**   
   Keys are crucial for establishing relationships between tables. Primary keys uniquely identify each record in a table, while foreign keys link records between different tables. These keys ensure data integrity and enable efficient data retrieval.

5. **Indexes**   
   Indexes improve the performance of database queries by providing a quick reference to the location of data within a table. They are analogous to the index in a book, allowing the database engine to locate and retrieve specific data faster.

### Types of Databases

1. **Relational Databases**   
   Relational databases organize data into tables with predefined relationships between them. SQL (Structured Query Language) is commonly used to query and manage relational databases. Examples include MySQL, PostgreSQL, and Oracle Database.

2. **NoSQL Databases**   
   NoSQL databases are designed to handle unstructured or semi-structured data and offer flexibility in data models. They are suitable for scenarios where data is constantly changing or evolving. Popular NoSQL databases include MongoDB, Cassandra, and Redis.

### Significance of Databases

1. **Data Integrity**   
   Databases enforce data integrity through constraints, ensuring that data remains accurate and consistent. This is achieved through the use of primary keys, foreign keys, and other constraints.

2. **Data Security**   
   Databases implement security measures such as authentication and authorization to control access to sensitive information. Encryption is often employed to protect data at rest and during transmission.

3. **Scalability**   
   Databases are designed to scale horizontally or vertically to accommodate growing amounts of data. This scalability is crucial for handling increasing workloads and maintaining system performance.

4. **Data Retrieval and Querying**   
   Efficient data retrieval is a hallmark of databases. SQL queries allow users to extract specific information from large datasets quickly, supporting decision-making processes.

## SQL

Structured Query Language (SQL) stands as the cornerstone of relational database management systems (RDBMS), empowering developers, data analysts, and database administrators to interact with and manipulate data seamlessly.

SQL, originally developed by IBM in the 1970s, emerged as a standardized language for interacting with databases. Over time, it has evolved into an industry-standard language used by various database systems, including Oracle, MySQL, Microsoft SQL Server, and PostgreSQL. SQL's popularity stems from its simplicity, versatility, and ability to handle complex data operations.

### Key Features of SQL

1. **Declarative Language**   
   SQL is a declarative language, meaning users specify the desired result without detailing the exact steps to achieve it. This characteristic allows for a more intuitive and user-friendly approach to querying databases.

2. **Data Querying**   
   SQL excels in retrieving data from databases through the use of SELECT statements. These statements allow users to specify the columns, conditions, and sorting criteria to tailor the query results to their specific needs.

3. **Data Manipulation**   
   Beyond querying, SQL provides powerful commands for manipulating data. INSERT, UPDATE, and DELETE statements facilitate the addition, modification, and removal of data, ensuring the integrity of the database.

4. **Data Definition**   
   SQL enables the definition of database structure using statements like CREATE, ALTER, and DROP. These statements allow users to create and modify tables, define relationships, and manage the overall database schema.

5. **Data Control**   
   SQL includes commands for managing database security and controlling access. GRANT and REVOKE statements authorize or revoke permissions, safeguarding sensitive data from unauthorized access.

### Fundamental SQL Concepts

#### Tables

   In SQL, data is stored in tables, which are structured collections of rows and columns. Each table represents a specific entity, such as customers or products, and follows a defined schema.

#### Constraints

   Constraints ensure data integrity by imposing rules on the values that can be stored in a table. Common constraints include PRIMARY KEY, FOREIGN KEY, UNIQUE, NOT NULL, and CHECK.

#### Joins

   Joins allow users to combine data from multiple tables based on common columns. SQL supports various types of joins, including INNER JOIN, LEFT JOIN, and RIGHT JOIN, enabling flexible data retrieval.

#### Indexes

   Indexes enhance query performance by providing quick access to specific data within a table. They act as a roadmap for the database engine to locate and retrieve information efficiently.

## MySQL

In the ever-evolving landscape of relational database management systems (RDBMS), MySQL stands out as a stalwart, driving the backbone of countless applications and systems worldwide.

MySQL, initially developed by a Swedish company, MySQL AB, in the mid-1990s, quickly gained popularity for its open-source nature, reliability, and scalability. It has since become one of the most widely used relational database systems, backed by a vibrant community and actively maintained by Oracle Corporation, which acquired MySQL AB in 2008.

### Key Features of MySQL

1. **Open Source Nature**   
   MySQL's open-source licensing allows users to access, modify, and distribute the source code freely. This has contributed to its widespread adoption and vibrant community support.

2. **Cross-Platform Compatibility**   
   MySQL is platform-independent, supporting various operating systems, including Linux, Windows, and macOS. This flexibility makes it a versatile choice for diverse application environments.

3. **Data Security**   
   MySQL incorporates robust security features, including user authentication, access control, and encryption. It supports SSL/TLS for secure connections, ensuring the confidentiality and integrity of sensitive data.

4. **High Performance**   
   MySQL is renowned for its speed and efficiency. Its storage engine architecture, query optimization, and indexing mechanisms contribute to quick and reliable data retrieval, making it suitable for high-performance applications.

5. **Scalability**   
   MySQL is designed to scale horizontally and vertically, allowing for seamless expansion to handle growing datasets and increasing workloads. This scalability is vital for applications that experience dynamic growth.

### MySQL Architecture

1. **Server Components**   
   MySQL comprises server components responsible for handling client requests, query processing, and overall system management. Key components include the MySQL Server, the Query Cache, and the Connection Pool.

2. **Storage Engines**   
   MySQL supports multiple storage engines, each with its unique strengths. InnoDB, the default engine, provides ACID compliance and supports transactions, while MyISAM offers high-speed performance for read-intensive operations.

3. **Pluggable Authentication**   
   MySQL supports various authentication methods, including native authentication, LDAP, and PAM. This flexibility allows users to implement secure and customized authentication mechanisms.

4. **Replication and High Availability**   
   MySQL offers robust replication features, allowing for the creation of replicas for data redundancy and load balancing. Additionally, tools like MySQL Cluster enable the deployment of high-availability solutions.

### MySQL in Action

1. **Database Creation and Management**   
   MySQL enables the creation, modification, and deletion of databases through SQL commands, providing a straightforward interface for managing data structures.

2. **Data Manipulation**   
   Using SQL queries, users can insert, update, and delete data in MySQL tables. The language's versatility empowers developers and administrators to perform complex data manipulations effortlessly.

3. **Stored Procedures and Triggers**   
   MySQL supports stored procedures and triggers, allowing for the execution of predefined routines and automatic responses to specific events within the database.

## Data Definition Language (DDL) in SQL

Data Definition Language (DDL) is a critical component of SQL that allows database administrators and developers to define and manage the structure of a relational database

### Creating a Database

The first step in using DDL is creating a database. The `CREATE DATABASE` statement accomplishes this. Let's create a database named "CompanyDB"

```sql
CREATE DATABASE CompanyDB;
```

### Creating Tables

Once a database exists, tables can be created to organize data. The `CREATE TABLE` statement defines the table structure. For example, let's create an "Employees" table

```sql
CREATE TABLE Employees (
    EmployeeID INT PRIMARY KEY,
    FirstName VARCHAR(50),
    LastName VARCHAR(50),
    Salary DECIMAL(10, 2)
);
```

Here, we define columns (EmployeeID, FirstName, LastName, Salary) with their respective data types.

### Defining Constraints

Constraints ensure data integrity. Common constraints include

- Primary Key
  
  ```sql
  CREATE TABLE Employees (
      EmployeeID INT PRIMARY KEY,
      ...
  );
  ```

- Foreign Key
  
  ```sql
  CREATE TABLE Departments (
      DepartmentID INT PRIMARY KEY,
      DepartmentName VARCHAR(50)
  );

  CREATE TABLE Employees (
      EmployeeID INT PRIMARY KEY,
      DepartmentID INT,
      FOREIGN KEY (DepartmentID) REFERENCES Departments(DepartmentID)
  );
  ```

- Unique Constraint
  
  ```sql
  CREATE TABLE Employees (
      EmployeeID INT PRIMARY KEY,
      Email VARCHAR(100) UNIQUE,
      ...
  );
  ```

### Altering Tables

The `ALTER TABLE` statement modifies existing table structures. Examples include adding a new column

```sql
ALTER TABLE Employees
ADD COLUMN BirthDate DATE;
```

### Dropping Tables and Databases

To remove a table or a database, the `DROP` statement is used. Caution is advised as this action deletes all data.

- Dropping a Table
  
  ```sql
  DROP TABLE Employees;
  ```

- Dropping a Database
  
  ```sql
  DROP DATABASE CompanyDB;
  ```

### Views

Views provide a virtual table based on the result of a SELECT query. Creating a view is achieved using the `CREATE VIEW` statement

```sql
CREATE VIEW HighSalaryEmployees AS
SELECT EmployeeID, FirstName, LastName
FROM Employees
WHERE Salary > 50000;
```

### Indexes

Indexes enhance query performance by facilitating quicker data retrieval. Creating an index is done using the `CREATE INDEX` statement

```sql
CREATE INDEX idx_EmployeeLastName
ON Employees(LastName);
```

### Triggers

Triggers are special stored procedures that are automatically executed when an event (e.g., INSERT, UPDATE, DELETE) occurs. Creating a trigger involves the `CREATE TRIGGER` statement

```sql
CREATE TRIGGER BeforeEmployeeInsert
BEFORE INSERT ON Employees
FOR EACH ROW
SET NEW.EmployeeID = NEW.EmployeeID + 1000;
```

This trigger increments the EmployeeID by 1000 before each insertion.

## Data Manipulation Language (DML) in SQL

Data Manipulation Language (DML) is a key aspect of SQL that empowers users to interact with and manipulate data stored in a relational database.

### SELECT Statement

The primary function of DML is to query and retrieve data from the database. The `SELECT` statement is the workhorse for this task

```sql
SELECT FirstName, LastName, Salary
FROM Employees
WHERE DepartmentID = 101;
```

- **Projection** Choosing specific columns (`FirstName`, `LastName`, `Salary`).
- **Filtering** Retrieving data based on a condition (`DepartmentID = 101`).

### 2. INSERT Statement

The `INSERT` statement adds new records to a table

```sql
INSERT INTO Employees (FirstName, LastName, Salary)
VALUES ('John', 'Doe', 60000);
```

### UPDATE Statement

To modify existing data, the `UPDATE` statement is used

```sql
UPDATE Employees
SET Salary = Salary * 1.1
WHERE DepartmentID = 101;
```

### DELETE Statement

The `DELETE` statement removes records from a table

```sql
DELETE FROM Employees
WHERE DepartmentID = 101;
```

### Transactions

Transactions ensure data consistency by grouping multiple DML operations into a single unit. The `BEGIN TRANSACTION`, `COMMIT`, and `ROLLBACK` statements are used

```sql
BEGIN TRANSACTION;

UPDATE Employees
SET Salary = Salary * 1.1
WHERE DepartmentID = 101;

DELETE FROM Employees
WHERE DepartmentID = 102;

COMMIT;
```

### MERGE Statement

The `MERGE` statement performs multiple DML operations in a single statement. It's useful for upserts (INSERT or UPDATE)

```sql
MERGE INTO TargetTable AS Target
USING SourceTable AS Source
ON Target.EmployeeID = Source.EmployeeID
WHEN MATCHED THEN
    UPDATE SET Target.Salary = Source.Salary
WHEN NOT MATCHED THEN
    INSERT (EmployeeID, FirstName, LastName, Salary)
    VALUES (Source.EmployeeID, Source.FirstName, Source.LastName, Source.Salary);
```

### Cursors

Cursors provide a mechanism to iterate through the result set row by row. They are used in stored procedures and triggers

```sql
DECLARE employeeCursor CURSOR FOR
SELECT EmployeeID, FirstName, LastName
FROM Employees;

OPEN employeeCursor;

FETCH NEXT FROM employeeCursor;

CLOSE employeeCursor;
```

### Common Table Expressions (CTEs)

CTEs allow the definition of temporary result sets that can be referenced within a SELECT, INSERT, UPDATE, or DELETE statement

```sql
WITH HighSalaryEmployees AS (
    SELECT EmployeeID, FirstName, LastName
    FROM Employees
    WHERE Salary > 80000
)
SELECT * FROM HighSalaryEmployees;
```

## Defining Constraints in SQL

Constraints in SQL play a pivotal role in maintaining the integrity and reliability of data within a relational database.

### Primary Key Constraint

A Primary Key uniquely identifies each record in a table. It ensures that no duplicate values exist within the specified column or columns. The following example creates a table with a Primary Key

```sql
CREATE TABLE Employees (
    EmployeeID INT PRIMARY KEY,
    FirstName VARCHAR(50),
    LastName VARCHAR(50)
);
```

### Foreign Key Constraint

Foreign Keys establish relationships between tables, ensuring referential integrity. They link a column or a set of columns in one table to the Primary Key in another table. Consider the following example

```sql
CREATE TABLE Departments (
    DepartmentID INT PRIMARY KEY,
    DepartmentName VARCHAR(50)
);

CREATE TABLE Employees (
    EmployeeID INT PRIMARY KEY,
    FirstName VARCHAR(50),
    LastName VARCHAR(50),
    DepartmentID INT,
    FOREIGN KEY (DepartmentID) REFERENCES Departments(DepartmentID)
);
```

### Unique Constraint

The Unique Constraint ensures that all values in a specified column or a group of columns are unique. This constraint is useful when you want to maintain data integrity without using the Primary Key constraint. Example

```sql
CREATE TABLE Employees (
    EmployeeID INT PRIMARY KEY,
    Email VARCHAR(100) UNIQUE,
    ...
);
```

### Check Constraint

Check Constraints impose conditions on the values that can be entered into a column. This ensures that only valid data is stored. In this example, a Check Constraint ensures that the salary is greater than zero

```sql
CREATE TABLE Employees (
    EmployeeID INT PRIMARY KEY,
    Salary DECIMAL(10, 2) CHECK (Salary > 0),
    ...
);
```

### Not Null Constraint

The Not Null Constraint ensures that a column cannot have a NULL value. It enforces the presence of data in the specified column. For instance

```sql
CREATE TABLE Employees (
    EmployeeID INT PRIMARY KEY,
    FirstName VARCHAR(50) NOT NULL,
    LastName VARCHAR(50) NOT NULL,
    ...
);
```

### Default Constraint

Default Constraints specify a default value for a column. If no value is provided during an INSERT operation, the default value is used. In the following example, the default value for the "Status" column is set to 'Active'

```sql
CREATE TABLE Employees (
    EmployeeID INT PRIMARY KEY,
    FirstName VARCHAR(50),
    LastName VARCHAR(50),
    Status VARCHAR(20) DEFAULT 'Active'
);
```

### Naming Constraints

Constraints can be named for clarity and easy reference. This is particularly useful in large databases. In the following example, a Primary Key is given the name "PK_Employees"

```sql
CREATE TABLE Employees (
    EmployeeID INT,
    CONSTRAINT PK_Employees PRIMARY KEY (EmployeeID)
);
```
