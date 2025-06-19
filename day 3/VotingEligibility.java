import java.util.*;
public class VotingEligibility {
    public static void main(String[] args) {
        int[] age = new int[10];
        Scanner scanner = new Scanner(System.in);
         for(int i = 0; i < age.length; i++) {
            System.out.print("Enter age for person " + (i + 1) + ": ");
            age[i] = scanner.nextInt();
        }
        for(int i = 0; i < age.length; i++){
        if (age[i] < 0) {
            System.out.println("Enter a valid age.");
        } else if(age[i]>=18) {
            System.out.println("You are eligible to vote.");
        }
        else{
            System.out.println("You are not eligible to vote.");
        }
    }
        
        scanner.close();
    }
    
}
