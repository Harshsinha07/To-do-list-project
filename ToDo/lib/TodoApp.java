package src;

import java.util.List;
import java.util.Scanner;

public class TodoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskDAO taskDAO = new TaskDAOImpl();

        boolean running = true;
        while (running) {
            System.out.println("\n===== TO-DO LIST APP =====");
            System.out.println("1. Add a task");
            System.out.println("2. View all tasks");
            System.out.println("3. Mark task as completed");
            System.out.println("4. Remove a task");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (option) {
                case 1: // Add task
                    System.out.print("Enter task title: ");
                    String title = scanner.nextLine();
                    Task newTask = new Task(0, title, false); // id will be auto-generated
                    taskDAO.addTask(newTask);
                    System.out.println("Task added!");
                    break;

                case 2: // View tasks
                    List<Task> tasks = taskDAO.getAllTasks();
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks found.");
                    } else {
                        // Use lambda instead of method reference to avoid ambiguity
                        tasks.forEach(task -> System.out.println(task));
                    }
                    break;

                case 3: // Mark task as completed
                    System.out.print("Enter task ID to mark as completed: ");
                    int completeId = scanner.nextInt();
                    Task taskToComplete = taskDAO.getTaskById(completeId);
                    if (taskToComplete != null) {
                        taskToComplete.setCompleted(true);
                        taskDAO.updateTask(taskToComplete);
                        System.out.println("Task marked as completed!");
                    } else {
                        System.out.println("Task not found.");
                    }
                    break;

                case 4: // Remove task
                    System.out.print("Enter task ID to remove: ");
                    int removeId = scanner.nextInt();
                    taskDAO.deleteTask(removeId);
                    System.out.println("Task removed!");
                    break;

                case 5: // Exit
                    running = false;
                    System.out.println("Exiting the app...");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        scanner.close();
    }
}
