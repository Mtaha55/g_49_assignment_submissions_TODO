package com.MTH.Module;

import java.util.Date;
import java.util.Objects;

public class TodoItem {
    private int id;
    private String title;
    private String description;
    private Person creator;
    private boolean done;
    private int personId;
    private Date deadline;

    // Constructor, Getters, and Setters...

    // toString() method
    @Override
    public String toString() {
        return "TodoItem{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    // hashCode() method
    @Override
    public int hashCode() {
        return Objects.hash(id, title, description);
    }

    // equals() method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TodoItem todoItem = (TodoItem) o;
        return id == todoItem.id &&
                Objects.equals(title, todoItem.title) &&
                Objects.equals(description, todoItem.description);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setCreator(Person creator) {
        this.creator = creator;
    }

    public Person getCreator() {
        return creator;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public boolean isDone() {
        return done;
    }

    public void setPersonId(int personId) {
        this.personId = personId;

    }

    public int getPersonId() {
        return personId;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;

    }

    public Date getDeadline() {
        return deadline;
    }
}
