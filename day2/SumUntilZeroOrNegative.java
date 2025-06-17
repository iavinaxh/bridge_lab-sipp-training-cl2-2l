package day2;
import java.util.Scanner;
public class SumUntilZeroOrNegative {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            int num = scanner.nextInt();

            if (num <= 0) {
                break; 
            }
            
            sum += num;
        }

        System.out.println("Sum of entered positive numbers: " + sum);
        scanner.close();
    }
}
