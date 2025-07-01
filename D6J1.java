import java.util.stream.Stream;

public class D6J1 {
    public static void main(String[] args)
    {
        Stream<Integer> numberStream = Stream.iterate(1, n -> n + 1);

        numberStream.limit(5).forEach(System.out::println);
    }
}
