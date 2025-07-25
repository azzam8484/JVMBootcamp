package com.example.assignmentRest.Restful;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Users1Service {

    private final List<Users1> users1List=new ArrayList<>();

    public Users1 saveUser(Users1 user) {
        users1List.add(user);
        return user;
    }
}
