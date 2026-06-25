# Login & Registration System

## Project Overview

A full-stack Login and Registration System built using:

* Frontend: HTML, CSS, JavaScript
* Backend: Spring Boot
* Database: MySQL
* ORM: Spring Data JPA / Hibernate

The application allows users to:

* Create a new account
* Store user information in MySQL
* Login using registered credentials
* Validate username and password
* Prevent duplicate usernames

---

## Features

### Registration

* Create a new account
* Save user details into MySQL database
* Check whether username already exists

### Login

* Validate username and password
* Display login success message
* Redirect user to Home page after successful login

### Database

* User data stored in MySQL
* Automatic table creation using Hibernate

---

## Technologies Used

| Technology      | Purpose               |
| --------------- | --------------------- |
| HTML            | Frontend Structure    |
| CSS             | Styling               |
| JavaScript      | API Calls             |
| Java            | Backend Logic         |
| Spring Boot     | REST API Development  |
| Spring Data JPA | Database Operations   |
| Hibernate       | ORM Framework         |
| MySQL           | Database              |
| Maven           | Dependency Management |

---

## Project Structure

Login/

├── frontend/

│   ├── index.html

│   ├── register.html

│   ├── home.html

│   └── style.css

│

└── backend/

```
└── demo/

    ├── controller/

    │   └── UserController.java

    ├── entity/

    │   └── User.java

    ├── repository/

    │   └── UserRepository.java

    └── application.properties
```

---

## Database Setup

Create database:

```sql
CREATE DATABASE login_db;
```

Use database:

```sql
USE login_db;
```

---

## Configuration

Update application.properties

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/login_db
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

Replace YOUR_PASSWORD with your MySQL password.

---

## Running the Application

### Start Backend

Navigate to:

```bash
cd backend/demo
```

Run:

```bash
./mvnw spring-boot:run
```

or Windows:

```bash
.\mvnw.cmd spring-boot:run
```

---

### Run Frontend

Open:

* register.html
* index.html

using Live Server in VS Code.

---

## API Endpoints

### Register User

POST

```http
http://localhost:8080/register
```

Request Body

```json
{
  "username": "john",
  "password": "123"
}
```

Response

```text
Account Created
```

---

### Login User

POST

```http
http://localhost:8080/login
```

Request Body

```json
{
  "username": "john",
  "password": "123"
}
```

Responses

```text
Login Successful
```

```text
Invalid Password
```

```text
User Not Found
```

---

## Future Improvements

* Password Encryption using BCrypt
* JWT Authentication
* Session Management
* Forgot Password
* Email Verification
* Role-Based Access Control
* User Profile Management

---

## Author

Purushotham Reddy

Java Backend Developer | Spring Boot | MySQL | Full Stack Development
