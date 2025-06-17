package day2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the opeartion you want to perform(+, -, /, *): ");
        char operation = sc.next().charAt(0);
        
        System.out.print("Enter two number: ");
        double num1 = sc.nextDouble();
        double num2= sc.nextDouble();
        
        switch(operation) {
        case '+' :
        	System.out.println("Result:" + (num1 + num2));
        	break;
        	
        case '-' :
        	System.out.println("Result:" + (num1 - num2));
        	break;
        	
        case '/' :
        	System.out.println("Result:" + (num1 / num2));
        	break;
        	
        case '*' :
        	System.out.println("Result:" + (num1 * num2));
        	break;
        	
        default :
        	System.out.println("operation is invalid");
        }
        sc.close();
	}

}
