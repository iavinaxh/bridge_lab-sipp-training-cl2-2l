package day2;

import java.util.*;
public class RocketLaunch{


public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the countdown start number: ");
        int counter = sc.nextInt();

        while (counter >= 1) {
            System.out.println("T-minus " + counter);
            counter--;
        }
        System.out.println("Launch!");
        sc.close();
    }
}