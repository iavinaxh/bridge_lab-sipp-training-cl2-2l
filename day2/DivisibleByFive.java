package day2;
import java.util.*;
public class DivisibleByFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to check if it is divisible by 5:");
        int num = sc.nextInt();

        if (num % 5 == 0){
            System.out.println("Is the number " + num + " divisible by 5?"  +" Yes");
        } else {
            System.out.println("Is the number " + num + " divisible by 5? " + "No");
        }
        
        sc.close();
        
    }
    
}
