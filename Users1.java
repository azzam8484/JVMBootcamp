package com.example.assignmentRest.Restful;
import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonFilter("PassFilter")
public class Users1 {
    private String username;
    private String email;

//    @JsonProperty(access =JsonProperty.Access.WRITE_ONLY)
    private String password;

    public Users1(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
}
