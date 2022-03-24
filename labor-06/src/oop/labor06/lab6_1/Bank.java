package oop.labor06.lab6_1;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Customer> customers = new ArrayList<>();

    public Bank(String name) {
        this.name = name;
    }

    public Customer getCustomer(int id){
        for(Customer customer:customers){
            if(customer.getId() == id){
                return customer;
            }
        }
        return null;
    }



    public void printCustomersToFile(String filename){

        try(PrintStream printStream = new PrintStream(filename)){
            printCustomers(printStream);
        }catch (FileNotFoundException ex){
            ex.printStackTrace();
        }
    }


    public void printCustomersToStdOut(){

        printCustomers(System.out);

    }

    private void printCustomers(PrintStream printStream){

        //itt van a konkret kiiratas
        printStream.println("ide irunk ki");

    }

}
