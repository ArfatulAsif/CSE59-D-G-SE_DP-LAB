

# Software Requirements Specification (SRS)

## Metropolitan University Smart Canteen Management System

---

# Preface

This document provides the Software Requirements Specification (SRS) for the **Metropolitan University Smart Canteen Management System**. It defines system functionalities, performance requirements, security requirements, and system architecture. This document is prepared to ensure clear understanding among developers, stakeholders, and future maintainers of the system.

---

# Version History

* **Version 1.0** – Initial Draft

---

# 1. Introduction

## Purpose

The purpose of this system is to digitalize the university canteen service. It allows students and staff to order food online, make cashless payments, and reduce waiting time. The system improves efficiency, transparency, and service quality in the canteen.

---

## Document Conventions

* **Must** → Mandatory requirement
* **Should** → Recommended feature
* **May** → Optional feature

---

## Intended Audience

* Developers
* Project Managers
* Stakeholders (University Administration)
* QA/Test Engineers

---

## Scope

The system provides:

* Online food ordering
* Digital menu management
* Order tracking system
* Cashless payment system
* Admin control panel
* Feedback and rating system

---

## References

* IEEE SRS Standard 830
* University project guidelines
* Web application development best practices

---

# 2. Overall Description

## Product Perspective

The system is a web-based application integrated with a database and payment system. It replaces manual canteen operations with a smart automated system.

---

## Product Functions

* User registration and login
* Food menu display
* Order placement system
* Real-time order tracking
* Payment processing
* Admin dashboard
* Feedback system

---

## User Classes and Characteristics

### Student/User

* Browse menu
* Place orders
* Make payments
* Give feedback

### Canteen Staff

* View orders
* Prepare food
* Update order status

### Admin

* Manage menu
* Manage users
* Monitor system
* Generate reports

---

## Operating Environment

* Web-based system
* Works on Chrome, Firefox, Edge
* Mobile responsive design
* Cloud or local server
* Database: MySQL / MongoDB

---

## Design Constraints

* Must support real-time updates
* Secure payment handling required
* Must handle peak-time traffic

---

## Assumptions & Dependencies

* Internet connection required
* Payment gateway availability
* University authentication system may be integrated later

---

# 3. System Requirements Specification

## 3.1 Functional Requirements

### User Authentication

* System must allow registration and login
* System must support role-based access (Student, Staff, Admin)

---

### Menu Management

* Admin must add/update/delete food items
* Users must view daily menu

---

### Order Management

* Users must place orders online
* System must update order status:

  * Pending
  * Preparing
  * Ready
  * Completed

---

### Payment System

* System must support digital payment
* System must generate receipts

---

### Feedback System

* Users must rate food items
* Users can write reviews

---

### Notification System

* System must notify users about order updates
* System must send alerts for order completion

---

## 3.2 Non-Functional Requirements

### Performance

* System must support 300–1000 users simultaneously
* Order updates must be fast (real-time or near real-time)

---

### Security

* Password encryption required
* Role-based access control must be implemented
* Secure payment processing required

---

### Usability

* Simple and user-friendly UI
* Mobile responsive design

---

### Reliability

* System must maintain 99% uptime
* Backup and recovery system required

---

### Maintainability

* Modular system architecture required
* Easy updates and debugging

---

### Portability

* Accessible on all modern devices
* Cross-browser compatibility required

---

# 4. System Models

## Entity-Relationship (ER) Diagram

![Image](https://images.openai.com/static-rsc-4/3u85G0lVJ2DPM-G18ASyEmBHHWEx64GA7knkYWtUmOm83AirwH0PMKpQccSPaOflyHxlfL_RTBCzFmStPE-58e72p37dN4nnlRjnJj1zVJeK56T434EmtyigJJrBju8D9uCqozWzf0svJXbUWGOn05Z9bA-I5XA5ZY32UE9dOsoqrEcSk5fNmwpZll6aOrI8?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/JyFUeljp4LCSfKfA0YbpzdmjUpEgybzQGY4qzDKQKt67UAfsMy6EcjrvXmRxQO50CxWxflM04Tegc_BeK5Cegs3UHf1zft8qTLl-BZ8xhiIMOpDC9hntlUbQR3_MT_Mod8EIQaMZf4DMQlJoh2tYizxiY8MFQfS_2wEKZ1w_CHmZ465z-yeSBBvOCRz0S8kR?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/ZjM02GQttoe0-KbrERrAzG88ROdNkB-ZZK6sLdger7xuhanR-NX20eF1lQVIuBelrPmC-4IsH4VUDHuLYtw2jWkxf-BF1yxrzqGK_kqhne97fjLG4UbJQTYmBFbUuzhcgEZNOtqPS7zH0nuKjWTsVdIkwV-NT0dwrFO9eAmUNZI07lH3WWysOd_CXH4hN1s3?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/G_45wST2x5blOfwx77XV3ZLtXz2lqJheN_hze-JpvRchv9HIQiufZ16GPIA8E10VIZ8A0bD2H6yKdJJHLuY0mrqxzq0zPMwmEaK9lDA6uCdXR59Aex0tchLq_x7NGr1s7Qh8v1Ty4Hp1zbVeys-Xcy0qhEhprqtY1idOoH6OTV0ENfSwC94oOaj-Q4puITjW?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/Cx8F1X33fj7QMJxYJgx-PuHPlCYZbe-0w1g3_ZeaYBRo40UwgfZohJ2c8oHGnJcIkdkEGjNG0yilt4Foao7LguHEjDJlu232ATunpEmBIRpwEYjhfCFHvLNLlJD3Gf0vpSgdTEMFBcn48wAUHSXlHO7VK6wer5WQyTEpiXoKwwWkgY7uhoeGQ3RgLtyjDJy6?purpose=fullsize)

![Image](https://images.openai.com/static-rsc-4/jw_TnpeQGe_LBNZA2IYrqybMQn0iBxG7f6D914YLL_u3pTDIwrEmU4GryaXzMKuqY6KNSRYGJ7synETMUQglIGQE-K1idRldEyq6CGTEixQygSN9b82wT9-_iIM-xWEraPREEA8z9ojRHnmHhLHG_Grucy9F5MusPq7YKGYUT_PTmWZGRwWb-LTCaejDJbdt?purpose=fullsize)

---

# 5. System Evolution

## Assumptions

* AI-based recommendation system may be added
* Mobile app version may be developed
* Advanced analytics dashboard may be included

---

## Expected Enhancements

* QR code ordering system
* AI food recommendation system
* Inventory prediction system
* Multi-payment gateway integration

---

# 6. Appendices

## Hardware Requirements

* Cloud or local server
* Minimum 4GB RAM (small system)
* Scalable storage system

---

## Database Requirements

* MySQL / MongoDB
* Tables/Collections:

  * Users
  * Orders
  * Menu Items
  * Payments
  * Feedback

---

## Software / Tools Used

### Design Tools

* draw.io (ER diagrams, flowcharts)
* Lucidchart (system modeling)
* Canva (presentation diagrams)

---

### Frontend Development

* HTML, CSS, JavaScript
* React.js (optional modern UI)

---

### Backend Development

* Node.js + Express.js (recommended)
  OR
* PHP Laravel (alternative)

---

### Database

* MySQL (recommended)
  OR
* MongoDB (NoSQL option)

---

### Deployment Tools

* Firebase Hosting (frontend)
* Vercel / Netlify
* AWS / DigitalOcean (full system hosting)

---

### Payment Integration

* SSLCommerz (Bangladesh)
* Stripe (international)

---

