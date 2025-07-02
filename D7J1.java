import java.util.Objects;

record Student(int id, String name, int standard) {

}

public class D7J1 {
    public static void main(String[] args) {
        Student student = new Student(1, "Azzam khan", 12);

        System.out.println(student);
        System.out.println("ID: " + student.id());
        System.out.println("Name: " + student.name());
        System.out.println("Standard: " + student.standard());
    }
}