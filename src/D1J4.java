import java.util.*;
public class D1J4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int r = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int c = scanner.nextInt();

        int[][] arr = new int[r][c];

        System.out.println("Enter elements of the array:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {

                arr[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nSum of each row:");
        for (int i = 0; i < r; i++) {
            int rSum = 0;
            for (int j = 0; j < c; j++) {
                rSum += arr[i][j];
            }
            System.out.println("Row " + (i+1) + " sum = " + rSum);
        }


        System.out.println("\nSum of each column:");
        for (int j = 0; j < c; j++) {
            int cSum = 0;
            for (int i = 0; i < r; i++) {
                cSum += arr[i][j];
            }
            System.out.println("Column " + j+1 + " sum = " + cSum);
        }
    }
}
