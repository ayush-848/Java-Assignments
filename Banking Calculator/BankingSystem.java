import java.util.Random;

class BankAccount {
    private String accountNumber;
    private double balance;
    private static int totalAccounts = 0;

    public BankAccount() {
        System.out.println("\n----------------------------------------------------------------------------------------------");
        System.out.println("Thank You, for creating an account in our bank\n");
        accountNumber = generateAccountNumber();
        balance = 0.0;
        totalAccounts++;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    private static String generateAccountNumber() {
        Random random = new Random();
        return String.format("XXXXXX%05d", random.nextInt(100000));
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + " into account " + getAccountNumber());
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn $" + amount + " from account " + getAccountNumber());
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds");
        }
    }

    public void displayBalance() {
        System.out.println("Account " + getAccountNumber() + " has a balance: $" + getBalance());
        System.out.println("----------------------------------------------------------------------------------------------\n");
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        account1.setBalance(200.0);
        System.out.println("Your Initial Account balance is : "+ account1.getBalance()+"\n");
        account1.deposit(1000.0);
        account1.withdraw(500.0);
        account1.displayBalance();

        BankAccount account2 = new BankAccount();
        System.out.println("Your Initial Account balance is : "+ account2.getBalance()+"\n");
        account2.deposit(25000.0);
        account2.withdraw(1750.0);
        account2.displayBalance();

        System.out.println("Total number of accounts created : " + BankAccount.getTotalAccounts());
    }
}