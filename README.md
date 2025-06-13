## Java OOP Logic Suite – Core Programming Exercises

This is a collection of simple Java class-based programs built during coursework at the Polish-Japanese Academy of Information Technology (PJATK). The project demonstrates core object-oriented programming (OOP) concepts, clean code practices, and unit testing using JUnit.

---

### 🚀 Features

* Card comparison system using enums and logical rules
* Student grading logic based on attendance percentage
* Custom date class with format validation and display
* Clock class simulating ticking and time management
* Basic statistical calculations on numeric sets
* Invoice (faktura) value calculation with validation

---

### 🛠️ Technologies

* Java (standard libraries only)
* JUnit 5 (unit testing)
* Clean Code & SOLID principles

---

### 📁 Structure

```
model/
│
├── Card.java        – defines a playing card and comparison logic
├── Student.java     – stores student info and calculates final grade
├── MyDate.java      – validates and displays date in dd/MM/yyyy format
├── Clock.java       – simulates digital clock with ticking and formatting
├── Numbers.java     – performs statistical analysis (sum, avg, min, max)
├── Invoice.java     – represents a product invoice and total calculation
```

```
test/
│
├── CardTest.java    – unit tests for card comparisons
├── StudentTest.java – unit tests for student logic
├── MyDateTest.java  – unit tests for date validation and display
├── ClockTest.java   – unit tests for time logic
├── NumbersTest.java – unit tests for math operations
├── InvoiceTest.java – unit tests for invoice calculations
```

---

### 🎓 Context

This project was created as part of **first-year Java programming (POJ)** coursework at PJATK Gdańsk. Each class demonstrates principles of encapsulation, responsibility segregation, and logic isolation using unit tests for verification.

---

### 📸 Preview (Example: Clock Class Output)

```
Initial time: [12:00:00]
tick()
→ [12:00:01]
tickDown()
→ [12:00:00]
tickDown()
→ [11:59:59]
```
