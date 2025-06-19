package day2;
import java.util.Scanner;
public class FriendsAgeHeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ageAmar, ageAkbar, ageAnthony;
        double heightAmar, heightAkbar, heightAnthony;

        System.out.print("Enter age of Amar: ");
        ageAmar = scanner.nextInt();
        System.out.print("Enter height of Amar (in cm): ");
        heightAmar = scanner.nextDouble();

        System.out.print("Enter age of Akbar: ");
        ageAkbar = scanner.nextInt();
        System.out.print("Enter height of Akbar (in cm): ");
        heightAkbar = scanner.nextDouble();

        System.out.print("Enter age of Anthony: ");
        ageAnthony = scanner.nextInt();
        System.out.print("Enter height of Anthony (in cm): ");
        heightAnthony = scanner.nextDouble();

        int youngestAge = ageAmar;
        if (ageAkbar < youngestAge)
            youngestAge = ageAkbar;
        if (ageAnthony < youngestAge)
            youngestAge = ageAnthony;

        double tallestHeight = heightAmar;
        if (heightAkbar > tallestHeight)
            tallestHeight = heightAkbar;
        if (heightAnthony > tallestHeight)
            tallestHeight = heightAnthony;

        System.out.println("The youngest friend's age is: " + youngestAge);
        System.out.println("The tallest friend's height is: " + tallestHeight + " cm");

        scanner.close();
    }
    
}