
public class Main {
    public static void main(String[] args) {
        TodoList todoList = new TodoList();
        todoList.addTask(new Task("Complete assignment"));
        todoList.addTask(new Task("Buy groceries"));
        todoList.printTasks();
    }
}
