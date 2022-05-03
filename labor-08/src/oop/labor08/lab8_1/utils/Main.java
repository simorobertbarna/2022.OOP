package oop.labor08.lab8_1;

import oop.labor06.lab6_1.Bank;
import oop.labor06.lab6_1.Customer;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank("OTP");

        Customer John = new Customer("John", "Black");
        Customer Mary = new Customer("Mary", "White");

        bank.addCustomer(John);
        bank.addCustomer(Mary);

        SavingsAccount s_account1 = new SavingsAccount(20);
        SavingsAccount s_account2 = new SavingsAccount(10);
        CheckingAccount c_account1 = new CheckingAccount(700);
        CheckingAccount c_account2 = new CheckingAccount(1200);

        John.addAccount(s_account1);
        John.addAccount(c_account1);
        Mary.addAccount(s_account2);
        Mary.addAccount(c_account2);

        for (BankAccount account : John.getAccount()) {
            Random r = new Random();
            account.deposit(r.nextDouble(2750));
        }

        for (BankAccount account : Mary.getAccount()) {
            Random r = new Random();
            account.deposit(r.nextDouble(2750));
        }

        for (Customer customer : bank.customers) {
            System.out.println(customer);
        }

        //Adding the interest to the accounts
        for (BankAccount accounts : John.getAccount()) {
            boolean isInstance = accounts instanceof SavingsAccount;
            if (isInstance) {
                ((SavingsAccount) accounts).addInterest();
            }
        }

        for (BankAccount accounts : Mary.getAccount()) {
            boolean isInstance = accounts instanceof SavingsAccount;
            if (isInstance) {
                ((SavingsAccount) accounts).addInterest();
            }
        }

        for (Customer customer : bank.customers) {
            System.out.println(customer);
        }

        //Withdrawing money from the accounts
        for (BankAccount account : John.getAccount()) {
            Random r = new Random();
            account.withdraw(r.nextDouble(2750));
        }

        for (BankAccount account : Mary.getAccount()) {
            Random r = new Random();
            account.withdraw(r.nextDouble(2750));
        }

        for (Customer customer : bank.customers) {
            System.out.println(customer);
        }
    }

}
