package com.Security.sec;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleController {

    @GetMapping("/admin")
    public String adminAccess() {
        return "Hello Admin! You have access.";
    }

    @GetMapping("/user")
    public String userAccess() {
        return "Hello User! You have access.";
    }

    @GetMapping("/")
    public String home() {
        return "Welcome! Please log in.";
    }
}

