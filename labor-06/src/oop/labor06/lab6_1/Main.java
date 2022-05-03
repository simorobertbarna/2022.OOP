package oop.labor06;

import oop.labor06.lab6_1.Bank;
import oop.labor06.lab6_1.BankAccount;
import oop.labor06.lab6_1.Customer;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<BankAccount> bankAccounts = new ArrayList<>();
        ArrayList<Customer> customers = new ArrayList<>();
        for(int i = 0; i < 200 ; ++i){
            bankAccounts.add(new BankAccount());
        }
        for(BankAccount account:bankAccounts){
            System.out.println(account);
        }

        Bank bank = new Bank("OTP");
        bank.addCustomer(new Customer("Nagy","Anita"));
        bank.addCustomer(new Customer("Kis","Virag"));
        bank.getCustomer(1).addAccount(new BankAccount());
        bank.getCustomer(1).addAccount(new BankAccount());
        bank.getCustomer(2).addAccount(new BankAccount());
        bank.getCustomer(2).addAccount(new BankAccount());
        System.out.println(bank.getCustomer(1));
        for(int i = 1; i <= 2; ++i){
            for(String accountnum:bank.getCustomer(i).getAccountNumbers()){
                bank.getCustomer(i).getAccount(accountnum).deposit(3000);
            }
        }
        System.out.println(bank.getCustomer(2));
        bank.printCustomersToFile("bank_customers.csv");
    }
}
