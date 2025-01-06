# To-Do App

A simple and efficient **To-Do App** built with **Spring Boot** for the backend and **HTML**, **CSS**, and **JavaScript** for the frontend. This app allows users to register, log in, and manage their tasks with CRUD (Create, Read, Update, Delete) operations.

## Features
- **User Authentication**: Secure login and registration for users.
- **CRUD Operations**: Add, edit, delete, and view tasks.
- **Task Management**: Mark tasks as completed, edit task details, and remove them.
- **Responsive Design**: User interface designed with **Bootstrap** for a mobile-friendly experience.

## Project Structure
``` bash
ToDo-App/
│
├── backend/                          # Backend folder (Spring Boot)
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/todo/        # Java backend code
│   │   │   │   ├── TodoApp.java      # Main application entry point
│   │   │   │   ├── model/
│   │   │   │   │   ├── Task.java     # Task entity
│   │   │   │   ├── repository/
│   │   │   │   │   ├── TaskRepository.java  # Spring Data JPA repository
│   │   │   │   ├── service/
│   │   │   │   │   ├── TaskService.java  # Service layer for business logic
│   │   │   │   ├── controller/
│   │   │   │   │   ├── TaskController.java  # REST controller for endpoints
│   │   │   ├── resources/
│   │   │   │   ├── application.properties  # Configuration (DB, server, etc.)
│   │   │   │   ├── schema.sql             # Optional: DB schema (if needed)
│   │   │   │   ├── static/                # Static resources (CSS, JS, Images, HTML files)
│   │   │   │   │   ├── css/
│   │   │   │   │   │   ├── styles.css    # Custom CSS
│   │   │   │   │   ├── js/
│   │   │   │   │   │   ├── app.js        # JavaScript functionality
│   │   │   │   │   ├── images/
│   │   │   │   │   │   ├── logo.png      # Logo Image
│   │   │   │   │   ├── index.html        # Login Page HTML
│   │   │   │   │   ├── register.html     # Registration Page HTML
│   │   │   │   ├── templates/             # Templates folder for JSP files
│   │   │   │   │   ├── index.jsp         # Login Page JSP
│   │   │   │   │   ├── register.jsp      # Registration Page JSP
│   │   │   │   │   ├── home.jsp          # Home Page after Login
│   │   │   │   │   ├── taskList.jsp      # Page to list tasks
│   │   │   │   │   ├── addTask.jsp       # Add New Task Page JSP
│   │   └── test/
│   │       └── java/com/todo/              # Test cases
│   │
│   └── pom.xml                            # Maven dependencies for Spring Boot
│
├── frontend/                          # Frontend folder
│   ├── index.html                     # Login Page
│   ├── register.html                  # Registration Page
│   ├── home.html                      # Home Page after Login
│   ├── taskList.html                  # Task List Page
│   ├── addTask.html                   # Add Task Page
│   ├── styles.css                     # Custom CSS
│   ├── app.js                         # JavaScript logic for app functionality
│   ├── bootstrap.min.css              # Bootstrap CSS (via CDN optional)
│   ├── bootstrap.bundle.js            # Bootstrap JS (via CDN optional)
│
├── lib/                               # Dependencies
│   └── mysql-connector-java-8.x.x.jar    # JDBC Driver (Optional if using Maven)
│
├── .vscode/                           # VS Code settings
│   └── settings.json                     # Configuration for VS Code
│
└── README.md                             # Project documentation
```


## Requirements

- **Java**
- **Maven** for backend dependencies
- **MySQL** or any other relational database
- **Node.js** and **npm** for frontend dependencies (if necessary)

## Setup Instructions

### Backend Setup (Spring Boot)

1. Clone the repository:
    ```bash
    git clone https://github.com/your-username/todo-app.git
    ```

2. Navigate to the backend folder:
    ```bash
    cd ToDo-App/backend
    ```

3. Install dependencies and build the project:
    ```bash
    mvn clean install
    ```

4. Set up your **database**:
    - Update the `application.properties` file with your database credentials.
    - Optionally, you can use the `schema.sql` file to initialize the database schema.

5. Run the backend application:
    ```bash
    mvn spring-boot:run
    ```

6. The backend will be running on **http://localhost:8080**.

### Frontend Setup

1. Navigate to the frontend folder:
    ```bash
    cd ToDo-App/frontend
    ```

2. Open `index.html`, `register.html`, `home.html`, `taskList.html`, and other frontend pages in your browser.

The frontend will interact with the backend via API calls (e.g., `POST /tasks`, `GET /tasks`, `PUT /tasks/{id}`, and `DELETE /tasks/{id}`).

3. You can also modify the **Bootstrap** settings to match your design preferences.

### Testing the Backend

Unit tests for the service layer are available in `TaskServiceTest.java`. To run the tests:

```bash
```
mvn test
Project Documentation
This project follows the Spring Boot architecture for the backend and HTML/CSS/JavaScript for the frontend. The backend handles user authentication, task management, and business logic, while the frontend provides a user interface for interaction.

License
This project is licensed under the MIT License - see the LICENSE file for details.

Acknowledgements
Spring Boot for backend development.
Bootstrap for styling and responsiveness.
MySQL for the database.
JUnit for unit testing.
