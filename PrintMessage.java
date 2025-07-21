package com.RestAssignment.RestWebAssignment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrintMessage {

    @GetMapping(path = "/print")
    public String print()
    {
        return "Welcome to spring boot";
    }
}
