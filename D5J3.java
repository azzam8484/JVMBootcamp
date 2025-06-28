import java.util.Arrays;
import java.util.List;

public class D5J3 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2, 8, 3, 10, 4, 7, 1, 9);

        int sum = numbers.stream()
                .filter(n -> n > 5)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Sum of numbers greater than 5: " + sum);
    }
}