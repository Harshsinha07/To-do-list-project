package src;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TaskDAOImpl implements TaskDAO {
    // Database connection details
    private static final String URL = "jdbc:mysql://localhost:3306/todolist_db"; // Your DB URL
    private static final String USER = "root"; // Your DB username
    private static final String PASSWORD = "password"; // Your DB password

    // Establish connection to the database
    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    // Add a task to the database
    @Override
    public void addTask(Task task) {
        String query = "INSERT INTO tasks (title, is_completed) VALUES (?, ?)";
        try (Connection connection = getConnection();
                PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setString(1, task.getTitle());
            statement.setBoolean(2, task.isCompleted());
            statement.executeUpdate();
            System.out.println("Task added successfully!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Get a task by its ID
    @Override
    public Task getTaskById(int id) {
        String query = "SELECT * FROM tasks WHERE id = ?";
        try (Connection connection = getConnection();
                PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                String title = resultSet.getString("title");
                boolean isCompleted = resultSet.getBoolean("is_completed");
                return new Task(id, title, isCompleted);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    // Get all tasks from the database
    @Override
    public List<Task> getAllTasks() {
        List<Task> tasks = new ArrayList<>();
        String query = "SELECT * FROM tasks";
        try (Connection connection = getConnection();
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String title = resultSet.getString("title");
                boolean isCompleted = resultSet.getBoolean("is_completed");
                tasks.add(new Task(id, title, isCompleted));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tasks;
    }

    // Update a task in the database
    @Override
    public void updateTask(Task task) {
        String query = "UPDATE tasks SET title = ?, is_completed = ? WHERE id = ?";
        try (Connection connection = getConnection();
                PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setString(1, task.getTitle());
            statement.setBoolean(2, task.isCompleted());
            statement.setInt(3, task.getId());
            statement.executeUpdate();
            System.out.println("Task updated successfully!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Delete a task from the database
    @Override
    public void deleteTask(int id) {
        String query = "DELETE FROM tasks WHERE id = ?";
        try (Connection connection = getConnection();
                PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setInt(1, id);
            statement.executeUpdate();
            System.out.println("Task deleted successfully!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
