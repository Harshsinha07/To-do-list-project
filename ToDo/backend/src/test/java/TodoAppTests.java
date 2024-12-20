package com.todo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class TodoAppTests {

    @Test
    public void contextLoads() {
        // Test to check if the application context loads successfully
        assertTrue(true, "Application context loaded successfully.");
    }

    @Test
    public void testTaskCreation() {
        // Test the creation of a Task object
        Task task = new Task();
        task.setTitle("Test Task");
        task.setCompleted(false);

        assertEquals("Test Task", task.getTitle(), "Task title should be 'Test Task'.");
        assertFalse(task.isCompleted(), "Task should not be marked as completed.");
    }

    @Test
    public void testTaskCompletion() {
        // Test marking a Task as completed
        Task task = new Task();
        task.setTitle("Test Task");
        task.setCompleted(false);

        task.setCompleted(true); // Mark as completed
        assertTrue(task.isCompleted(), "Task should be marked as completed.");
    }
}
