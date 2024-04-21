package com.MTH.DataDAO;

import com.MTH.Module.TodoItem;

import java.util.Collection;
import java.util.Date;

import java.util.Collection;

public interface TodoItemDAO {
    void persist(TodoItem todoItem);
    TodoItem findById(int id);
    Collection<TodoItem> findAll();
    Collection<TodoItem> findAllByDoneStatus(boolean doneStatus);
    Collection<TodoItem> findByTitleContains(String title);
    Collection<TodoItem> findByPersonId(int personId);
    Collection<TodoItem> findByDeadlineBefore(Date deadline);
    Collection<TodoItem> findByDeadlineAfter(Date deadline);
    void remove(TodoItem todoItem);
}
