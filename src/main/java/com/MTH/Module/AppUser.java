package com.MTH.Module;

import java.util.Objects;

public class AppUser {
    private String username;
    private String password;
    private AppRole role;
    private Person credentials;

    // Constructor
    public AppUser(String username, String password, AppRole role) {
        this.username = Objects.requireNonNull(username, "Username cannot be null");
        this.password = Objects.requireNonNull(password, "Password cannot be null");
        this.role = Objects.requireNonNull(role, "Role cannot be null");
    }

    // Getters and Setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public AppRole getRole() {
        return role;
    }

    public void setRole(AppRole role) {
        this.role = role;
    }

    public Person getCredentials() {
        return credentials;
    }

    public void setCredentials(Person credentials) {
        this.credentials = credentials;
    }

    // toString() method
    @Override
    public String toString() {
        return "AppUser{" +
                "username='" + username + '\'' +
                ", role=" + role +
                '}';
    }

    // hashCode() method
    @Override
    public int hashCode() {
        return Objects.hash(username, role);
    }

    // equals() method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppUser appUser = (AppUser) o;
        return Objects.equals(username, appUser.username) &&
                role == appUser.role;
    }
}
