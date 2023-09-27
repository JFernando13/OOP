package robot;

public class Task {
    private String description;
    private Integer priority;

    public Task(String description, Integer priority) {
        this.description = description;
        this.setPriority(priority);
    }

    public String getDescription() {
        return description;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPriority(Integer priority) {
        if (priority >= 1 && priority <= 10) this.priority = priority;
        else throw new Error("La prioridad tiene que estar en un rango de 1 a 10");
    }
}
