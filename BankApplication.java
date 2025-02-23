import java.util.*;
public class BankApplication {
    public static void main(String[] args){

        BankAccount obj = new BankAccount("PrivateBanklimited","SL0003");
        obj.showMenu();

    }
    
}
class BankAccount{
    int balance;
    int previousTransaction;
    String customerName;
    String customerid;

    BankAccount(String cname ,String cid){
        customerName = cname;
        customerid = cid;
    }

    void deposit(int amount){
        if(amount !=0){
            balance = balance + amount;
            previousTransaction = amount;
        }
    }
    void withdraw(int amount){
        if(amount !=0){
            balance = balance - amount;
            previousTransaction = amount;
        }        
    }
    void getpreviousTransaction(){
        if(previousTransaction > 0){
            System.out.println("Deposited: " + previousTransaction);
        }
        else if(previousTransaction < 0){
            System.out.println("Withdraw: " +Math.abs(previousTransaction));
        }
        else{
            System.out.println("No Transaction occured");
        }        
    }
    void showMenu(){

        char option = '\0';
        Scanner sc = new Scanner(System.in);
        
        System.out.println(":Welcome"+customerName);
        System.out.println("your ID"+customerid);
        System.out.println("\n");

        System.out.println("A : Check your Balance");
        System.out.println("B: Deposit");
        System.out.println("C: Withdraw");
        System.out.println("D:Prevous Transaction");
        System.out.println("E: Exit the System");
    
        do{
            System.out.println("='='='='='='='='='='='='='='='='='='='='='='='='='");
            System.out.println("Enter Your Option");
            System.out.println("='='='='='='='='='='='='='='='='='='='='='='='='='");
            option = sc.next().charAt(0);
            System.out.println("\n");

            switch(option){
                case 'A':
                    System.out.println("='='='='='='='='='='='='='='='='='='='='='='='='='");
                    System.out.println("Balance = "+balance);
                    System.out.println("='='='='='='='='='='='='='='='='='='='='='='='='='");
                    System.out.println("\n");
                    break;

                case 'B':
                    System.out.println("='='='='='='='='='='='='='='='='='='='='='='='='='");
                    System.out.println("Enter an amount to deposite");
                    System.out.println("='='='='='='='='='='='='='='='='='='='='='='='='='");
                    
                    int amount = sc.nextInt();
                    deposit(amount);
                    System.out.println("\n");
                    break;

                case 'C':
                    System.out.println("='='='='='='='='='='='='='='='='='='='='='='='='='");
                    System.out.println("Enter an amount to withdraw");
                    System.out.println("='='='='='='='='='='='='='='='='='='='='='='='='='");

                    int amount2 = sc.nextInt();
                    deposit(amount2);
                    System.out.println("\n");
                    break;

                case 'D':
                    System.out.println("='='='='='='='='='='='='='='='='='='='='='='='='='");
                    getpreviousTransaction();
                    System.out.println("='='='='='='='='='='='='='='='='='='='='='='='='='");
                    System.out.println("\n");
                    break;

                case 'E':
                    System.out.println("==================================================");
                    break;

                default:
                System.out.println("Inavalid Option!! Please enter Correct option....");                
                break;
            }
        }
        while(option != 'E');
        System.out.println("Thankyou for using our services.....!!");
    }
}
