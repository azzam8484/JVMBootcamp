package com.example.assignmentRest.Restful;
public class UserV2 {
    private String name;
    private String email;
    private String address;
    private String phone;

    public UserV2(String name, String email, String address, String phone) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.phone = phone;
    }

    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getAddress() { return address; }
    public String getPhone() { return phone; }
}