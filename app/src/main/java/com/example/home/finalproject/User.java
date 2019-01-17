package com.example.home.finalproject;
import java.util.ArrayList;
public class User {
    private String username;
    private String password;
    private String email;
    private String name;
    private boolean state;
    private ArrayList<Taskinfo> array;


    public User(String username, String password, String email, String name) {
        this.username = username;
        this.password= password;
        this.email = email;
        this.name = name;
        array= new ArrayList<Taskinfo>();

    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }
    void changState(boolean state) {
        this.state = state;
    }
}
