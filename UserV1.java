package com.example.assignmentRest.Restful;
public class UserV1 {
    private String name;
    private String email;

    public UserV1(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() { return name; }
    public String getEmail() { return email; }
}