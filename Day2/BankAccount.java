class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    public void setBalance(double amount) {
        this.balance = amount;
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    void displayAccess() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
    }
}
