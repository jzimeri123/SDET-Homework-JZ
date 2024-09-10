package org.example.e168;

public class E168MultipleInterface {

    public static void main(String[] args){

    }
}

interface Transaction{

    //declare unimplemented method
    void processTransaction(double amount);
}

interface BankOperations extends Transaction{
    //declaring unimplemented methods
    double deposit(double amount);
    double withdraw(double amount);
    double checkBalance();
    //inherits the processTransaction(double amount) method from Transaction
}

class BankAccount implements BankOperations{

    //creating instance variable
    private double balance;

    //constructor to initialize variable
    public BankAccount(double balance){
        this.balance=balance;
    }


    public double deposit(double depo){
        System.out.println("Transaction successful: Deposited "+depo);
        return depo;
    };

    public double withdraw(double wthdr){
        System.out.println("Transaction successful: Withdrew "+wthdr);
        return wthdr;
    };
    public double checkBalance(){

    }

}