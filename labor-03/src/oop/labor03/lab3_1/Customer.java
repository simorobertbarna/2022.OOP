package oop.labor03.lab3_1;

import com.sun.source.tree.ClassTree;

public class Customer {
        private String firstName;
        private String lastName;
        private double balance;
        BankAccount account;

    public Customer(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void SetAccount(BankAccount account){
        this.account = account;
    }

    public BankAccount getAccount(){
        return this.account;
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

    public void closeAccount(){
        account = null;
    }

    public boolean withdraw(double money){
        boolean result = false;

        if( balance >= money){
            balance -= money;
            result = true;
        }
        return result;
    }


    public String ToString() {
        if (account == null) {
            return "First name: "  + this.firstName + "\n" + "Last name: "+this.lastName + "\n" +"Account: The customer has no account!"+ "\n";
        }
        else{
            return "First name: "  + this.firstName + "\n" + "Last name: " +this.lastName +"\n "+ "Account details: "+ "\n" + this.account;
        }
    }
}

