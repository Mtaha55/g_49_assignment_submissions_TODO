package com.MTH.DataDAO;

import com.MTH.Module.TodoItem;
import com.MTH.Sequencer.TodoItemSequencer;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import com.MTH.Module.TodoItem;

public class TodoItemDAOImpl implements TodoItemDAO {
    private final Collection<TodoItem> todoItems = new HashSet<>();
    private TodoItem todoItem;

    @Override
    public void persist(TodoItem todoItem) {
        this.todoItem = todoItem;
        todoItem.setId(TodoItemSequencer.nextId());
        todoItems.add(todoItem);
    }




    @Override
    public TodoItem findById(int id) {
        for (TodoItem todoItem : todoItems) {
            if (todoItem.getId() == id) {
                return todoItem;
            }
        }
        return null;
    }

    @Override
    public Collection<TodoItem> findAll() {
        return new HashSet<>(todoItems);
    }

    @Override
    public Collection<TodoItem> findAllByDoneStatus(boolean doneStatus) {
        return null;
    }

    @Override
    public Collection<TodoItem> findByTitleContains(String title) {
        return null;
    }

    @Override
    public Collection<TodoItem> findByPersonId(int personId) {
        return null;
    }

    @Override
    public Collection<TodoItem> findByDeadlineBefore(Date deadline) {
        return null;
    }

    @Override
    public Collection<TodoItem> findByDeadlineAfter(Date deadline) {
        return null;
    }

    @Override
    public void remove(TodoItem todoItem) {

    }

    public TodoItem getTodoItem() {
        return todoItem;
    }

    // Implement other methods as per requirements
}
