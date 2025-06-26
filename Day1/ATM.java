import java.util.Scanner;

class BankAccount {
    String accountHolder;
    String accountNumber;
    double balance;

    void deposit(double amount) {
        balance += amount;
        System.out.println("₹" + amount + " deposited.");
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    void displayBalance() {
        System.out.println("Current balance: ₹" + balance);
    }
}

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount acc = new BankAccount();

        System.out.print("Enter Account Holder Name: ");
        acc.accountHolder = sc.nextLine();
        System.out.print("Enter Account Number: ");
        acc.accountNumber = sc.nextLine();
        acc.balance = 10000; // Initial balance

        acc.displayBalance();
        acc.deposit(2000);
        acc.withdraw(5000);
        acc.displayBalance();

        sc.close();
    }
}