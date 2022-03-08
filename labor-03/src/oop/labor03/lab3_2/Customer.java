package oop.labor03.lab3_2;

import oop.labor03.lab3_1.BankAccount;


public class Customer {
    private String firstName;
    private String lastName;
    private double balance;
    private BankAccount account;
    public static final int maxAccounts = 10;
    private int numAccounts=0;
    int accountNumber;

    private BankAccount accounts[] = new BankAccount[maxAccounts];

    public Customer(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void addAccount(BankAccount account){
        if(numAccounts < maxAccounts){
            accounts[numAccounts] = account;
            ++numAccounts;
        }
    }

    public BankAccount getAccount(String accountNumber){
        for (int i=0; i<numAccounts; i++){
            if(accounts[i].getAccountNumber().equals(accountNumber)){
                return accounts[i];
            }
        }
        return null;
    }

    public int getNumAccounts(){
        return numAccounts;
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
        int succes=0;
        for (int i=0; i<numAccounts; i++){
            if(accounts[i].getAccountNumber().equals(accountNumber)){
                accounts[i]=null;
                accounts[i]=accounts[numAccounts-1];
                accounts[numAccounts-1]=null;
                --numAccounts;
                ++succes;
                break;
            }
        }
        if(succes==0){
            System.out.println("Invalid account number:" + accountNumber+ "\n");
        }
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
        if (numAccounts==0){
            return getFirstName() + ' ' + getLastName() + "\n User do not have an account\n";
        }
        StringBuffer result = new StringBuffer();
        result.append(getFirstName() + ' ' + getLastName() + " accounts:\n");
        for (int i = 0; i < numAccounts; ++i) {
            result.append("\t" + accounts[i].toString() + "\n");
        }
        return result.toString();
    }
}


