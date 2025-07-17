package org.example1.q4;

import org.springframework.stereotype.Component;

@Component
public class Employee {
    String name="Azzam khan";
    String competency="Java";
    int age=22;
    Double salary=15000.00;

    public String getName() {
        return name;
    }

    public String getCompetency() {
        return competency;
    }

    public int getAge() {
        return age;
    }

    public Double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", competency='" + competency + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
