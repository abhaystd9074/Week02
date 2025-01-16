import java.util.*;
class BankAccount {
    String accountHolder;
    String accountNumber;
    int balance;
    public BankAccount(String accountHolder,String accountNumber,int balance){
        this.accountHolder=accountHolder;
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    public void Credit(int amount){
        balance+=amount;
    }
    public void withdraw(int amount){
        if(balance<amount){
            System.out.println("Insufficient balance");
        }
        else{
            balance-=amount;
        }
    }
    public void showDetails(){
        System.out.println(" Name of Account Holder is : "+accountHolder);
        System.out.println(" Account Number is : "+accountNumber);
        System.out.println(" Balance is : "+balance);
    }
    public void balance(){
        System.out.println("Updated Balance is : "+balance);
    }

}

public class Question2 {
 public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    System.out.print("Enter the name of the Account Holder: ");
    String name=sc.nextLine();
    System.out.print("enter account number: ");
    String accountNumber=sc.nextLine();
    System.out.print("Enter intial the balance: ");
    int balance=sc.nextInt();

    BankAccount ba=new BankAccount(name,accountNumber,balance);
    ba.showDetails();
    System.out.println("Do you want to perform Operations? (yes/no) ");
    String choice=sc.next();
    if(choice.equals("no")){
        System.exit(0);
    }
    System.out.print("Enter the amount to Credit: ");
    int amount=sc.nextInt();
    ba.Credit(amount);
    ba.balance();
    System.out.print("Enter the amount to withdraw: ");
    amount=sc.nextInt();
    ba.withdraw(amount);
    ba.balance();

 }   
}
