package oop.labor04.lab4_2;


import java.util.ArrayList;

public class Customer {
    private String firstName;
    private String lastName;
    private double balance;
    private BankAccount account;
    int accountNumber;

    private ArrayList<BankAccount> accounts = new ArrayList<>();

    public Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void addAccount(BankAccount account) {
    }


    public BankAccount getAccount(String accountNumber){
        return ;
    }

    public int getNumAccounts(){
        return ;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void closeAccount(String accountNumber){

    }

    public boolean withdraw(double money){
        boolean result = false;

        if( balance >= money){
            balance -= money;
            result = true;
        }
        return result;
    }

    public String toString() {

}


