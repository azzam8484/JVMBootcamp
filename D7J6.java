import java.util.*;

public class D7J6 {
    public static void main(String[] args) {

        List<String> alphabets= new ArrayList<>(List.of("A", "B"));

        alphabets.addFirst("C");
        alphabets.addLast("D");

        System.out.println("First: " + alphabets.getFirst());
        System.out.println("Last: " + alphabets.getLast());


        System.out.println("Removed first: " + alphabets.removeFirst());
        System.out.println("Removed last: " + alphabets.removeLast());

        System.out.println("List: " + alphabets);

        System.out.println("Reversed: " + alphabets.reversed());



        SequencedSet<String> nums = new LinkedHashSet<>(List.of("1", "2"));

        nums.addFirst("3");
        nums.addLast("1");

        System.out.println("First: " + nums.getFirst());
        System.out.println("Last: " + nums.getLast());

        System.out.println("Removed first: " + nums.removeFirst());
        System.out.println("Removed last: " + nums.removeLast());


        System.out.println("Set: "+nums);

        System.out.println("Reversed: " + nums.reversed());

    }
}