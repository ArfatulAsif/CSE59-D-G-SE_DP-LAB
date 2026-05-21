# Software Requirements Specification (SRS)

# Smart Library Management System

---

# Preface

This document provides the Software Requirements Specification (SRS) for the **Smart Library Management System**. The document describes the system functionalities, database structure, and system requirements needed for development.

---

# Version History

| Version | Description |
|---|---|
| 1.0 | Initial Draft |
| 1.1 | Added ER Diagram |
| 1.2 | Updated Functional Requirements |

---

# 1. Introduction

## Purpose

The **Smart Library Management System** is a web-based application designed to automate library operations such as book management, member registration, issuing books, returning books, and tracking fines.

---

## Scope

The system provides:

- Book management
- User registration and login
- Book issue and return system
- Fine calculation
- Search and reporting system

---

## Intended Audience

- Developers
- Project Supervisors
- Testers
- Students

---

# 2. Overall Description

## Product Perspective

The system is a standalone web application connected to a centralized database.

---

## Product Functions

- Add, update, and delete books
- Register library members
- Issue and return books
- Calculate overdue fines
- Generate reports

---

## User Classes

### Admin

- Manage books and users
- View reports

### Librarian

- Issue and return books
- Manage members

### Member

- Search books
- Borrow books

---

## Operating Environment

- Web Browser
- Windows/Linux/Mac
- Cloud or Local Server

---

## Database

- MySQL / MongoDB

---

# 3. System Requirements Specification

# Functional Requirements

## User Authentication

- Users must be able to log in and log out.
- The system must support role-based access.

---

## Book Management

- Admin can add, update, and remove books.
- Books must contain title, author, category, and availability status.

---

## Borrowing System

- Librarians can issue books to members.
- Members can return books.
- The system must calculate overdue fines automatically.

---

## Search System

- Users can search books by title, author, or category.

---

# Non-Functional Requirements

## Performance

- The system should support 300+ users simultaneously.

---

## Security

- Passwords must be encrypted.
- Only authorized users can access admin features.

---

## Reliability

- The system should ensure data backup and recovery.

---

## Usability

- User interface should be simple and user-friendly.

---



## ER Diagram Structure
<image src="images\ChatGPT Image May 21, 2026, 04_44_23 PM.png">
