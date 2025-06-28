import java.util.function.*;

public class D5J1{

    public static void main(String[] args) {
        //Consumer<T>: Takes a value and returns nothing
        Consumer<String> display = msg -> System.out.println("Printing: " + msg);
        display.accept("Hello, Azzam khan!!! How are you?");

        //Supplier<T>: Takes nothing and returns a value
        Supplier<Double> randomNumber = () -> Math.random();
        System.out.println("Random number: " + randomNumber.get());

        //Predicate<T>: Takes a value and returns boolean
        Predicate<Integer> isOdd = num -> num % 2 != 0;
        System.out.println("10 is odd: " + isOdd.test(10)); // true
        System.out.println("7 is odd:  " + isOdd.test(7));   // false

        //Function<T, R>: Takes input T and returns R
        Function<String, Integer> stringLength = str -> str.length();
        System.out.println("Length of 'azzamkhan': " + stringLength.apply("azzamkhan")); // 6
    }
}
