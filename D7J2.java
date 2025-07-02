import java.util.Objects;

record Student1(int id, String name, int standard) {

    public Student1 {
        Objects.requireNonNull(name, "Name cannot be null");
        name = name.trim();
    }
}

public class D7J2 {
    public static void main(String[] args) {
        Student1 student1 = new Student1(1, "azzam", 12);

        System.out.println(student1);
        System.out.println("ID: " + student1.id());
        System.out.println("Name: " + student1.name());
        System.out.println("Standard: " + student1.standard());
    }
}