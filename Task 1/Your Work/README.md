# Software Requirements Specification (SRS)

## Hospital Management System (HMS)

---

# 1. Introduction

## 1.1 Purpose

The purpose of this project is to develop a **Hospital Management System (HMS)** that automates and manages hospital operations efficiently. The system will help administrators, doctors, and patients manage hospital activities such as login authentication, patient records, doctor information, and appointment scheduling.

---

## 1.2 Scope

The Hospital Management System will provide the following modules:

* Login & Authentication Module
* Patient Management Module
* Doctor Management Module
* Appointment Management Module

The system will reduce manual work, improve data accuracy, and provide secure access to hospital information.

---

## 1.3 Objectives

* Maintain patient records digitally
* Manage doctor information efficiently
* Schedule and track appointments
* Provide secure login access
* Reduce paperwork and manual errors
* Improve hospital workflow

---

# 2. Overall Description

## 2.1 Product Perspective

The Hospital Management System is a standalone web-based or desktop-based application that centralizes hospital operations.

---

## 2.2 Product Features

### Main Features

1. User Login Authentication
2. Add/Edit/Delete Patients
3. Add/Edit/Delete Doctors
4. Book and Manage Appointments
5. Search Functionality
6. Database Management
7. User Role Access

---

## 2.3 User Classes and Characteristics

| User Type    | Description                              |
| ------------ | ---------------------------------------- |
| Admin        | Manages entire system                    |
| Doctor       | Views appointments and patient details   |
| Receptionist | Manages appointments and patient entries |
| Patient      | Can view appointment details             |

---

## 2.4 Operating Environment

* Operating System: Windows/Linux
* Frontend: HTML, CSS, JavaScript
* Backend: PHP / Java / Python / Node.js
* Database: MySQL

---

# 3. Functional Requirements

# 3.1 Login Module

## Description

The login module authenticates users before granting access.

## Functional Requirements

* User can login using username and password
* System validates credentials
* Invalid login shows error message
* Password should be encrypted
* Different roles have different access permissions

## Inputs

* Username
* Password

## Outputs

* Dashboard Access
* Error Message

---

# 3.2 Patient Management Module

## Description

This module manages patient information.

## Functional Requirements

* Add new patient
* Update patient information
* Delete patient records
* Search patient by ID or name
* View patient history

## Inputs

* Patient ID
* Name
* Age
* Gender
* Address
* Contact Number
* Disease Information

## Outputs

* Patient Record
* Patient Reports

---

# 3.3 Doctor Management Module

## Description

This module stores and manages doctor details.

## Functional Requirements

* Add doctor details
* Edit doctor information
* Delete doctor records
* Assign specialization
* View doctor schedules

## Inputs

* Doctor ID
* Doctor Name
* Specialization
* Phone Number
* Department

## Outputs

* Doctor Information
* Doctor Schedule

---

# 3.4 Appointment Management Module

## Description

This module manages patient appointments with doctors.

## Functional Requirements

* Book appointments
* Cancel appointments
* Update appointment status
* View appointment list
* Assign doctor to patient

## Inputs

* Appointment ID
* Patient ID
* Doctor ID
* Appointment Date
* Appointment Time

## Outputs

* Appointment Confirmation
* Appointment Schedule

---

# 4. Non-Functional Requirements

## 4.1 Performance Requirements

* System should respond within 3 seconds
* Support multiple users simultaneously

---

## 4.2 Security Requirements

* Password encryption
* Role-based access control
* Secure database storage

---

## 4.3 Reliability Requirements

* System should operate continuously
* Daily database backup

---

## 4.4 Usability Requirements

* User-friendly interface
* Easy navigation

---

## 4.5 Maintainability Requirements

* Modular coding structure
* Easy database maintenance

---

# 5. System Requirements

## Hardware Requirements

* Processor: Intel i3 or higher
* RAM: 4 GB minimum
* Hard Disk: 100 GB

---

## Software Requirements

* Operating System: Windows/Linux
* Database: MySQL
* Web Server: Apache/XAMPP
* Browser: Chrome/Firefox

---

# 6. Database Design

## Main Tables

| Table Name   | Description                |
| ------------ | -------------------------- |
| Users        | Stores login information   |
| Patients     | Stores patient details     |
| Doctors      | Stores doctor details      |
| Appointments | Stores appointment records |

---

# 7. Use Case Diagram (Textual)

### Actors

* Admin
* Doctor
* Receptionist
* Patient

### Use Cases

* Login
* Manage Patients
* Manage Doctors
* Manage Appointments
* View Reports

---

# 8. ER Diagram

```text
+----------------+
|     USERS      |
+----------------+
| user_id (PK)   |
| username       |
| password       |
| role           |
+----------------+

        |
        |
        v

+----------------+        +----------------+
|    PATIENTS    |        |    DOCTORS     |
+----------------+        +----------------+
| patient_id PK  |        | doctor_id PK   |
| name           |        | name           |
| age            |        | specialization |
| gender         |        | department     |
| address        |        | phone          |
| phone          |        +----------------+
+----------------+                 |
        |                           |
        |                           |
        +-----------+---------------+
                    |
                    v

           +-------------------+
           |   APPOINTMENTS    |
           +-------------------+
           | appointment_id PK |
           | patient_id FK     |
           | doctor_id FK      |
           | app_date          |
           | app_time          |
           | status            |
           +-------------------+
```

---

# 9. Data Flow Description

## Login Flow

User → Login Page → Authentication → Dashboard

## Appointment Flow

Patient → Appointment Request → Doctor Assignment → Appointment Confirmation

---

# 10. Future Enhancements

* Online payment system
* SMS/Email notifications
* Prescription management
* Laboratory management
* Billing module

---

# 11. Conclusion

The Hospital Management System will provide an efficient and secure way to manage hospital activities digitally. The system will improve operational efficiency, reduce manual work, and ensure proper management of patients, doctors, and appointments.

---

# Simple Visual ER Relationship Overview


Hospital Management System Modules

Core modules and their interaction importance in the HMS project.

module	importance
Login Module	9
Patient Management	10
Doctor Management	8
Appointment Management	10
