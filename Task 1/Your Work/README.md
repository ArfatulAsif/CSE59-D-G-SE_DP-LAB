# Software Requirements Specification (SRS)

# Big-Brain Institute Management System

---

## Preface

This document provides the Software Requirements Specification (SRS) for the **Big-Brain Institute Management System (BBIMS)**. The system is designed to support the academic and administrative operations of Big-Brain Institute, an English learning institute. It defines the functional and non-functional requirements, system models, security features, database requirements, and future scalability considerations necessary for successful development and deployment.

---

# Version History

| Version | Description                                           | Date     |
| ------- | ----------------------------------------------------- | -------- |
| 1.0     | Initial Draft                                         | May 2026 |
| 1.1     | Added Functional & Non-Functional Requirements        | May 2026 |
| 1.2     | Added ER Diagram, System Models & Future Enhancements | May 2026 |

---

# 1. Introduction

## 1.1 Purpose

The **Big-Brain Institute Management System (BBIMS)** is a web-based software solution developed to automate and improve the academic, administrative, and communication processes of Big-Brain Institute.

The system enables:

* Student registration and course enrollment
* Teacher course management
* Attendance tracking
* Assignment and exam management
* Fee collection and financial monitoring
* Communication between students, teachers, managers, and institute owners
* Performance monitoring and report generation

The goal of the system is to improve operational efficiency, reduce manual paperwork, enhance communication, and provide a centralized platform for managing institutional activities.

---

## 1.2 Document Conventions

This document follows the IEEE SRS documentation standard.

The following keywords are used:

* **Must** – Indicates mandatory system requirements.
* **Should** – Indicates recommended features.
* **May** – Indicates optional future enhancements.

---

## 1.3 Intended Audience and Reading Suggestions

| Audience             | Purpose                                   |
| -------------------- | ----------------------------------------- |
| Project Managers     | Understand project scope and planning     |
| Developers           | Implement system functionalities          |
| Stakeholders         | Review system objectives and capabilities |
| Testers & QA Teams   | Validate system compliance                |
| Database Designers   | Design database architecture              |
| Institute Management | Monitor business process support          |

---

## 1.4 Scope

The Big-Brain Institute Management System provides:

* Student management
* Teacher management
* Course and batch management
* Attendance monitoring
* Assignment and exam management
* Fee and payment management
* Notice and announcement system
* Dashboard and reporting system
* Role-based authentication and authorization
* Communication and feedback features

The system is designed for:

* Students
* Teachers
* Managers
* Institute Owners (Admin)

---

## 1.5 References

* IEEE Standard 830-1998 (Software Requirements Specification)
* Internal Business Requirement Specifications (BRS)
* MongoDB Documentation
* MERN Stack Documentation
* Software Engineering Principles and Practices

---

# 2. Overall Description

## 2.1 Product Perspective

The Big-Brain Institute Management System is a standalone web application developed to digitize the academic and administrative workflow of the institute.

The system may integrate with:

* Email services
* SMS notification systems
* Payment gateways
* Google Meet or Zoom for online classes

---

## 2.2 Product Functions

### Student Management

* Student registration and profile management
* Enrollment in courses and batches
* Access to attendance, assignments, and results

### Teacher Management

* Teacher profile and course assignment
* Attendance updates
* Assignment and exam management

### Course Management

* Course creation and modification
* Batch scheduling
* Student enrollment tracking

### Attendance System

* Daily attendance tracking
* Attendance reports and analytics

### Assignment & Examination System

* Upload assignments and study materials
* Conduct exams and publish results

### Financial Management

* Fee collection and payment tracking
* Invoice generation
* Financial reporting

### Communication System

* Notices and announcements
* Messaging between users
* Feedback management

### Reporting & Analytics

* Student performance reports
* Financial reports
* Attendance statistics
* Course progress analytics

---

## 2.3 User Classes and Characteristics

| User Role   | Description                                                  |
| ----------- | ------------------------------------------------------------ |
| Owner/Admin | Full system control, manages users, reports, and settings    |
| Manager     | Manages operations, schedules, student records, and reports  |
| Teacher     | Conducts classes, manages attendance, assignments, and exams |
| Student     | Accesses courses, assignments, attendance, and results       |

---

## 2.4 Operating Environment

The system will operate in the following environment:

| Component         | Technology            |
| ----------------- | --------------------- |
| Frontend          | React.js              |
| Backend           | Node.js & Express.js  |
| Database          | MongoDB               |
| Hosting           | Cloud-based Hosting   |
| Browsers          | Chrome, Firefox, Edge |
| Operating Systems | Windows, Linux, macOS |

---

## 2.5 Design and Implementation Constraints

* The system must comply with data privacy and security standards.
* The application must support role-based access control.
* Internet connectivity is required for real-time functionality.
* The system should support scalability for future expansion.

---

## 2.6 Assumptions and Dependencies

### Assumptions

* Users have stable internet access.
* Users possess basic computer literacy.
* Institute management provides updated student and teacher information.

### Dependencies

* Cloud hosting services
* MongoDB database server
* Third-party notification or payment services

---

# 3. System Requirements Specification

# 3.1 Functional Requirements

## 3.1.1 User Authentication

* The system must allow users to register and log in securely.
* The system must support password reset functionality.
* The system must implement role-based authentication.
* The system must allow admins to activate or deactivate accounts.

