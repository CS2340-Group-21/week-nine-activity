public class SpecialTask extends Task {

    private int secrecy_level;
    
    public SpecialTask(String title, String description, String dueDate, int status, int priority, int secrecy_level) {
        super(title, description, dueDate, status, priority);
        this.secrecy_level = secrecy_level;
    }

    public int getSecrecy() {
        return this.secrecy_level;
    }

}
