import java.util.Optional;

public class D5J4{

    public static void main(String[] args) {
        // Creating Optional objects
        Optional<String> name = Optional.of("Azzam khan");
        Optional<String> empty = Optional.empty();

        System.out.println("Name is present? " + name.isPresent());
        System.out.println("Empty is present? " + empty.isPresent());

        System.out.println("\nName: " + name.orElse("Unknown"));
        System.out.println("Empty: " + empty.orElse("Empty box"));

        System.out.print("Name action: ");
        name.ifPresent(val -> System.out.println("Hello, " + val)); // Hello, Alice

        System.out.print("Empty action: ");
        empty.ifPresent(val -> System.out.println("This won't print"));

        // handling null values safely
        String potentialNull = null;
        Optional<String> safeNull = Optional.ofNullable(potentialNull);

        System.out.println("\nSafeNull is present? " + safeNull.isPresent());
        System.out.println("SafeNull value: " + safeNull.orElse("Handled null!"));
    }
}