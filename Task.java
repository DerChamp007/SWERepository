public class Task{
    private int id;
    private String description;
    private boolean completed;

    /**
     *
     * @param id Taskkennung
     * @param description Taskbeschreibung
     * @param completed Vollendung
     */

    public Task(int id, String description, boolean completed) {
        this.id = id;
        this.description = description;
        this.completed = completed;
    }

    public int getId() {
        return id;
    }

    private void setId(int id){
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void complete() {
        this.completed = true;
    }


}