import Exceptions.*;
import java.util.Scanner;
import java.util.InputMismatchException;

public class BankAccount{
    private String accountNumber;
    private int currentBalance;
    public BankAccount(){
        setAccount();
        setBalance(0);
        System.out.println("\n----------------------------------------------------------------------------------------------");
        System.out.println("Thank You, for creating an account in our bank\n");
    }
    public void setAccount(){
        AccountNumber acc=new AccountNumber();
        accountNumber= acc.checkValidation();
    }
    public void setBalance(int currentBalance){
        this.currentBalance=currentBalance;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public int getCurrentBalance(){
        return currentBalance;
    }
    public void showInfo(){
        System.out.println("Your Account number is = "+getAccountNumber());
        System.out.println("Your Current Balance is = "+getCurrentBalance());
    }
}