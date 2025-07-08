import java.util.ArrayList;

class Account {
    int accountNumber;
    double balance;
    Bank bank;

    Account(int accountNumber, double balance, Bank bank) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.bank = bank;
    }

    void showAccountDetails() {
        System.out.println("Account No: " + accountNumber + ", Balance: ₹" + balance + ", Bank: " + bank.bankName);
    }
}

class Bank {
    String bankName;

    Bank(String bankName) {
        this.bankName = bankName;
    }

    Account openAccount(Customer customer, int accNo, double initialBalance) {
        Account account = new Account(accNo, initialBalance, this);
        customer.addAccount(account);
        System.out.println("Account opened in " + bankName + " for " + customer.name);
        return account;
    }
}

class Customer {
    String name;
    ArrayList<Account> accounts;

    Customer(String name) {
        this.name = name;
        accounts = new ArrayList<>();
    }

    void addAccount(Account account) {
        accounts.add(account);
    }

    void viewBalances() {
        System.out.println("Accounts for " + name + ":");
        for (Account a : accounts) {
            a.showAccountDetails();
        }
    }
}

public class BankApp {
    public static void main(String[] args) {
        Bank sbi = new Bank("SBI");
        Bank hdfc = new Bank("HDFC");

        Customer avinash = new Customer("Avinash");
        Customer riya = new Customer("Riya");

        sbi.openAccount(avinash, 101, 5000);
        hdfc.openAccount(avinash, 102, 10000);
        sbi.openAccount(riya, 201, 7000);

        System.out.println();
        avinash.viewBalances();
        System.out.println();
        riya.viewBalances();
    }
}
