package com.Security.sec;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @GetMapping("/public")
    public String publicEndpoint() {
        return "Public endpoint";
    }

    @GetMapping("/secure")
    public String secureEndpoint() {
        return "You are authenticated with OAuth2 JWT!";
    }
}
