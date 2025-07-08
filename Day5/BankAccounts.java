class BankAccount {
    String accountNumber;
    double balance;
    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;
    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
    void displayAccountType() {
        System.out.println("Savings Account - Interest Rate: " + interestRate);
    }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;
    CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }
    void displayAccountType() {
        System.out.println("Checking Account - Withdrawal Limit: " + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    int maturityPeriod;
    FixedDepositAccount(String accountNumber, double balance, int maturityPeriod) {
        super(accountNumber, balance);
        this.maturityPeriod = maturityPeriod;
    }
    void displayAccountType() {
        System.out.println("Fixed Deposit - Maturity: " + maturityPeriod + " months");
    }
}

public class BankAccounts {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount("S123", 50000, 3.5);
        CheckingAccount c = new CheckingAccount("C123", 20000, 10000);
        FixedDepositAccount f = new FixedDepositAccount("F123", 100000, 12);
        s.displayAccountType();
        c.displayAccountType();
        f.displayAccountType();
    }
}
