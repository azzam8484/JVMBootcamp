package Java2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class D2J3{
    public static void main(String[] args) {
        if (args.length != 2) {
            return;
        }

        String file = args[0];
        String target = args[1];
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\W+");
                for (String word : words) {
                    if (word.equalsIgnoreCase(target)) {
                        count++;
                    }
                }
            }
            System.out.println("The word '" + target+ "' occurred " + count + " times.");
        } catch (IOException e) {
            System.out.println("An error occurred during reading the file: " + e.getMessage());
        }
    }
}
