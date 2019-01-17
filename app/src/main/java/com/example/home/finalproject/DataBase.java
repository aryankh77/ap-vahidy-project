package com.example.home.finalproject;

import android.widget.TextView;

import java.io.*;
import java.util.ArrayList;

class Database implements Serializable {
    private ArrayList<Taskinfo> taskinfo;
    private ArrayList<User> users;
    private FileOutputStream fileOutputStream;
    private ObjectOutputStream objectOutputStream;
    private static Database database;

    /*private Database() {
        us = new User[100];
    }

    public static Database getDatabase() {
        return database;
    }

    static {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("\\data.txt"))) {
            database = (Database) inputStream.readObject();

        } catch (IOException | ClassNotFoundException e) {
            database = new Database();
        }
    }

    public void saveData() {
        try {
            fileOutputStream = new FileOutputStream("\\data.txt");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            objectOutputStream.writeObject(us);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void register(String username, String password, String email, String name) throws ExistingUserException {
        for (int i = 0; i < 100; i++) {
            if (us[i] !=null && us[i].getUsername().equals(username)) {
                throw new ExistingUserException();
            }
        }
        u = new User(username, password,email,name);
        u.changState(true);
        us[count] = u;
        count++;


    }

    public void login(String username, String password) throws UnknownUserException, WrongPasswordException {
        if(check(username)==null)
            throw new UnknownUserException();
        User user = check(username);
        if(!user.getPassword().equals(password))
            throw new WrongPasswordException();
        user.changState(true);
    }

    private User check(String username) {
        for (User user : us) {
            if(user.getUsername().equals(username))
                return user;
        }
        return null;
    }
}
 class ExistingUserException extends Exception {
    public ExistingUserException() {

        System.out.println("User already exists!");
    }
}
class UnknownUserException extends Exception {
    public UnknownUserException() {
        System.out.println("User  not exists!");
    }
}

class WrongPasswordException extends Exception{
    public WrongPasswordException(){
        System.out.println("wrong password");
    }*/
}