public class Task implements ITask {
    
    private String title;
    private String description;
    private String dueDate;
    private int status;
    private int priority;

    public Task(String title, String description, String dueDate, int status, int priority) {
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.status = status;
        this.priority = priority;
    }

    public void updatedStatus(int status) {
        this.status = status;
    }

    public void setPriority(int priority) {
        this.setPriority(priority);
    }


}
