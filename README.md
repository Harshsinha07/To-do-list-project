# To-Do App with User Management

This project is a To-Do List application built using Spring Boot for the backend and HTML, CSS, JavaScript, and Bootstrap for the frontend. The app provides basic task management functionality such as adding, viewing, and removing tasks, and marking them as completed. It also includes user management features like login and registration pages.

## Features

- User Registration: Users can register by providing a username and password.
- User Login: Users can log in with their registered credentials.
- Task Management: Users can create, view, and mark tasks as completed.
- JSP-based frontend: Uses JSP for rendering dynamic views.
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
ToDo-App/
│
├── backend/                          # Backend folder (Spring Boot)
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/todo/        # Java backend code
│   │   │   │   ├── TodoApp.java      # Main application entry point
│   │   │   │   ├── Task.java         # Task entity
│   │   │   │   ├── TaskRepository.java  # Spring Data JPA repository
│   │   │   │   ├── TaskService.java  # Service layer for business logic
│   │   │   │   └── TaskController.java  # REST controller for endpoints
│   │   │   └── resources/
│   │   │       ├── application.properties  # Configuration (DB, server, etc.)
│   │   │       ├── schema.sql             # Optional: DB schema (if needed)
│   │   │       ├── static/                # Static resources (CSS, JS, Images, HTML files)
│   │   │       │   ├── index.html        # Login Page HTML
│   │   │       │   ├── register.html     # Registration Page HTML
│   │   │       └── templates/             # Templates folder for JSP files
│   │   │           ├── index.jsp         # Login Page JSP
│   │   │           ├── register.jsp      # Registration Page JSP
│   │   │           ├── home.jsp          # Home Page after Login
│   │   │           ├── taskList.jsp      # Page to list tasks
│   │   │           └── addTask.jsp       # Add New Task Page JSP
│   │   └── test/
│   │       └── java/com/todo/              # Test cases
│   │
│   └── pom.xml                            # Maven dependencies for Spring Boot
│
├── lib/
│   └── mysql-connector-java-8.x.x.jar    # JDBC Driver (Optional if using Maven)
│
└── .vscode/
    └── settings.json                     # VS Code settings
                          # Project documentation

```

Endpoints
Task Management
GET /tasks: List all tasks.
POST /tasks: Create a new task.
PUT /tasks/{id}: Update an existing task.
DELETE /tasks/{id}: Delete a task.

User Authentication
POST /login: Authenticate user.
POST /register: Register a new user.



Testing
The project includes test cases located under src/test/java/com/todo/. You can run the tests using the following command:

```bash
mvn test
```
Notes
JSP Files: The frontend is built using JSP, and the views are rendered dynamically from the backend.
MySQL Setup: If you're using a different database, update the application.properties file accordingly.
