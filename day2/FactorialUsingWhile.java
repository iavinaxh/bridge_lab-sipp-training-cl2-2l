package day2;
import java.util.Scanner;
public class FactorialUsingWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        long factorial = 1;

        System.out.print("Enter a positive integer: ");
        num = scanner.nextInt();

        if (num < 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int i = 1;
            while (i <= num) {
                factorial *= i;
                i++;
            }
            System.out.println("Factorial of " + num + " is " + factorial);
        }

        scanner.close();
    }
    
}