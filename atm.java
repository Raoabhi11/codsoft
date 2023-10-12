import java.util.Scanner;

class Account {
    private double balance;

    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        } else {
            return false; // Insufficient balance
        }
    }
}
class ATMI {
    private Account userAccount;

    public ATMI(Account account) {
        this.userAccount = account;
    }

    public void displayOptions() {
        System.out.println("ATM Options:");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
    }

    public void performTransaction(int choice, Scanner scanner) {
        switch (choice) {
            case 1:
                System.out.println("Enter withdrawal amount: ");
                double withdrawAmount = scanner.nextDouble();
                boolean success = userAccount.withdraw(withdrawAmount);
                if (success) {
                    System.out.println("Withdrawal successful. New balance: " + userAccount.getBalance());
                } else {
                    System.out.println("Insufficient balance for withdrawal.");
                }
                break;
            case 2:
                System.out.println("Enter deposit amount: ");
                double depositAmount = scanner.nextDouble();
                userAccount.deposit(depositAmount);
                System.out.println("Deposit successful. New balance: " + userAccount.getBalance());
                userAccount.getBalance();
                break;
            case 3:
                System.out.println("Current balance: " + userAccount.getBalance());
                break;
            case 4:
                System.out.println("Thank you for using the ATM.");
                System.exit(0);
            default:
                System.out.println("Invalid choice. Please select a valid option.");
        }
    }
}

public class atm {
    public static void main(String[] args) {
        Account userAccount = new Account(1000.0);
        ATMI atm = new ATMI(userAccount);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            atm.displayOptions();
            System.out.print("Select an option: ");
            int choice = scanner.nextInt();

            if (choice < 1 || choice > 4) {
                System.out.println("Invalid choice. Please select a valid option.");
                continue;
            }
              atm.performTransaction(choice, scanner);
        }
    }
}
