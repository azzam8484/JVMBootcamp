package Java2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class User {
    String firstname;
    String lastname;
    int age;
    String phonenumber;

    public User(String firstname, String lastname, int age, String phonenumber) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.phonenumber = phonenumber;
    }

    @Override
    public String toString() {
        return firstname + "," + lastname + "," + age + "," + phonenumber;
    }
}

public class D2J2 {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in); FileWriter writer = new FileWriter("users.txt", true)) {
            String continueInput;
            do {
                System.out.print("Enter First Name: ");
                String firstname = scanner.nextLine();

                System.out.print("Enter Last Name: ");
                String lastname = scanner.nextLine();

                System.out.print("Enter Age: ");
                int age = Integer.parseInt(scanner.nextLine());

                System.out.print("Enter Phone Number: ");
                String phonenumber = scanner.nextLine();

                User user = new User(firstname, lastname, age, phonenumber);

                writer.write(user.toString() + "\n");
                writer.flush();

                System.out.print("Do you want to continue creating users? (Type QUIT to exit): ");
                continueInput = scanner.nextLine();
            } while (!continueInput.equals("QUIT"));

            System.out.println("User creation complete. Data saved to users.txt");

        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format for age.");
        }
    }
}
