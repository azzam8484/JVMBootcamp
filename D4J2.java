@FunctionalInterface
interface Operation
{
    int apply(int a, int b);
}
public class D4J2 {
        public int add(int a, int b) {
            return a + b;
        }

        public int subtract(int a, int b) {
            return a - b;
        }

        public static int multiply(int a, int b) {
            return a * b;
        }

    public static void main(String[] args) {

        D4J2 calc = new D4J2();
        Operation addition = calc::add;
        Operation subtraction = calc::subtract;

        // Static Method Reference
        Operation multiplication = D4J2::multiply;
        System.out.println("Add: " + addition.apply(10, 5));
        System.out.println("Subtract: " + subtraction.apply(10, 5));
        System.out.println("Multiply: " + multiplication.apply(10, 5));
    }
}