---

## 3.1.2 Student Management

* Managers must be able to register students.
* Students must be able to update personal information.
* The system must maintain student academic records.
* Students must be able to view attendance and results.

---

## 3.1.3 Teacher Management

* Admins must be able to add and manage teachers.
* Teachers must be assigned to courses and batches.
* Teachers must update attendance and assignment status.

---

## 3.1.4 Course Management

* Managers must be able to create and update courses.
* Courses must contain batch schedules and enrolled students.
* Students must be able to enroll in courses.

---

## 3.1.5 Attendance Management

* Teachers must be able to record attendance.
* Students must be able to view attendance records.
* Managers must generate attendance reports.

---

## 3.1.6 Assignment and Exam Management

* Teachers must upload assignments and exams.
* Students must submit assignments online.
* Teachers must publish exam results.
* The system must store academic history.

---

## 3.1.7 Payment & Fee Management

* Managers must record student payments.
* Students must view payment history.
* The system must generate invoices and receipts.
* Admins must access financial reports.

---

## 3.1.8 Notice & Communication System

* Admins and managers must publish notices.
* Students and teachers must receive notifications.
* Users should be able to send messages within the platform.

---

## 3.1.9 Reporting & Analytics

* The system must generate student performance reports.
* The system must generate attendance reports.
* The system must generate financial reports.
* Reports should be exportable in PDF and CSV formats.

---

# 3.2 Non-Functional Requirements

## 3.2.1 Performance Requirements

* The system must support at least 500 concurrent users.
* Dashboard data should load within 3 seconds.
* Attendance and result updates must reflect in real time.

---

## 3.2.2 Security Requirements

* Passwords must be encrypted.
* The system must implement role-based access control.
* Sensitive information must be securely stored.
* Session management and token authentication must be implemented.

---

## 3.2.3 Usability Requirements

* The user interface should be simple and intuitive.
* The system should support responsive design.
* Accessibility standards should be maintained.

---

## 3.2.4 Reliability and Availability

* The system must ensure 99.9% uptime.
* Backup and recovery systems must be implemented.
* The system must handle unexpected failures gracefully.

---

## 3.2.5 Maintainability and Support

* The system must support modular architecture.
* Error logging and debugging mechanisms must be included.
* Future updates should be deployable without major downtime.

---

## 3.2.6 Portability

* The system should support Windows, Linux, and macOS.
* The system must support cloud deployment.
* The application should be accessible through modern browsers.

---

# 4. System Models

# 4.1 Entity Relationship Diagram (ER Diagram)

erDiagram


---

# 4.2 Use Case Summary

| Actor   | Use Cases                                                      |
| ------- | -------------------------------------------------------------- |
| Admin   | Manage users, generate reports, manage settings                |
| Manager | Manage students, courses, schedules, and payments              |
| Teacher | Take attendance, upload assignments, publish results           |
| Student | View courses, submit assignments, check attendance and results |

---

# 4.3 Data Flow Overview

1. User logs into the system.
2. Role-based dashboard is loaded.
3. Users interact with courses, assignments, attendance, and reports.
4. Data is stored and processed in MongoDB.
5. Notifications and analytics are generated in real time.

---

# 5. System Evolution

## 5.1 Assumptions

* AI-based learning assistance may be integrated.
* Online live classes may be added in future versions.
* Mobile application support may be introduced.

---

## 5.2 Expected Changes

* Integration with payment gateways.
* AI-powered student performance analysis.
* Automated attendance using facial recognition.
* Integration with Zoom or Google Meet.
* Multi-branch institute management support.

---

# 6. Appendices

# 6.1 Hardware Requirements

| Hardware Component | Requirement                         |
| ------------------ | ----------------------------------- |
| Processor          | Intel i5 or higher                  |
| RAM                | Minimum 8 GB                        |
| Storage            | SSD recommended                     |
| Internet           | Stable broadband connection         |
| Server             | Cloud-based scalable infrastructure |

---

# 6.2 Software Requirements

| Software           | Requirement           |
| ------------------ | --------------------- |
| Operating System   | Windows/Linux/macOS   |
| Browser            | Chrome, Firefox, Edge |
| Backend Framework  | Node.js & Express.js  |
| Frontend Framework | React.js              |
| Database           | MongoDB               |
| Version Control    | Git & GitHub          |

---

# 6.3 Database Requirements

The database must:

* Store user authentication information securely.
* Maintain relationships between students, teachers, courses, and payments.
* Support scalable and efficient querying.
* Ensure data consistency and integrity.

---

# 6.4 Glossary

| Term       | Definition                                   |
| ---------- | -------------------------------------------- |
| Admin      | Owner or primary controller of the system    |
| Manager    | User responsible for institute operations    |
| Teacher    | User responsible for academic activities     |
| Student    | Learner enrolled in courses                  |
| Course     | Educational program offered by the institute |
| Attendance | Student participation tracking               |
| Assignment | Academic task provided by teachers           |
| Result     | Student performance outcome                  |

---

# Conclusion

The Big-Brain Institute Management System is designed to modernize and automate the administrative and academic operations of Big-Brain Institute. The system focuses on improving efficiency, communication, security, and user experience while supporting future scalability and advanced feature integration.
