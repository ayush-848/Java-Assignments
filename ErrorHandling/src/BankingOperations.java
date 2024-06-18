import Exceptions.*;

public class BankingOperations {

    public static void deposit(BankAccount account, int amount) throws InvalidDepositException {
        if (amount <= 0) {
            throw new InvalidDepositException("Deposit amount must be positive.");
        }
        else{
            System.out.println("An amount of "+amount+" has been successfully added to your bank account");
            account.setBalance( account.getCurrentBalance()+amount);
        }
    }

    public static void withdraw(BankAccount account, int amount) throws InvalidWithdrawException {
        if (amount <= 0) {
            throw new InvalidWithdrawException("Withdraw amount must be positive.");
        }
        if (account.getCurrentBalance() < amount) {
            throw new InvalidWithdrawException("Insufficient balance.");
        }
      else{
            System.out.println("You have successfully withdrawn = Rs."+amount);
            account.setBalance( account.getCurrentBalance()-amount);
        }
    }
}