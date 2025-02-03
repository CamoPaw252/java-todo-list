import java.util.*;

/**
 * Class that stores an array of tasks with methods to add, remove, complete, and print all tasks
 * 
 * @author Caleb Brost
 * @version 1.0
 * @since 2024-10-21
 */
class TodoList {
    private ArrayList<Task> tasks;

    /**
     * Constructor that creates an empty TodoList
     */
    public TodoList() {
        this.tasks = new ArrayList<Task>();
    }

    /**
     * Constructor that creates a TodoList with an array of tasks
     * 
     * @param tasks The array of tasks to add to the TodoList
     */
    public TodoList(Task... tasks) {
        this.tasks = new ArrayList<Task>();
        for (Task task : tasks) {
            this.tasks.add(task);
        }
    }

    /**
     * Method that adds a task to the TodoList
     * 
     * @param task The task to add to the TodoList
     */
    public void addTask(Task task) {
        this.tasks.add(task);
    }

    /**
     * Method that removes a task from the TodoList
     * 
     * @param task The task to remove from the TodoList
     */
    public void removeTask(Task task) {
        this.tasks.remove(task);
    }    

    /**
     * Method that prints all tasks in the TodoList
     */
    public void printTasks() {
        for (Task task : this.tasks) {
            System.out.println(task);
        }
    }

    /**
     * Method that marks a task as complete
     * 
     * @param task The task to mark as complete
     */
    public void completeTask(Task task) {
        task.setComplete(true);
    }
}