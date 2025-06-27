@FunctionalInterface
interface Demo2{
    Person create(String name, int age);
}

class Person {
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void showDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class D4J4 {
    public static void main(String[] args) {
        // Constructor reference
        Demo2 d = Person::new;

        // Create object using constructor reference
        Person p = d.create("Azzam", 22);

        p.showDetails();
    }
}
