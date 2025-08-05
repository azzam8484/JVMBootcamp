package com.Assignment.JPA2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;


    @GetMapping("/EmployeeDetails")
    public List<Object[]> printHighEarningEmployees() {
        return employeeRepository.findEmployeesWithSalaryAboveAverageOrdered();
    }


    @GetMapping("/all")
    public List<Employee> AllEmployees()
    {
       return employeeRepository.findAll();
    }

    @PutMapping("/updateEmployee")
    public int updateSalariesBelowAverage(double newSalary) {
        Double avgSalary = employeeRepository.findAverageSalary();
        return employeeRepository.updateSalaryBelowAverage(newSalary, avgSalary);
    }

    @DeleteMapping("/DeleteMin")
    public int deleteEmployeesWithMinSalary() {
        Double minSalary = employeeRepository.findMinimumSalary();
        return employeeRepository.deleteByMinSalary(minSalary);
    }

    @GetMapping("/lastname/singh")
    public List<Map<String, Object>> getEmployeesEndingWithSingh() {
        List<Object[]> results = employeeRepository.findEmployeesByLastNameSingh();
        List<Map<String, Object>> response = new ArrayList<>();
        for (Object[] row : results) {
            Map<String, Object> map = new HashMap<>();
            map.put("id", row[0]);
            map.put("firstName", row[1]);
            map.put("age", row[2]);
            response.add(map);
        }
        return response;
    }

    @DeleteMapping("/deleteByAge")
    public int deleteByAgeEmployee()
    {
        return employeeRepository.deleteEmployeesWithAgeGreaterThan(45);

    }


}
