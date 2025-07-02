import java.util.Objects;

record Student2(int id, String name, int standard) {

    public Student2 {
        Objects.requireNonNull(name, "Name cannot be null");
        name = name.trim();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student2 student2 = (Student2) o;
        return id == student2.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

public class D7J3 {
    public static void main(String[] args) {
        Student2 student2 = new Student2(1, "azzam", 12);
        Student2 student3= new Student2(1,"azzam",12);

        System.out.println(student2);
        System.out.println("ID: " + student2.id());
        System.out.println("Name: " + student2.name());
        System.out.println("Standard: " + student2.standard());
        System.out.println("Both objects same:"+ student2.equals(student3));
        System.out.println("Hashcode is obj1:" + student2.hashCode());
        System.out.println("Hashcode is obj2:"+ student3.hashCode());
    }
}