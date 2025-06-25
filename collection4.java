import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

// Employee class
class Employee1 {
    String name;
    int age;
    String designation;

    public Employee1(String name, int age, String designation) {
        this.name = name;
        this.age = age;
        this.designation = designation;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Employee1)) return false;

        Employee1 other = (Employee1) obj;
        return this.name.equals(other.name) &&
                this.age == other.age &&
                this.designation.equals(other.designation);
    }

    // Override hashCode() to match equals()
    @Override
    public int hashCode() {
        return Objects.hash(name, age, designation);
    }


    @Override
    public String toString() {
        return name + " (" + age + ", " + designation + ")";
    }
}

public class collection4 {
    public static void main(String[] args) {

        Map<Employee1, Double> salaryMap = new HashMap<>();

        Employee1 e1 = new Employee1("Azzam", 22, "Java Developer");
        Employee1 e2 = new Employee1("Rahul", 25, "DevOps Engineer");
        Employee1 e3 = new Employee1("Shivam", 28, "Scrum Master");

        salaryMap.put(e1, 15000.0);
        salaryMap.put(e2, 20000.0);
        salaryMap.put(e3, 30000.0);

        for (Map.Entry<Employee1, Double> entry : salaryMap.entrySet()) {
            System.out.println("Employee: " + entry.getKey() + "  Salary: ₹" + entry.getValue());
        }
    }
}
