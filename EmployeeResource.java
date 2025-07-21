package com.RestAssignment.RestWebAssignment;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;
import java.util.List;

@RestController
public class EmployeeResource {

    private EmployeeService employeeService;

    public EmployeeResource(EmployeeService employeeService)
    {
        this.employeeService=employeeService;
    }


    @GetMapping(path = "/employees")
    public List<Employee> retrieveAllEmployee()
    {
       return  employeeService.getAllEmployees();
    }

    @GetMapping("/employees/{id}")
    public Employee retrieveOneUser(@PathVariable int id)
    {
        Employee employee= employeeService.getEmployeeById(id);
        if(employee==null)
        {
            throw new ResourceNotFoundException("id:"+id);
        }
        return employee;
    }


    @PostMapping(path = "/employees")
    public Employee addNewEmployee(@RequestBody @Valid Employee employee) {
        return employeeService.addEmployee(employee);
    }

    @DeleteMapping(path="/employees/{id}")
    public String deleteEmployeeById(@PathVariable int id)
    {
        boolean removed = employeeService.deleteEmployee(id);
        return removed ? "Employee removed" : "Employee not found";
    }


    @PutMapping("/employees/{id}")
    public Employee updateEmployee(@PathVariable int id, @RequestBody Employee employee) {

        employee.setId(id);
        return employeeService.updateEmployee(id, employee);
    }


}
