
import java.util.ArrayList;
import java.util.List;

public class TodoList {
    private List<Task> tasks;

    public TodoList() {
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void printTasks() {
        System.out.println("Tasks:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i).getDescription());
        }
    }
}
