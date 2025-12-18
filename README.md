# COMP305 – University Platform Core Components

## Course
**COMP 305: Object-Oriented Programming JavaII**

## Project Title
**University Online Learning Platform – Core Backend Components**

---

## 📌 Project Overview
This project implements the core backend components of a University Online Learning Platform using **Java**.  
It demonstrates key **Object-Oriented Programming (OOP)** concepts including:

- Encapsulation
- Inheritance
- Polymorphism
- Abstraction and Interfaces
- Collections Framework
- Exception Handling
- File I/O (Character Streams)
- JDBC (Database connectivity concept)
- Basic GUI design (conceptual)

The project is structured according to best Java package organization practices.

---

## 🗂 Project Structure



COMP305_UniversityPlatform/
│
├── model/
│ ├── Student.java
│ ├── Course.java
│ ├── OnlineCourse.java
│ ├── Lecturer.java
│ ├── FullTimeLecturer.java
│ ├── PartTimeLecturer.java
│
├── interfaces/
│ └── Payable.java
│
├── exceptions/
│ └── GradeNotFoundException.java
│
├── main/
│ └── Main.java
│
├── io/
│ └── FileProcessor.java
│
├── gui/
│ └── LoginGUI.txt (Text description only, NOT actual Swing code)
│
└── jdbc/
└── LoginValidation.java


---

## 🧠 Description of Key Components

### 1️⃣ Model Package (`model`)
Contains the core domain classes:
- `Student` – student details and comparison logic
- `Course` – base course class
- `OnlineCourse` – extends Course (Inheritance & Polymorphism)
- `Lecturer` – base lecturer class
- `FullTimeLecturer` & `PartTimeLecturer` – implement salary logic

### 2️⃣ Interfaces (`interfaces`)
- `Payable` – defines a contract for salary calculation (Abstraction)

### 3️⃣ Exceptions (`exceptions`)
- `GradeNotFoundException` – custom exception for missing student grades

### 4️⃣ Main Package (`main`)
- `Main.java` – entry point of the application
- Demonstrates:
  - Dynamic binding
  - Collections (HashMap)
  - Exception handling
  - File processing
  - Lecturer payments

### 5️⃣ I/O Package (`io`)
- `FileProcessor` – reads from `input.txt`, converts content to uppercase, and writes to `output.txt`

### 6️⃣ GUI Package (`gui`)
- `LoginGUI.txt` – text-based description of a login GUI layout and components

### 7️⃣ JDBC Package (`jdbc`)
- `LoginValidation` – demonstrates secure database login using JDBC and PreparedStatement

---

## ▶ How to Compile and Run the Project

### Step 1: Navigate to the project directory
```bash
cd ~/COMP305_UniversityPlatform

Step 2: Compile all Java files
javac model/*.java interfaces/*.java exceptions/*.java io/*.java main/*.java

Step 3: Run the application
java main.Main

 Expected Output

When executed successfully, the program:

Displays course and online platform details

Calculates lecturer payments

Demonstrates dynamic binding

Handles missing grades using a custom exception

Processes text files using character streams

Assignment Compliance

This project fully satisfies all requirements of the COMP 305 Practical Takeaway Assignment, including:

Core OOP principles

Interfaces and abstraction

Collections and exception handling

File I/O operations

GUI and JDBC concepts

 Author

Andrew Odhiambo Otieno
Bachelor of Science in Computer Science

 Conclusion

This project demonstrates a complete, well-structured, and practical application of Object-Oriented Programming concepts in Java, suitable for academic evaluation and further system extension.