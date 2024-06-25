import java.util.Arrays;

/**
 * @author Randip Singh
 * @version 1.0
 * @comment Devran Sakar
 */
public class Taskmanager {
    private Task[] tasks;

    /**
     * 
     * @param maxTasks Task Anzahl
     */

    public Taskmanager(int maxTasks) {
        tasks = new Task[maxTasks];
    }

    public Task[] getTasks() {
        return tasks;
    }

    public void setTasks(Task[] tasks) {
        this.tasks = tasks;
    }
    public void add(Task task) {
        for (int i = 0; i < tasks.length; i++) {
            if (tasks[i] == null) {
                tasks[i] = task;
            }
        }
    }
    public void done(Task task) {
        task.complete();
        for (int i = 0; i < tasks.length; i++) {
            if (tasks[i].equals(task)) {
                tasks[i] = null;
            }
        }
    }



    @Override
    public String toString() {
        return "Taskmanager{" +
                "tasks=" + Arrays.toString(tasks) +
                '}';
    }
}
