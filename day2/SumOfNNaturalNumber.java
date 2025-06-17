package day2;
import java.util.Scanner;

public class SumOfNNaturalNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a positive integer.");
            scanner.close();
            return;
        }

        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("The number is not a natural number. Please enter a positive integer.");
            scanner.close();
            return;
        }

        int sumForLoop = 0;
        for (int i = 1; i <= n; i++) {
            sumForLoop += i;
        }

        int sumFormula = n * (n + 1) / 2;

        if (sumForLoop == sumFormula) {
            System.out.println("Both methods give the same result: " + sumForLoop);
        } else {
            System.out.println("Results do not match. There might be an error.");
        }

        System.out.println("Sum using for loop: " + sumForLoop);
        System.out.println("Sum using formula: " + sumFormula);

        scanner.close();
    }
}