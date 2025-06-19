package day2;
import java.util.Scanner;
public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;

        System.out.print("Enter a positive integer: ");
        number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Invalid input! Please enter a positive integer.");
            scanner.close();
            return;
        }

        System.out.println("Factors of " + number + " are:");

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
    
}