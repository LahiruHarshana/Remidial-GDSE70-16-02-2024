public class Main {
public static void main(String[] args) {
    // Create new BankAccount objects
    BankAccount account1 = new BankAccount("12345", 1000.0, "John Doe");
    BankAccount account2 = new BankAccount("67890", 2000.0, "Jane Smith");

    System.out.println("Initial Details:");

    System.out.println("Account 1:");

    System.out.println("Account Number: " + account1.getAccountNumber());
    System.out.println("Owner Name: " + account1.getOwnerName());
    System.out.println("Balance: $" + account1.checkBalance());

    System.out.println("Account 2:");

    System.out.println("Account Number: " + account2.getAccountNumber());
    System.out.println("Owner Name: " + account2.getOwnerName());
    System.out.println("Balance: $" + account2.checkBalance());

    account1.deposit(500); // Deposit $500 into account1
    account2.withdraw(1000); // Withdraw $1000 from account2
    // Display updated details of accounts

    System.out.println("\nUpdated Details after Transactions:");

    System.out.println("Account 1:");
    System.out.println("Account Number: " + account1.getAccountNumber());
    System.out.println("Owner Name: " + account1.getOwnerName());
    System.out.println("Balance: $" + account1.checkBalance());

    System.out.println("Account 2:");
    System.out.println("Account Number: " + account2.getAccountNumber());
    System.out.println("Owner Name: " + account2.getOwnerName());
    System.out.println("Balance: $" + account2.checkBalance());

    }

}
