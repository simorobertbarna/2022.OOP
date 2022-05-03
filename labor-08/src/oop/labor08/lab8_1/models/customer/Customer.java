package oop.labor08.lab8_1.models.customer;

import oop.labor08.lab8_1.BankAccount;

import java.util.ArrayList;

public class Customer{
    private final String firstName;
    private String lastName;
    private final int id;
    private static int numCustomers = 0;
    private ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();


    public Customer(String fName, String lName){
        this.firstName = fName;
        this.lastName = lName;
        this.id = ++numCustomers;
    }

    public int getNumAccounts() {
        return accounts.size();
    }

    public void addAccount(BankAccount account ){
        this.accounts.add(account);
    }


    public BankAccount getAccount(String accountNumber){
        for (BankAccount i : accounts) {
            if(i.getAccountNumber().equals(accountNumber)){
                return i;
            }
        }
        return null;
    }

    public ArrayList<String> getAccountNumbers(){
        ArrayList<String> accountNumbers = new ArrayList<>();
        for(BankAccount account:accounts){
            accountNumbers.add(account.getAccountNumber());
        }
        return accountNumbers;
    }

    public String getFirstName(){

        return this.firstName;
    }

    public String getLastName(){

        return this.lastName;
    }

    public int getId() {
        return id;
    }

    public void setLastName(String lName){

        this.lastName = lName;
    }

    public void closeAccount(String accountNumber){
        for(BankAccount i:accounts){
            if(i.getAccountNumber().equals(accountNumber)){
                this.accounts.remove(i);
                return;
            }
        }
        System.out.println("Account not found");
    }

    public ArrayList<BankAccount> getAccount() {
        return accounts;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(firstName).append(' ').append(lastName).append(" accounts:\n");
        for(BankAccount i:accounts){
            result.append("\tBankAccount(accountNumber = '").append(i.getAccountNumber()).append(" ', balance = ").append(i.getBalance()).append(")\n");
        }
        return result.toString();
    }
}
