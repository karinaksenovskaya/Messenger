package com.example.messenger;

import androidx.annotation.NonNull;

public class User {
    private String id;
    private String name;
    private String lastName;
    private int age;
    private Boolean isOnline;

    public User(String id, String name, String lastName, int age, Boolean isOnline) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.isOnline = isOnline;
    }

    public User() {
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public Boolean getIsOnline() {
        return isOnline;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", isOnline=" + isOnline +
                '}';
    }
}
