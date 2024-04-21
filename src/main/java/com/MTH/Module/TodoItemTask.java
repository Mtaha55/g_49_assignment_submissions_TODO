package com.MTH.Module;


import java.util.Objects;

public class TodoItemTask {
    private int id;
    private String description;
    private boolean completed;
    private TodoItem todoItem;
    private boolean assigned;
    private int personId;

    public TodoItemTask(int id) {
        this.id = id;
    }

    public TodoItemTask() {

    }

    // Constructor, Getters, and Setters...

    // toString() method
    @Override
    public String toString() {
        return "TodoItemTask{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", completed=" + completed +
                '}';
    }

    // hashCode() method
    @Override
    public int hashCode() {
        return Objects.hash(id, description, completed);
    }

    // equals() method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TodoItemTask that = (TodoItemTask) o;
        return id == that.id &&
                completed == that.completed &&
                Objects.equals(description, that.description);
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setTodoItem(TodoItem todoItem) {
        this.todoItem = todoItem;
    }

    public TodoItem getTodoItem() {
        return todoItem;
    }

    public void setId(int i) {
    }

    public int getId() {
        return id;
    }

    public void setAssigned(boolean assigned) {
        this.assigned = assigned;
    }

    public boolean isAssigned() {
        return assigned;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public int getPersonId() {
        return personId;
    }
}
