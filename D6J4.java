import java.util.List;
import java.util.stream.Stream;
public class D6J4 {
    public static void main(String[] args)
    {
        Stream<String> stream = Stream.of("A", "B", "C");

        List<String> unmodifiableList = stream.toList();

        System.out.println(unmodifiableList);
    }
}
