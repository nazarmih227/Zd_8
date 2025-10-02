package f3;

public class Task {

    TaskPriority task; // добавьте переменную priority с приоритетом задачи
    private String description;

    public Task(TaskPriority task, String description){
        this.task = task;
        this.description = description;
    }
    // добавьте конструктор класса

    public TaskPriority get(){
        return task;
    }
    // добавьте метод get для приоритета

    public String getDescription() {
        return description;
    }
}