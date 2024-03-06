public class Project {

    private String name;
    private String description;
    private String startDate;
    private String endDate;

    private ITask[] tasks;
    private TeamMember[] members;

    private int numMembers = 0;
    private int numTasks = 0;

    public Project(String name, String description, String startDate, String endDate) {
        this.name = name;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;

        this.tasks = (ITask[]) new Object[11];
        this.members = (TeamMember[]) new Object[11];

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String startDate() {
        return this.startDate;
    }

    public void setStartDate(String str) {
        this.startDate = str;
    }

    public String getEndDate() {
        return this.endDate;
    }

    public void setEndDate(String str) {
        this.endDate = str;
    }

    public void addMember(TeamMember m) {
        this.members[numMembers] = m;
        numMembers++;
    }

    public TeamMember removMember(TeamMember m) {
        return this.members[--numMembers];
        
    }

    public void addTask(ITask t) {
        this.tasks[numTasks] = t;
        numTasks++;
    }

    public ITask removeTask(ITask t) {
        return this.tasks[--numTasks];
    }

}