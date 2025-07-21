package com.RestAssignment.RestWebAssignment;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    private List<Employee> employees = new ArrayList<>();

    public List<Employee> getAllEmployees() {
        return employees;
    }

    public EmployeeService() {
        employees.add(new Employee(1, "Azzam khan", 22));
        employees.add(new Employee(2, "Shivam chopra", 21));
        employees.add(new Employee(3, "Satwik sharma", 24));
    }

    public Employee getEmployeeById(int id) {
        for (Employee emp : employees) {
            if (emp.getId() == id) {
                return emp;
            }
        }
        return null;
    }


    public Employee addEmployee(Employee employee) {
        employees.add(employee);
        return employee;
    }

    public Employee updateEmployee(int id, Employee updatedEmployee) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId() == id) {
                employees.set(i, updatedEmployee);
                return updatedEmployee;
            }
        }
        return null;
    }

    public boolean deleteEmployee(int id) {
        return employees.removeIf(emp -> emp.getId() == id);
    }
}
