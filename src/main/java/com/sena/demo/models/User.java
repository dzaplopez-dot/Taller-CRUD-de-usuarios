package com.sena.demo.models;

public class User {
    private String id;
    private String name;
    private String email;
    private int age;
    private String password;

    // Constructor vacío (NECESARIO para Jackson)
    public User() {
    }

    // Constructor con parámetros
    public User(String id, String name, String email, int age, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.password = password;
    }

    // Getters y Setters (TODOS implementados)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}