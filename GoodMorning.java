package com.example.assignmentRest.Restful;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

@RestController
@Tag(name = "User Management APIs", description = "APIs for greeting, creating, retrieving, and deleting users")
public class GoodMorning {

    @Autowired
    private MessageSource messageSource;

@Autowired
private UsersDao service;

    @Operation(
            summary = "Returns a localized good morning message",
            description = "Fetches a message from the message source based on the user's locale"
    )
    @GetMapping(path = "/good-morning-international")
    public String helloWorldInternational()
    {
        Locale locale= LocaleContextHolder.getLocale();
        return messageSource.getMessage("goodmorning.message",null,"Default message",locale);
    }


    @GetMapping("/greetings")
    public String greetUser(@RequestParam String username) {

        Locale locale=LocaleContextHolder.getLocale();
        return messageSource.getMessage("greeting.message", new Object[]{username}, locale);
    }


        @PostMapping(path = "/users",consumes = MediaType.APPLICATION_XML_VALUE, produces = MediaType.APPLICATION_XML_VALUE)
        public Users createUser(@RequestBody Users user) {
            System.out.println("Received User: " + user);
            service.addUser(user);
            return user;
        }

    @Operation(
            summary = "Retrieve all users (XML only)",
            description = "Fetches the list of all users in the system in XML format"
    )
    @GetMapping(value = "/users", produces = MediaType.APPLICATION_XML_VALUE)
    public List<Users> retrieveAllUsers()
    {
        return service.findAll();
    }

    @Operation(
            summary = "Delete a user by ID",
            description = "Deletes the user with the specified ID from the system"
    )
    @DeleteMapping("/users/{id}")
    public void deleteOneUser(@PathVariable int id)
    {
        service.deleteById(id);
    }

    @GetMapping("/users/{id}")
    public EntityModel<Users> retrieveOneUser(@PathVariable int id)
    {
        Users user= service.findOne(id);

        EntityModel entityModel=EntityModel.of(user);

        WebMvcLinkBuilder link=WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(this.getClass()).retrieveAllUsers());
        entityModel.add(link.withRel("all-users"));
        return entityModel;
    }
}
