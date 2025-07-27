package com.JpaAssignment.part1Assignment.controller;

import com.JpaAssignment.part1Assignment.entity.Employee;
import com.JpaAssignment.part1Assignment.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeRepository repository;

    @PostMapping("/create")
    public Employee createEmployee(@RequestBody Employee employee)
    {
        return repository.save(employee);
    }

    @PutMapping("/update/{id}")
    public Employee updateEmployee(@PathVariable int id, @RequestBody Employee updatedEmployee)
    {
        Optional<Employee> optionalEmployee = repository.findById(id);
        if (optionalEmployee.isPresent()) {
            Employee existingEmployee = optionalEmployee.get();

            existingEmployee.setName(updatedEmployee.getName());
            existingEmployee.setAge(updatedEmployee.getAge());
            existingEmployee.setLocation(updatedEmployee.getLocation());

            return repository.save(existingEmployee);
        } else {
            throw new RuntimeException("Employee not found with id: " + id);
        }
    }

    @DeleteMapping("/delete/{id}")
    public void deleteEmployee(@PathVariable int id)
    {
        if (!repository.existsById(id)) {
            throw new RuntimeException("Employee not found with id: " + id);
        }
        repository.deleteById(id);
    }

    @GetMapping("/show")
    public List<Employee> showAllEmployee()
    {
        return repository.findAll();
    }

    @GetMapping("/count")
    public int showAllEmployeeCount()
    {
        return (int) repository.count();
    }

    @GetMapping("/PaginationAndSorting")
    public Page<Employee> paginationAndSorting(@RequestParam int page, @RequestParam int size)
    {
        Pageable pageable=PageRequest.of(page,size, Sort.by("age").descending());
        return repository.findAll(pageable);
    }

    @GetMapping("/findByName/{name}")
    public List<Employee> findByName(@PathVariable String name)
    {
        return repository.findByName(name);
    }

    @GetMapping("/findByNameLike")
    public List<Employee> findByNameLike()
    {
        return repository.findByNameLike("a%");
    }

    @GetMapping("/findByAgeBetween28ANd32")
    public List<Employee> findByAgeRange()
    {
        return repository.findByAgeBetween(28,32);
    }

}
