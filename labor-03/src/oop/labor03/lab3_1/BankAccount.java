package oop.labor03.lab3_1;

public class BankAccount {
    //Attributes
    private String accountNumber;
    private double balance;

    //Constructor
    public BankAccount(String accountNumber){
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double sum){
        if( sum > 0) {
            this.balance = (int)((double)this.balance + sum);
        }
    }
    public boolean withdraw(double money){
        boolean result = false;

        if(this.balance >= money){
            this.balance -= money;
            result = true;
        }
        return false;
    }

    public String toString(){
        return "Account: " + this.accountNumber + ", balance: " + this.balance;
    }
}
