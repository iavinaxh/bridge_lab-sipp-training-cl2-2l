package day2;
import java.util.*;
public class SumOfNaturalNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a positive integer (Natural number): ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a natural number greater than 0.");
            scanner.close();
            return;
        }

        int i = 1;
        int sumLoop = 0;
        while (i <= n) {
            sumLoop += i;
            i++;
        }

        int sumFormula = n * (n + 1) / 2;

        System.out.println("Sum using while loop: " + sumLoop);
        System.out.println("Sum using formula: " + sumFormula);

        if (sumLoop == sumFormula) {
            System.out.println("Both results match. The computations are correct.");
        } else {
            System.out.println("Results do not match! There might be an error.");
        }

        scanner.close();
    }
    
}