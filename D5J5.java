import java.util.List;

class Employee2 {
    String fullName;
    Long salary;
    String city;

    public Employee2(String fullName, Long salary, String city) {
        this.fullName = fullName;
        this.salary = salary;
        this.city = city;
    }
}

public class D5J5 {
    public static void main(String[] args) {
        List<Employee2> employees = List.of(
                new Employee2("Satwik Kumar Sharma", 4000L, "Jaipur"),
                new Employee2("Ayush Singh Gupta", 4500L, "Delhi"),
                new Employee2("Ayush Kumar Chopra", 3000L, "Delhi"),
                new Employee2("Dev Vrat Sharma", 5000L, "Pune"),
                new Employee2("Vasu Dev Sharma", 4000L, "delhi")
        );

        List<String> uniqueFirstNames = employees.stream()
                .filter(emp -> emp.salary < 5000)
                .filter(emp -> emp.city.equalsIgnoreCase("delhi"))
                .map(emp -> emp.fullName.split(" ")[0])
                .distinct()
                .toList();

        System.out.println("Unique first names: " + uniqueFirstNames);
    }
}