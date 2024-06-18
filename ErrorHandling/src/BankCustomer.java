import java.util.Scanner;

public class BankCustomer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BankAccount Ayush = new BankAccount();
        Ayush.showInfo();
        int withdraw,deposit;
        withdraw= in.nextInt();
        System.out.println(withdraw);
    }
}