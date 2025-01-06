<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Task List</title>
</head>
<body>
    <h1>Your Tasks</h1>
    
    <c:if test="${not empty tasks}">
        <ul>
            <c:forEach var="task" items="${tasks}">
                <li>${task.name} - ${task.description}</li>
            </c:forEach>
        </ul>
    </c:if>

    <c:if test="${empty tasks}">
        <p>No tasks found. <a href="/add-task">Add a task</a></p>
    </c:if>

    <p><a href="/home">Back to Home</a></p>
</body>
</html>
