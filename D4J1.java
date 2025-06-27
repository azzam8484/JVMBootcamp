public class D4J1 {

    @FunctionalInterface
    interface CheckGreater {
        boolean isGreater(int a, int b);
    }


    @FunctionalInterface
    interface Incrementer {
        int increment(int a);
    }


    @FunctionalInterface
    interface Concatenator {
        String concat(String a, String b);
    }


    @FunctionalInterface
    interface UpperCaser {
        String toUpper(String s);
    }

    public static void main(String[] args) {

        CheckGreater isGreater = (a, b) -> a > b;
        System.out.println("10 is Greater than 5: " + isGreater.isGreater(1, 5));

        Incrementer inc = a -> a + 1;
        System.out.println("value (7) after increment: " + inc.increment(7)); // 8

        Concatenator concat = (a, b) -> a + b;
        System.out.println("After concatenating strings (Azzam and khan): " + concat.concat("Azzam", "khan"));

        UpperCaser upper = s -> s.toUpperCase();
        System.out.println("Uppercasing (azzam): " + upper.toUpper("azzam"));
    }
}
