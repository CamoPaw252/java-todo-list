
/**
 * Class that represents a task 
 * 
 * This class encapsulates the text and completion status of a single task.
 * It provides methods to set and get the task text and completion status.
 * 
 * @author Caleb Brost
 * @version 1.0
 * @since 2024-10-21
 */
public class Task {
    private String text;
    private boolean complete;

    /**
     * Defult constructor that creates an empty task
     */
    public Task() { 
        this("empty task");
    }

    /**
     * Constructor that creates a task with the given text
     *
     * @param text The description of the task
     */
    public Task(String text) { 
        this(text, false);
    }

    /**
     * Constructor that creates a task with the given text and completion status
     * 
     * @param text The description of the task
     * @param complete The status of the task
     */
    public Task(String text, boolean complete) {
        this.text = text;
        this.complete = complete;
    }

    /**
     * Setter method to set the task description text
     * 
     * @param text the new task description text
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Getter method fo the task description text
     * 
     * @return The task description text in a String
     */
    public String getText() {
        return this.text;
    }

    /**
     * Setter method to mark the task as complete
     *
     * @param status The new completion status
     */
    public void setComplete(boolean status) {
        this.complete = status;
    }

    /**
     * Getter method for the task completion status
     * 
     * @return The completion status in a boolean
     */
    public boolean isComplete() {
        return this.complete;
    }

    /**
     * Returns a string representation of the task for display purposes
     * 
     * @return A string representation of the task
     */
    public String toString() {
        return "Task: " + this.text + " - Complete: " + this.complete;
    }
}