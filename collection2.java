import java.util.*;

class Employee implements Comparable<Employee> {
    Double age;
    Double salary;
    String name;

    // Constructor
    public Employee(Double age, Double salary, String name) {
        this.age = age;
        this.salary = salary;
        this.name = name;
    }

    @Override
    public int compareTo(Employee other) {
        String[] thisParts = this.name.trim().split(" ");
        String[] otherParts = other.name.trim().split(" ");

        String thisFirst = thisParts[0];
        String thisLast = thisParts[1];

        String otherFirst = otherParts[0];
        String otherLast = otherParts[1];

        int firstNameCompare = thisFirst.compareToIgnoreCase(otherFirst);

        if (firstNameCompare != 0) {
            return firstNameCompare;
        } else {
            return thisLast.compareToIgnoreCase(otherLast);
        }
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', age=" + age + ", salary=" + salary + "}";
    }
}

// Comparator for salary-based sorting
class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.salary.compareTo(e2.salary);
    }
}


public class collection2 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        // Adding sample employees
        employees.add(new Employee(22.0, 50000.0, "Azzam khan"));
        employees.add(new Employee(23.0, 45000.0, "Prince Rana"));
        employees.add(new Employee(23.0, 60000.0, "Satwik Sharma"));
        employees.add(new Employee(23.0, 40000.0, "Ayush Gupta"));
        employees.add(new Employee(20.0, 20000.0, "Shivam Chopra"));

        // Default sorting by name
        Collections.sort(employees);
        System.out.println("Sorted by name (default):");
        for (Employee emp : employees) {
            System.out.println(emp);
        }

        // Sorting by salary using Comparator
        employees.sort(new SalaryComparator());
        System.out.println("\nSorted by salary:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
