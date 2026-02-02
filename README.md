# 💼 Employee Payroll Management System

[![Download JAR](https://img.shields.io/badge/Download-JAR-blue?style=for-the-badge&logo=java)](https://github.com/sayaligurav7789/Emp_Payroll/releases)

An automated Java-based system to manage employee information, track attendance, calculate salaries, and generate payslips — designed to simplify payroll operations and reduce manual errors.

---

## 🚩 Problem Statement

To design and implement a Java-based **Employee Payroll Management System** that automates:

* Employee information management  
* Salary calculation  
* Attendance tracking  
* Payslip and report generation  

This minimizes manual effort and reduces errors in payroll processing.

---

## 📌 Introduction

Payroll management is a core function in every organization. When handled manually, it becomes time-consuming and prone to errors.

This system provides an automated solution for:

* 📋 Digital employee data entry  
* 💰 Salary and attendance tracking  
* 🧾 Payslip generation  

It is developed using **Java Swing** for the GUI, **Java** for business logic, **JDBC** for database connectivity, and **MySQL** for data storage. Integrated utilities like **Notepad**, **Calculator**, and **Chrome Browser** add convenience, making it a complete administrative tool.

---

## 🛠️ Tech Stack

| Layer | Technology | Description |
|------|-----------|-------------|
| 🎨 Frontend | Java Swing | Desktop GUI for user interaction |
| ⚙️ Backend | Java | Business logic & application flow |
| 🔌 Data Access | JDBC | Database connectivity layer |
| 🗄️ Database | MySQL | Relational data storage |
| 📦 Deployment | Runnable JAR | Packaged desktop application |

---

## 🌐 System Architecture

The **Employee Payroll Management System** follows a **layered architecture**, ensuring clear separation of concerns, maintainability, and scalability.

---

### 🔹 High-Level Architecture Diagram

```mermaid
flowchart TB
    U[👩‍💼 User / Admin] --> JAR[📦 Runnable JAR<br/>Payroll_System.jar]

    JAR --> UI[🖥️ Java Swing GUI]
    UI --> BL[⚙️ Application & Business Logic]

    BL --> SAL[💰 Salary Processing]
    BL --> ATT[🕒 Attendance Management]
    BL --> EMP[👤 Employee Management]
    BL --> REP[🧾 Payslip & Reports]

    BL --> JDBC[🔌 JDBC API]
    JDBC --> DB[(🗄️ MySQL Database)]

    JAR --> CFG[⚙️ config.properties]
```

---

### 🔹 Application Workflow
```mermaid
sequenceDiagram
    participant U as User
    participant UI as Swing UI
    participant BL as Business Logic
    participant DB as MySQL DB

    U->>UI: Enter credentials
    UI->>BL: Validate login
    BL->>DB: Query login table
    DB-->>BL: Authentication result
    BL-->>UI: Access granted / denied

    U->>UI: Perform operations
    UI->>BL: Process request
    BL->>DB: Execute SQL queries
    DB-->>BL: Data response
    BL-->>UI: Display result
```

---

## ⚙️ Working of the System

### 1. Master Tab
* **New Employee Entry** – Input and save personal details  
* **Salary Entry** – Assign components: Basic, HRA, DA, MED, PF  
* **List Employee** – View all employee records  

### 2. Update Tab
* **Update Employee** – Edit employee information  
* **Update Salary** – Modify salary components  
* **Take Attendance** – Mark Present, Half Day, or Leave  

### 3. Report Tab
* **Generate Payslip** – View breakdown of salary, tax, and net amount  
* **List Attendance** – Display monthly/periodic attendance  

### 4. Utilities Tab
* **Notepad** – Open text editor  
* **Calculator** – For manual calculations  
* **Chrome** – Launch browser  

### 5. Exit Tab
* Prompts to save unsaved changes before exiting  

---

## 💰 Salary Calculation Logic

```

Gross Salary = Basic + HRA + DA + MED + PF
Tax = 2.1% of Gross Salary
Net Salary = Gross Salary - Tax

````

📌**Example**:  
If all components are ₹1000:
* Gross Salary = ₹5000  
* Tax = 2.1% of ₹5000 = ₹105  
* Net Salary = ₹4895

---

## 🖼️ Snapshots

### ✅ Login 
<img src="https://github.com/user-attachments/assets/08fb2d80-2d4f-42b6-aee9-4be03bc4c032" alt="Login" width="300"/>

---

### ✅ Dashboard  
<img src="https://github.com/user-attachments/assets/8f721807-8ee2-4f81-b775-1a46707ec498" alt="Dashboard" width="500"/>

---

### ✅ Employee Registration 
<img src="https://github.com/user-attachments/assets/ff128af4-3d3f-4649-a0f2-a7524e4201c7" alt="Employee Registration" width="500"/>

---
### ✅ View Employee
<img src="https://github.com/user-attachments/assets/5c3ac4fc-b2d2-46d6-bb04-c6e4c727dbb3" alt="Employee List" width="500"/>

---
### ✅ Payslip Generation 
<img src="https://github.com/user-attachments/assets/7eb7ccb6-ad73-4753-a9c5-b0eb97d01793" alt="Payslip Generation" width="500"/>

---

### ✅ Attendance List  
<img src="https://github.com/user-attachments/assets/071cafcc-fb2a-474f-a1ca-c03ca21f327e" alt="Attendance List" width="500"/>

---

### ✅ Key Functional Tabs
<img src="https://github.com/user-attachments/assets/f051cc1a-a8a7-456b-9599-93e249921941" alt="List Features" width="500"/>

---

## ⚙️ Configuration (Required)

Before running the application, create a file named **`config.properties`**
in the same directory as `Payroll_System.jar`.

### 📌 Example `config.properties`
```properties
db.url=jdbc:mysql://localhost:3306/payroll
db.user=YOUR_DB_USERNAME
db.password=YOUR_DB_PASSWORD
```

### 📌 Ensure that:

- MySQL service is running
- Database name matches (payroll)
- Credentials are valid
---

## ▶️ How to Run

1. Download the runnable JAR from GitHub Releases  
2. Place `config.properties` beside the JAR  
3. Open terminal / command prompt in that folder  
4. Run:

```bash
java -jar Payroll_System.jar
```
---

## 🔐 Demo Login Credentials

| Username | Password |
|--------|----------|
| admin  | admin    |

⚠️ For demonstration purposes only.  
Credentials can be modified directly in the `login` table.

---

## 🗄️ Database Schema (Core Tables)

| Table Name | Description |
|----------|-------------|
| `login` | User authentication |
| `employee` | Employee personal details |
| `salary` | Salary components |
| `attendance` | Attendance records |

---

## 🔐 Security Considerations

- Database credentials are externalized using `config.properties`
- Sensitive configuration files are ignored via `.gitignore`
- Prevents credential exposure in public repositories

---

## 🚀 Key Highlights

✔ Modular layered architecture  
✔ Externalized database configuration  
✔ Runnable JAR deployment  
✔ Clean Swing-based UI  
✔ Real-time MySQL integration  
✔ Interview & resume ready project

---


## 👩‍💻 Author
### **Sayali Gurav 🌱**
 Computer Science Engineer 

---

🔗 **Connect with me**

[![GitHub](https://img.shields.io/badge/GitHub-000000?style=for-the-badge&logo=github)](https://github.com/sayaligurav7789)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-0A66C2?style=for-the-badge&logo=linkedin)](https://linkedin.com/in/sayali-gurav-9a3a302a5)
[![Portfolio](https://img.shields.io/badge/Portfolio-14B8A6?style=for-the-badge&logo=vercel&logoColor=white)](https://sayali-gurav7789-portfolio.vercel.app)
[![LeetCode](https://img.shields.io/badge/LeetCode-F89F1B?style=for-the-badge&logo=leetcode)](https://leetcode.com/sayaliGurav)
[![Email](https://img.shields.io/badge/Email-EA4335?style=for-the-badge&logo=gmail&logoColor=white)](mailto:sayligurab7789@gmail.com)

---

### ⭐ **Like This?** 
Don’t forget to give this repository a star - it really helps! 🌱




