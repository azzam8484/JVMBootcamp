import java.util.List;

// Base sealed class
sealed abstract class D7J5
        permits Student5, Teacher1, Researcher1 {
    private final String name;

    public D7J5(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String getRole();
}

// Non-sealed class
non-sealed class Student5 extends D7J5 {
    private final int studentId;

    public Student5(String name, int studentId) {
        super(name);
        this.studentId = studentId;
    }

    @Override
    public String getRole() {
        return "Regular Student (ID: " + studentId + ")";
    }
}

// Final  teacher class
final class Teacher1 extends D7J5 {
    private final String subject;

    public Teacher1(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    @Override
    public String getRole() {
        return "Teacher of " + subject;
    }
}

// sealed subclass
sealed class Researcher1 extends D7J5
        permits PhdResearcher1, PostdocResearcher1 {

    private final String field;

    public Researcher1(String name, String field) {
        super(name);
        this.field = field;
    }

    @Override
    public String getRole() {
        return "Researcher in " + field;
    }
}

// final Researcher subclasses
final class PhdResearcher1 extends Researcher1 {
    public PhdResearcher1(String name, String field) {
        super(name, field);
    }

    @Override
    public String getRole() {
        return "PhD " + super.getRole();
    }
}

final class PostdocResearcher1 extends Researcher1 {
    public PostdocResearcher1(String name, String field) {
        super(name, field);
    }

    @Override
    public String getRole() {
        return "Postdoc " + super.getRole();
    }
}

// Extension of non-sealed Student
class InternationalStudent1 extends Student5 {
    private final String country;

    public InternationalStudent1(String name, int studentId, String country) {
        super(name, studentId);
        this.country = country;
    }

    @Override
    public String getRole() {
        return "International from " + country + " | " + super.getRole();
    }
}

public class Question5 {
    public static void main(String[] args) {
        List<D7J5> members = List.of(
                new Student5("Azzam khan", 27),
                new Teacher1("Satwik sharma", "History"),
                new PhdResearcher1("Shivam chopra", "AI"),
                new PostdocResearcher1("Shawez faridi", "Zoology"),
                new InternationalStudent1("Smith", 29, "Australia")
        );

        members.forEach(member -> {
            System.out.println(member.getName() + ": " + member.getRole());
        });
    }
}