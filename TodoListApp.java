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
        TodoList todoList = new TodoList(); // new list to store tasks
        Scanner scanner = new Scanner(System.in); // scanner to get user input

        // welcome message
        System.out.println("Welcome to the Todo List App!");
        System.out.println("Type 'help' for a list of commands.");
        
        boolean running = true; // flag to keep the app running

        // main loop to handle user input
        while (running) {
            System.out.print("> ");
            String input = scanner.nextLine().toLowerCase(); // format input

            // exit condition
            if (input.equals("quit")) {
                running = false;
            }
            // help command
            else if (input.equals("help")) {
                System.out.println("Available commands: \nquit: quit the application \nhelp: list the avaliable commands \nadd: Create a new task \ndel: Remove a task \nmark: Check off a task \nlist: List all tasks and their contents");
            }
            // add a new task command
            else if (input.equals("add")) {
                System.out.println("Enter the task description: ");
                String task = scanner.nextLine().trim();
                todoList.addTask(new Task(task));
            }
            // remove a task command
            else if (input.equals("del")) {
                System.out.println("Enter the task description: ");
                String task = scanner.nextLine().trim();
                todoList.removeTask(todoList.findTask(task)); // search for task and remove it
            }
            // mark a task as complete command
            else if (input.equals("mark")) {
                System.out.println("Enter the task description: ");
                String taskDescription = scanner.nextLine().trim();
                Task task = todoList.findTask(taskDescription); // search for task
                if (task != null) {
                    todoList.completeTask(task); // if task is found, mark it as complete
                }
            }
            // list all tasks command
            else if (input.equals("list")) {
                todoList.printTasks();
            }
            // invalid command
            else {
                System.out.println("Invalid command. Type 'help' for a list of commands.");
            }
        }
    }
}