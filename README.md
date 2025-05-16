# 💼 Employee Payroll Management System

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

| Layer              | Technology             |
|-------------------|------------------------|
| 💻 Frontend        | Java Swing GUI         |
| 💻 Backend         | Java                   |
| 🔌 Middleware      | JDBC                   |
| 🗄️ Database         | MySQL                  |

---

## 🧱 System Architecture

```

\[Java Swing GUI]
↓
\[Java Logic]
↓
\[JDBC API]
↓
\[MySQL DB]

```

---

## ⚙️ Working of the System

### 1. 🧾 Master Tab
* **New Employee Entry** – Input and save personal details  
* **Salary Entry** – Assign components: Basic, HRA, DA, MED, PF  
* **List Employee** – View all employee records  

### 2. ✏️ Update Tab
* **Update Employee** – Edit employee information  
* **Update Salary** – Modify salary components  
* **Take Attendance** – Mark Present, Half Day, or Leave  

### 3. 📊 Report Tab
* **Generate Payslip** – View breakdown of salary, tax, and net amount  
* **List Attendance** – Display monthly/periodic attendance  

### 4. 🧰 Utilities Tab
* **Notepad** – Open text editor  
* **Calculator** – For manual calculations  
* **Chrome** – Launch browser  

### 5. ❌ Exit Tab
* Prompts to save unsaved changes before exiting  

---

## 🧮 Salary Calculation Logic

```

Gross Salary = Basic + HRA + DA + MED + PF
Tax = 2.1% of Gross Salary
Net Salary = Gross Salary - Tax

````

**Example**:  
If all components are ₹1000:
* Gross Salary = ₹5000  
* Tax = 2.1% of ₹5000 = ₹105  
* Net Salary = ₹4895

---

## 🖼️ Screenshots

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


### ✅ Payslip Generation 
<img src="https://github.com/user-attachments/assets/7eb7ccb6-ad73-4753-a9c5-b0eb97d01793" alt="Payslip Generation" width="500"/>

---

### ✅ Attendance List  
<img src="https://github.com/user-attachments/assets/071cafcc-fb2a-474f-a1ca-c03ca21f327e" alt="Attendance List" width="500"/>

---

### ✅ Key Functional Tabs
<img src="https://github.com/user-attachments/assets/f051cc1a-a8a7-456b-9599-93e249921941" alt="List Features" width="500"/>

---
