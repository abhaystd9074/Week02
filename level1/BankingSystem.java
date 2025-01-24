// Bank Account Types
// Description: Model a banking system with different account types using hierarchical inheritance. BankAccount is the superclass, with SavingsAccount, CheckingAccount, and FixedDepositAccount as subclasses.
// Tasks:
// Define a base class BankAccount with attributes like accountNumber and balance.
// Define subclasses SavingsAccount, CheckingAccount, and FixedDepositAccount, each with unique attributes like interestRate for SavingsAccount and withdrawalLimit for CheckingAccount.
// Implement a method displayAccountType() in each subclass to specify the account type.
// Goal: Explore hierarchical inheritance, demonstrating how each subclass can have unique attributes while inheriting from a shared superclass.

class BankAccount{
    int accountNumber;
    int balance;
    public BankAccount(int accountNumber, int balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}
class SavingsAccount extends BankAccount{
    double interestRate;
    public SavingsAccount(int accountNumber, int balance, double interestRate){
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
    public void displayAccountDetails(){
        System.out.println("Account Number is : "+accountNumber);
        System.out.println("Balance in this account is : "+balance);
        System.out.println("Interest Rate for this account is : "+interestRate);
    }
}
class CheckingAccount extends BankAccount{
    int withdrawalLimit;
    public CheckingAccount(int accountNumber, int balance, int withdrawalLimit){
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }
    public void displayAccountDetails(){
        System.out.println("Account Number is : "+accountNumber);
        System.out.println("Balance in this account is : "+balance);
        System.out.println("Withdrawal Limit for this account is : "+withdrawalLimit);
    }
}
class FixedDepositAccount extends BankAccount{
    int tenure;
    public FixedDepositAccount(int accountNumber, int balance, int tenure){
        super(accountNumber, balance);
        this.tenure = tenure;
    }
    public void displayAccountDetails(){
        System.out.println("Account Number is : "+accountNumber);
        System.out.println("Balance in this account is : "+balance);
        System.out.println("Tenure for this account is : "+tenure);
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount(7463537, 500000, 5.5);
        CheckingAccount c = new CheckingAccount(7347291, 1000000, 500);
        FixedDepositAccount f = new FixedDepositAccount(9098776, 2876686, 3);
        s.displayAccountDetails();
        System.out.println();
        c.displayAccountDetails();
        System.out.println();
        f.displayAccountDetails();

    }
    
}
