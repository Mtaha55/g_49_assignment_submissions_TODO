package com.MTH;

import com.MTH.Module.*;



public class App {
    public static void main(String[] args) {
        // Creating a person
        Person person = new Person();
        person.setName("John");

        // Creating an app user
        AppUser appUser = new AppUser("john_doe", "password123", AppRole.ROLE_APP_USER);
        appUser.setCredentials(person);

        System.out.println("App user: " + appUser);

        // Creating a todo item
        TodoItem todoItem = new TodoItem();
        todoItem.setTitle("Finish project");
        todoItem.setDescription("Complete the first part of the Todo application");
        todoItem.setCreator(person);

        // Creating a todo item task
        TodoItemTask task = new TodoItemTask();
        task.setDescription("Implement unit tests for TodoItem class");
        task.setCompleted(false);
        task.setTodoItem(todoItem);

        System.out.println("Todo item task: " + task);
    }
}