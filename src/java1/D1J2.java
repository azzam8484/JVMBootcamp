package java1;

import java.util.Scanner;

public class D1J2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder inputText = new StringBuilder();

        System.out.println("Enter text (type 'XDONE' to finish):");

        while (true) {
            String str= scanner.nextLine();
            if (str.equals("XDONE")) {
                break;
            }
            inputText.append(str).append("\n");
        }

        System.out.println("\nYou entered the text:");
        System.out.println(inputText.toString());
    }
}
