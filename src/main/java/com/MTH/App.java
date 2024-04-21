package com.MTH;

import com.MTH.DataDAO.*;
import com.MTH.Module.*;

import java.util.Collection;
import java.util.Date;
import com.MTH.Sequencer.*;


public class App {;
        public static void main(String[] args) {
            // Initialize DAOs
            TodoItemDAO todoItemDAO = new TodoItemDAOImpl();
            TodoItemTaskDAO todoItemTaskDAO = new TodoItemTaskDAOImpl();

            // Create and persist TodoItem
            TodoItem todoItem1 = new TodoItem();
            todoItem1.setTitle("Complete project");
            todoItem1.setDone(false);
            todoItem1.setPersonId(1);
            todoItem1.setDeadline(new Date(System.currentTimeMillis() + 86400000)); // Tomorrow
            todoItemDAO.persist(todoItem1);

            // Create and persist TodoItemTask
            TodoItemTask todoItemTask1 = new TodoItemTask();
            todoItemTask1.setDescription("Review documentation");
            todoItemTask1.setAssigned(false);
            todoItemTask1.setPersonId(1);
            todoItemTaskDAO.persist(todoItemTask1);

            // Retrieve TodoItems and TodoItemTasks
            Collection<TodoItem> todoItems = todoItemDAO.findAll();
            Collection<TodoItemTask> todoItemTasks = todoItemTaskDAO.findAll();

            // Display retrieved data
            System.out.println("Todo Items:");
            for (TodoItem todoItem : todoItems) {
                System.out.println(todoItem.getTitle());
            }

            System.out.println("\nTodo Item Tasks:");
            for (TodoItemTask todoItemTask : todoItemTasks) {
                System.out.println(todoItemTask.getDescription());
            }
        }
    }