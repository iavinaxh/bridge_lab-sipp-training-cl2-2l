package day2;
import java.util.Scanner;
public class MultiplesBelow100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        int counter;

        System.out.print("Enter a positive integer less than 100: ");
        number = scanner.nextInt();

        if (number <= 0 || number >= 100) {
            System.out.println("Invalid input! Please enter a positive integer less than 100.");
            scanner.close();
            return;
        }

        counter = number - 1;

        System.out.println("Multiples of " + number + " below 100 are:");

        while (counter > 1) {
            if (number % counter == 0) {
                int multiple = number / counter;
                System.out.println(multiple + " * " + counter + " = " + number);
            }
            counter--;
        }

        scanner.close();
    }  
}