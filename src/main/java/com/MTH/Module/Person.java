package com.MTH.Module;

import java.util.Objects;

public class Person {
    private int id;
    private String name;

    // Constructor, Getters, and Setters...

    // toString() method
    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    // hashCode() method
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    // equals() method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id &&
                Objects.equals(name, person.name);
    }

    public void setName(String john) {
    }
}
