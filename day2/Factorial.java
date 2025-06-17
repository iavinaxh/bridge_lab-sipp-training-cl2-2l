package day2;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        long factorial = 1;

        System.out.print("Enter a positive integer: ");
        num = sc.nextInt();

        if (num < 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
            System.out.println("Factorial of " + num + " is " + factorial);
        }

        sc.close();
    } 
}



    
