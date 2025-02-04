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
        
        // Use try-with-resources to automatically close the scanner
        try (Scanner scanner = new Scanner(System.in)) { // scanner to get user input

            // welcome message
            System.out.println("Welcome to the Todo List App!");
            System.out.println("Type 'help' for a list of commands.");
            
            boolean running = true; // flag to keep the app running

            // main loop to handle user input
            while (running) {
                System.out.print("> ");
                String input = scanner.nextLine().toLowerCase(); // format input

                // exit condition
                switch (input) {
                    case "quit" -> running = false;
                    case "help" -> System.out.println("Available commands: \nquit: quit the application \nhelp: list the avaliable commands \nadd: Create a new task \ndel: Remove a task \nmark: Check off a task \nlist: List all tasks and their contents");
                    case "add" -> {
                        System.out.println("Enter the task description: ");
                        String task = scanner.nextLine().trim();
                        todoList.addTask(new Task(task));
                    }
                    case "del" -> {
                        System.out.println("Enter the task description to delete: ");
                        String taskDes = scanner.nextLine();
                        todoList.removeTask(todoList.findTask(taskDes));
                    }
                    case "mark" -> {
                        System.out.println("Enter the task description to mark as complete: ");
                        String taskDes = scanner.nextLine();
                        todoList.completeTask(todoList.findTask(taskDes));
                    }
                    case "list" -> todoList.printTasks();
                    default -> System.out.println("Invalid command. Type 'help' for available commands.");
                }
            }
        } // scanner is automatically closed here
    }
    // Testing testing testing
}