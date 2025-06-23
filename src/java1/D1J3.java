package java1;

import java.util.*;
public class D1J3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        double radius;

        do {
            System.out.println("\n-----> Menu <------");
            System.out.println("1. Calculate Area of Circle");
            System.out.println("2. Calculate Circumference of Circle");
            System.out.println("3. Exit");
            System.out.print("Choose an option (1-3): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter radius: ");
                    radius = scanner.nextDouble();
                    System.out.println("Area of Circle: " + calculateArea(radius));
                    break;

                case 2:
                    System.out.print("Enter radius: ");
                    radius = scanner.nextDouble();
                    System.out.println("Circumference of Circle: " + calculateCircumference(radius));
                    break;

                case 3:
                    System.out.println("Exit!!!");
                    break;

                default:
                    System.out.println("Invalid option. Please choose between 1 and 3.");
            }
        } while (choice != 3);

        scanner.close();
    }

    static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    static double calculateCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static class NoStackTraceException extends RuntimeException
    {
        public NoStackTraceException(String message) {
            super(message);
        }

        @Override
        public synchronized Throwable fillInStackTrace() {
            // Prevents the stack trace from being generated
            return null;
        }
    }
}
