import java.util.Scanner;

/**
 * Class that runs the TodoList application and handles user input
 * 
 * @author Caleb Brost
 * @version 1.0
 * @since 2024-10-21
 */
public class TodoListApp {
    public static void main(String[] args) {
        TodoList todoList = new TodoList();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Todo List App!");
        System.out.println("Type 'help' for a list of commands.");
        
        boolean running = true;
        while (running) {
            System.out.print("> ");
            String input = scanner.nextLine().toLowerCase();

            if (input.equals("quit")) {
                running = false;
            }
            else if (input.equals("help")) {
                System.out.println("Available commands: \nquit: quit the application \nhelp: list the avaliable commands \nadd: Create a new task \ndel: Remove a task \nmark: Check off a task \nlist: List all tasks and their contents");
            }
            else if (input.equals("add")) {
                System.out.println("Enter the task description: ");
                String task = scanner.nextLine();
                todoList.addTask(new Task(task));
            }
            else if (input.equals("del")) {
                System.out.println("Enter the task description: ");
                String task = scanner.nextLine();
                todoList.removeTask(new Task(task));
            }
            else if (input.equals("mark")) {
                System.out.println("Enter the task description: ");
                String task = scanner.nextLine();
                todoList.completeTask(new Task(task));
            }
            else if (input.equals("list")) {
                todoList.printTasks();
            }
        }
    }
}