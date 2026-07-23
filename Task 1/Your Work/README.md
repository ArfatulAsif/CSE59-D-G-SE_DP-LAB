# Software Requirements Specification (SRS)

## Preface

This document provides the Software Requirements Specification (SRS) for the Pharmacy Management System. It defines the system’s functionalities, performance criteria, security requirements, and overall system architecture necessary for development.

---

## Version History

* **Version 1.0** – Initial Draft.
* **Version 1.1** – Added non-functional requirements and system models.
* **Version 1.2** – Refined system evolution and glossary.

---

# 1. Introduction

## Purpose

The Pharmacy Management System is a web-based application designed to improve pharmacy operations by automating medicine inventory management, sales processing, prescription handling, and reporting. The system helps pharmacists efficiently manage daily activities while ensuring accuracy, security, and customer satisfaction.

## Document Conventions

This document follows the IEEE SRS standard, using:

* **Must** – Indicates mandatory requirements.
* **Should** – Indicates recommended features.
* **May** – Indicates optional enhancements.

## Intended Audience and Reading Suggestions

* **Developers & System Architects** – For implementation guidance.
* **Pharmacy Owners & Stakeholders** – To understand system features.
* **Testers & QA Teams** – To verify system compliance and functionality.

## Scope

The system provides:

* Medicine inventory management
* Prescription and sales management
* Billing and payment processing
* Supplier and customer management
* Reporting and analytics
* Role-based access and security features

## References

* IEEE Standard 830-1998 (Software Requirements Specification)
* Pharmacy Business Requirement Specification (BRS)
* System Modeling Documentation

---

# 2. Overall Description

## Product Perspective

The Pharmacy Management System is a standalone web application that may integrate with payment gateways, barcode scanners, and external healthcare systems.

## Product Functions

* **Inventory Management:** Add, update, and track medicines.
* **Sales Management:** Process medicine sales and generate invoices.
* **Prescription Management:** Store and verify prescriptions.
* **Supplier Management:** Manage supplier records and medicine purchases.
* **Reporting & Analytics:** Generate sales and stock reports.
* **Notifications:** Alerts for low stock and medicine expiry dates.

## User Classes and Characteristics

* **Admin:** Manages users, permissions, and system settings.
* **Pharmacist:** Handles prescriptions, sales, and inventory updates.
* **Cashier:** Processes customer billing and payments.
* **Customer:** Purchases medicines and receives invoices.

## Operating Environment

* Web-based application (accessible via Chrome, Firefox, Edge).
* Cloud-hosted infrastructure.
* **Database:** MongoDB/MySQL.

## Design and Implementation Constraints

* Compliance with healthcare and data security regulations.
* Scalability for small and large pharmacy businesses.

## Assumptions and Dependencies

* Internet connection is required for cloud access.
* Barcode scanners and printers may be integrated in future versions.

---

# 3. System Requirements Specification

## Functional Requirements

### User Authentication

* The system must allow users to register and log in securely.
* The system must support password reset functionality.
* The system must implement role-based authentication (Admin, Pharmacist, Cashier).

### Inventory Management

* Pharmacists must be able to add, update, and delete medicine records.
* The system must track medicine quantities and stock levels.
* The system must generate alerts for low stock and expired medicines.

### Sales Management

* Cashiers must be able to process medicine sales.
* The system must generate invoices automatically.
* The system must calculate taxes and discounts during billing.

### Prescription Management

* Pharmacists must be able to upload and verify prescriptions.
* Prescription history should be stored securely.

### Supplier Management

* The system must allow users to manage supplier information.
* The system must record medicine purchase transactions.

### Reporting & Analytics

* Admins must be able to generate sales and inventory reports.
* Reports should be exportable in PDF and CSV formats.

### Notifications

* The system must send alerts for medicine expiry dates.
* The system must notify users about low stock availability.

---

## Non-Functional Requirements

### Performance Requirements

* The system must support 500+ concurrent users.
* Billing and inventory updates must occur in real time.

### Security Requirements

* The system must implement role-based access control.
* All sensitive customer and prescription data must be encrypted.

### Usability Requirements

* The system should provide an intuitive and user-friendly interface.
* The system must support accessibility standards.

### Reliability and Availability

* The system must ensure 99.9% uptime.
* Daily backup mechanisms must be available for data recovery.

### Maintainability and Support

* The system must support modular updates and maintenance.
* Proper logging and debugging tools must be available.

### Portability

* The system should support Windows, Linux, and Mac operating systems.
* The system must support cloud deployment.

---

# 4. System Models


> * **ENTITY-RELATIONSHIP DIAGRAM**
>
>   <img src="images/1964ccdf-1d8f-4bef-9246-9f52d7e4c302 (6).png" alt="ER Diagram">


---

# 5. System Evolution

## Assumptions

* AI-based medicine recommendations may be integrated in future versions.
* Future support for mobile applications.
* Scalability for multi-branch pharmacy businesses.

## Expected Changes

* Integration with online payment gateways.
* AI-powered inventory prediction and analytics.
* Integration with healthcare management systems.

---

# 6. Appendices

## Hardware Requirements

* Cloud-based infrastructure with scalable servers.
* Barcode scanner and receipt printer support.

## Database Requirements

* Must include logical data relationships.
* Must support secure prescription and customer data storage.

## Glossary

| Term | Meaning |
|------|----------------------------------|
| ERP  | Enterprise Resource Planning |
| RBAC | Role-Based Access Control |
| API  | Application Programming Interface |
| GDPR | General Data Protection Regulation |
