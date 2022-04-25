package oop.labor06.lab6_1;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {
    public static void main(String[] args) {

        ArrayList <Customer> customers = new ArrayList<>();
        /*ArrayList <BankAccount> accounts = new ArrayList<>();

        for (int i = 0; i< 200; i++){
            accounts.add(new BankAccount());
        }
        for(BankAccount account: accounts){
            System.out.println(account);
        }*/
        customers.add(new Customer("Simon","Peter"));
        customers.add(new Customer("Szoverfi","Daniel"));
        customers.add(new Customer("Szentgyorgyi","Bernad"));
        Random rand = new Random();
        for (Customer customer: customers){
            for(int i = 0; i < rand.nextInt(10); i++){
                customer.addAccount(new BankAccount());
            }
        }

        for(Customer customer: customers){
            System.out.println(customer);
        }

    }
}

