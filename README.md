# To-Do App with User Management

This project is a To-Do List application built using Spring Boot for the backend and HTML, CSS, JavaScript, and Bootstrap for the frontend. The app provides basic task management functionality such as adding, viewing, and removing tasks, and marking them as completed. It also includes user management features like login and registration pages.

## Features

- User Management: Login and Registration pages with form validation.
- Task Management: Add, View, Remove, and Mark tasks as completed.
- Responsive Design: The frontend is responsive, styled using Bootstrap for mobile compatibility.
- Database Integration: MySQL database used for storing tasks and user data.
- Validation: JavaScript validation on forms for user inputs (e.g., email format, password strength).

## Technologies Used

- **Backend**: Spring Boot
- **Frontend**: HTML, CSS, JavaScript, Bootstrap
- **Database**: MySQL
- **Build Tool**: Maven

## Prerequisites

Before you begin, ensure you have the following installed on your machine:

- **Java**: Java Development Kit (JDK) 8 or higher.
- **MySQL**: MySQL server running locally or remotely.
- **MySQL Connector/J**: MySQL JDBC driver to connect Java with MySQL.

## Setup Instructions

### 1. Clone the Repository

```bash
Create a database in MySQL called todolist_db:
CREATE DATABASE todolist_db;
CREATE TABLE tasks (
    id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    is_completed BOOLEAN NOT NULL DEFAULT false
);

```
##  Download MySQL Connector/J
Download the MySQL JDBC Driver (Connector/J) from here: MySQL Connector/J.

Extract the .jar file and place it in the lib/ folder in the root of the project.


## Configure Database Connection
In the TaskDAOImpl.java file, update the database connection settings with your own MySQL credentials:

```bash
private static final String URL = "jdbc:mysql://localhost:3306/todolist_db";  // Your DB URL
private static final String USER = "root"; // Your DB username
private static final String PASSWORD = "password"; // Your DB password

```
## Compile the Java Files
To compile the Java files, open a terminal in the project directory and run:
```bash
javac -cp ".;lib/mysql-connector-java-8.x.x.jar" src/*.java
```


## Run the Application
After compiling, run the application with the following command:
```bash
java -cp ".;lib/mysql-connector-java-8.x.x.jar;src" src.TodoApp
```

## Project Structure
```bash
ToDoApp/
│
├── src/                                # Java Backend
│   ├── main/
│   │   ├── java/com/todo/
│   │   │   ├── TodoApp.java            # Main Spring Boot application
│   │   │   ├── Task.java               # Task class with properties
│   │   │   ├── TaskDAO.java            # Interface for task operations
│   │   │   ├── TaskDAOImpl.java        # Implementation of TaskDAO interface
│   │   │   └── TaskController.java     # REST Controller for Task management
│   │   └── resources/
│   │       ├── application.properties  # MySQL and server config
│   │       ├── static/
│   │       │   ├── css/
│   │       │   │   └── styles.css      # CSS for styling
│   │       │   ├── js/
│   │       │   │   └── app.js          # JavaScript for form validation
│   │       │   ├── index.html          # Login page
│   │       │   └── register.html       # Registration page
│   │       └── templates/              # Template folder for future views
├── lib/                                # MySQL JDBC Driver
│   └── mysql-connector-java-8.x.x.jar
│
├── .vscode/
│   └── settings.json                   # VS Code project settings
│
├── pom.xml                             # Maven dependencies and build configuration
├── README.md                           # Project documentation

```

