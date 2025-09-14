# Student Database App

A **Java console application** to manage student records using **MySQL**.  
Supports **insert, view, update, and delete** operations via a menu.

---

## Prerequisites

- Java JDK 8+  
- MySQL Server running  
- MySQL Connector/J added to classpath  

---

## Database Setup

```sql
CREATE DATABASE studentdb;
USE studentdb;

CREATE TABLE students (
    id INT PRIMARY KEY,
    name VARCHAR(100),
    age INT,
    department VARCHAR(100)
);
Run the App
1. Insert Student
2. View All Students
3. Update Student Department
4. Delete Student
5. Exit

