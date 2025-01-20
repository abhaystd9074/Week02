class BankAccount{
    String accountHolderName ;
    final int accountNumber;
    static String bankName = "SBI";
    static int count=0;
    public BankAccount(String accountHolderName, int accountNumber){
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        count++;
    }
    public void display(){
        System.out.println("Account Holder Name is : "+accountHolderName);
        System.out.println("Account Number is : "+accountNumber);
        System.out.println("Bank Name is : "+bankName);
       
    }
    public static void getTotalAccounts(){
        System.out.println("Total number of accounts created are : "+count);
    }

}


public class Bank{
    public static void main(String[] args){
        BankAccount account1 = new BankAccount("Abhay", 12345612);
       
        BankAccount account2 = new BankAccount("Nishank", 12345734);
        BankAccount.getTotalAccounts();
        System.out.println();
        
        if(account1 instanceof BankAccount){
            System.out.println("account1 is an instance of BankAccount\n");
            System.out.println("displaying account1 details\n");
            account1.display();

        }
        if(account2 instanceof BankAccount){
            System.out.println("account2 is an instance of BankAccount\n");
            System.out.println("displaying account2 details\n");
            account2.display();

        }
    
    }

}