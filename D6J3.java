import java.util.List;
import java.util.Map;
import java.util.Set;

public class D6J3 {
    public static void main(String[] args)
    {
        List<String> names= List.of("Azzam", "Satwik", "shivam");
        System.out.println(names);

        Set<Integer> numbers = Set.of(2,1,3,5,7);
        System.out.println(numbers);

        Map<String, Integer> ageMap = Map.of(
                "Azzam", 22,
                "Satwik", 23,
                "Shivam", 21
        );
        System.out.println(ageMap);
    }
}
