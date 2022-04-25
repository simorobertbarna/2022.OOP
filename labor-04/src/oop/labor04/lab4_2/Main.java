package oop.labor04.lab4_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        ArrayList<Customer> customerArrayList = readFile("lab4_2_input.csv");
        for (Customer customer : customerArrayList) {
            System.out.println(customer);
        }
    }
    public static ArrayList<Customer> readFile(String fileName){
        ArrayList<Customer> customers = new ArrayList<>();
        try (Scanner scanner = new Scanner( new File(fileName))){
            int i = 0;
            while(scanner.hasNextLine())
            {
                String line = scanner.nextLine();

                String[] items = line.split(",");
                if(items[0].equals("Customer")){
                    String firstName = items[1].trim();
                    String lastName = items[2].trim();
                    customers.add(new Customer(firstName,lastName));
                    i++;
                }
                else{
                    customers.get(i-1).addAccount(new BankAccount(items[1]));
                    customers.get(i-1).getAccount(items[1]).deposit(Double.parseDouble(items[2]));
                }
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return customers;
    }
}