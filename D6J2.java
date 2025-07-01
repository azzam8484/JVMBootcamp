import java.util.Optional;
import java.util.stream.Stream;

public class D6J2 {
    public static void main(String[] args)
    {
                Optional<String> optional = Optional.of("Azzam");

                Stream<String> stream = optional.stream();

                System.out.println("Stream contents:");
                stream.forEach(System.out::println);
    }
}
