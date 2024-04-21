package com.MTH.DataDAO;

import com.MTH.Module.TodoItem;
import com.MTH.Module.TodoItemTask;
import com.MTH.Sequencer.TodoItemSequencer;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import com.MTH.Module.TodoItem;
import com.MTH.Sequencer.TodoItemTaskSequencer;


public class TodoItemTaskDAOImpl implements TodoItemTaskDAO {
    private final Collection<TodoItemTask> todoItemTasks = new HashSet<>();

    @Override
    public void persist(TodoItemTask todoItemTask) {
        todoItemTask.setId(TodoItemTaskSequencer.nextId());
        todoItemTasks.add(todoItemTask);
    }

    @Override
    public TodoItemTask findById(int id) {
        for (TodoItemTask todoItemTask : todoItemTasks) {
            if (todoItemTask.getId() == id) {
                return todoItemTask;
            }
        }
        return null;
    }

    @Override
    public Collection<TodoItemTask> findAll() {
        return new HashSet<>(todoItemTasks);
    }

    @Override
    public Collection<TodoItemTask> findByAssignedStatus(boolean assigned) {
        return null;
    }

    @Override
    public Collection<TodoItemTask> findByPersonId(int personId) {
        return null;
    }

    @Override
    public void remove(TodoItemTask todoItemTask) {

    }

    // Implement other methods as per requirements
}
