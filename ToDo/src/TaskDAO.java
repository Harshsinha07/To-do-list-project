package src;

import java.util.List;

public interface TaskDAO {

    void addTask(Task task);

    Task getTaskById(int id);

    List<Task> getAllTasks();

    void updateTask(Task task);

    void deleteTask(int id);
}
