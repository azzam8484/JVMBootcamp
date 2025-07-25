package com.example.assignmentRest.Restful;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class User1Controller {

    @Autowired
    private Users1Service users1Service;

    @PostMapping("/filtering-list")
    public Users1 filteringList(@RequestBody Users1 user)
    {
       return users1Service.saveUser(user);
    }

    @PostMapping("/filtering-list-Dynamic")
    public MappingJacksonValue filteringListDynamicD(@RequestBody Users1 user) {
        Users1 savedUser = users1Service.saveUser(user);

        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter
                .filterOutAllExcept("username", "email");

        FilterProvider filters = new SimpleFilterProvider()
                .addFilter("PassFilter", filter);

        MappingJacksonValue mapping = new MappingJacksonValue(savedUser);
        mapping.setFilters(filters);
        return mapping;
    }
}
