<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add New Task</title>
</head>
<body>
    <h1>Add New Task</h1>
    <form action="/tasks" method="post">
        <label for="name">Task Name:</label>
        <input type="text" id="name" name="name" required>
        <br>
        <label for="description">Description:</label>
        <input type="text" id="description" name="description" required>
        <br>
        <button type="submit">Add Task</button>
    </form>
    <br>
    <p><a href="/tasks">Back to Task List</a></p>
</body>
</html>
