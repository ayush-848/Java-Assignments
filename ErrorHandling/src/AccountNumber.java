import java.util.Scanner;

public class AccountNumber {
    private final Scanner in;

    public AccountNumber(){
        this.in=new Scanner(System.in);
    }

    public String checkValidation(){
        String accNo=null;
        boolean validAcc=false;
        while(!validAcc){
            System.out.println("Enter a valid account number only containing digits");
            accNo=in.nextLine();
            int accLength=accNo.length();
            if(accLength==5){
                try{
                    Integer.parseInt(accNo);
                    validAcc=true;
                    System.out.println("You have entered a valid Account Number\n");
                }catch(NumberFormatException e){
                    System.out.println("Please enter a valid Account Number\n");
                }
            }else{
                System.out.println("Account Number should be of 5 digits\n");
            }
        }
        in.close();
        return accNo;
    }
}