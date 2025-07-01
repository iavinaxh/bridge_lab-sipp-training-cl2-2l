
public class BankAccount {
    static String bankName = "ABC Bank";
    static int totalAccounts = 0;

    private String accountHolderName;
    final private int accountNumber;

    public BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public void displayDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
        }
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Avinash", 1001);
        BankAccount acc2 = new BankAccount("Neha", 1002);

        acc1.displayDetails();
        acc2.displayDetails();

        System.out.println("Total Bank Accounts: " + BankAccount.getTotalAccounts());
    }
}
