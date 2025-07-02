import java.util.*;

public class D7J7 {
    public static void main(String[] args) {
        SequencedMap<String, Integer> map = new LinkedHashMap<>();

        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        System.out.println("First Entry: " + map.firstEntry());
        System.out.println("Last Entry: " + map.lastEntry());

        map.putFirst("D", 4);
        map.putLast("E", 5);

        System.out.println("After putFirst and putLast:");
        System.out.println(map);

        Map.Entry<String, Integer> firstPolled = map.pollFirstEntry();
        Map.Entry<String, Integer> lastPolled = map.pollLastEntry();

        System.out.println("Polled First Entry: " + firstPolled);
        System.out.println("Polled Last Entry: " + lastPolled);

        System.out.println("Map after polling:");
        System.out.println(map);

        SequencedMap<String, Integer> reversed = map.reversed();
        System.out.println("Reversed Map:");
        System.out.println(reversed);
    }
}
