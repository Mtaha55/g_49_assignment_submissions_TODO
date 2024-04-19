package com.MTH;

import com.MTH.Module.Person;
import com.MTH.Module.TodoItem;
import com.MTH.Module.TodoItemTask;

/**
 * Hello world!
 *
 */

public class App {
    public static void main(String[] args) {
        // Creating a person
        Person person = new Person();
        person.setName("John");
        System.out.println("Person name: " + person.getName());

        // Creating a todo item
        TodoItem todoItem = new TodoItem();
        todoItem.setTitle("Finish project");
        todoItem.setDescription("Complete the first part of the Todo application");
        todoItem.setCreator(person);
        System.out.println("Todo item title: " + todoItem.getTitle());
        System.out.println("Todo item description: " + todoItem.getDescription());
        System.out.println("Todo item creator: " + todoItem.getCreator().getName());

        // Creating a todo item task
        TodoItemTask task = new TodoItemTask();
        task.setDescription("Implement unit tests for TodoItem class");
        task.setCompleted(false);
        task.setTodoItem(todoItem);
        System.out.println("Task description: " + task.getDescription());
        System.out.println("Task completed: " + task.isCompleted());
        System.out.println("Task belongs to todo item: " + task.getTodoItem().getTitle());
    }
}
