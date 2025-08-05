package com.Assignment.JPA2;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>
{
    @Query("SELECT e.firstName, e.lastName " +
            "FROM Employee e " +
            "WHERE e.salary > (SELECT AVG(e2.salary) FROM Employee e2) " +
            "ORDER BY e.age ASC, e.salary DESC")
    List<Object[]> findEmployeesWithSalaryAboveAverageOrdered();




    @Query("SELECT AVG(e.salary) FROM Employee e")
    Double findAverageSalary();

    @Modifying
    @Transactional
    @Query("UPDATE Employee e SET e.salary = :newSalary WHERE e.salary < :averageSalary")
    int updateSalaryBelowAverage(@Param("newSalary") double newSalary, @Param("averageSalary") double averageSalary);




    @Query("SELECT MIN(e.salary) FROM Employee e")
    Double findMinimumSalary();

    @Modifying
    @Transactional
    @Query("DELETE FROM Employee e WHERE e.salary = :minSalary")
    int deleteByMinSalary(@Param("minSalary") double minSalary);


    @Query(value = "SELECT empId, empFirstName, empAge FROM employeeTable WHERE empLastName LIKE '%singh'", nativeQuery = true)
    List<Object[]> findEmployeesByLastNameSingh();


    @Modifying
    @Transactional
    @Query(value = "DELETE FROM employeeTable WHERE empAge > :age", nativeQuery = true)
    int deleteEmployeesWithAgeGreaterThan(@Param("age") int age);


}


