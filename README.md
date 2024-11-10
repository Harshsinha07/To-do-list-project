# To-Do List Application

A simple **To-Do List Application** built with **Java** and **MySQL** that allows users to add, view, update, and delete tasks.

## Features

- Add new tasks
- View all tasks
- Mark tasks as completed
- Delete tasks

## Technologies Used

- **Java**: Main programming language
- **MySQL**: Database to store tasks
- **JDBC**: Java Database Connectivity to interact with MySQL

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
├── src/                  # Source files
│   ├── TodoApp.java      # Main class with user interface
│   ├── Task.java         # Task class with properties and methods
│   ├── TaskDAO.java      # Interface for task operations
│   ├── TaskDAOImpl.java  # Implementation of TaskDAO interface
│
├── lib/                  # MySQL JDBC driver (mysql-connector-java.jar)
├── .vscode/              # VS Code settings
│   └── settings.json     # VS Code project settings
├── README.md             # Project documentation
└── mysql-connector-java-8.x.x.jar  # MySQL JDBC driver
```

