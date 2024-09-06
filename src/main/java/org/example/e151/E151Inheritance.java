package org.example.e151;

public class E151Inheritance {
    public static void main(String[] args) {
        //creating object for SavingsAccount class
        SavingsAccount obj1=new SavingsAccount("John Doe","123456789",1000.0,0.01);
        obj1.deposit(50);
        obj1.applyInterest();
        obj1.printAccountInfo();
        //creating object for CheckingAccount
        CheckingAccount obj2=new CheckingAccount("Jane Smith",1000.0,"987654321",-100);
        obj2.withdraw(1050);
        obj2.printAccountInfo();
}
}

class BankAccount{
    private String accountHolderName;
    private double balance;
    private String accountNumber;

    //constructor to initialize instance variables
    public BankAccount(String accountHolderName, double balance, String accountNumber){
        this.accountHolderName=accountHolderName;
        this.accountNumber=accountNumber;
        this.balance=balance;
    }

    //getter to get account balance
    public double getBalance(){
        return balance;
    }

    //setter to update account balance
    public void setBalance(double balance){
        this.balance=balance;
    }
//capture deposit amount and update the balance
    public void deposit(double amount){
        balance= balance+amount;
    }

    public void withdraw(double amount){
        if(balance>=amount){
            balance=balance-amount;
        }else{
            System.out.println("Insufficient amount");
        }

    }

    public void printAccountInfo(){
        System.out.println("Account Holder: "+accountHolderName);
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Balance: "+balance);
        System.out.println();

    }

}

class CheckingAccount extends BankAccount {
    private double overdraftLimit;

    public CheckingAccount(String accountHolderName, double balance, String accountNumber, double overdraftLimit) {
        super(accountHolderName, balance, accountNumber);
        this.overdraftLimit = overdraftLimit;
    }

    public void withdraw(double amount) {
        if (getBalance()-amount>=overdraftLimit){
            setBalance(getBalance()-amount);
        }else {
            System.out.println("Insuficient Balance");
        }


    }
}
    class SavingsAccount extends BankAccount {
        private double interestRate;

        //constructor from parent class
        public SavingsAccount(String accountHolderName, String accountNumber, double balance, double interestRate) {
            super(accountHolderName, balance, accountNumber);
            this.interestRate = interestRate;
        }

        public void applyInterest() {

            double newBalance = getBalance() + ((interestRate /getBalance())* 100);
            setBalance(newBalance);
        }
    }
