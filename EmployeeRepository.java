package com.JpaAssignment.part1Assignment.repository;

import com.JpaAssignment.part1Assignment.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>
{
    List<Employee> findByName(String name);
    List<Employee> findByNameLike(String a);
    List<Employee> findByAgeBetween(int i, int i1);
}