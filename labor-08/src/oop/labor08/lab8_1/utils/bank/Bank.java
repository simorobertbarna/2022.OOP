package oop.labor08.lab8_1.utils.bank;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;

public class Bank {
    private String name;
    ArrayList<Customer> customers = new ArrayList<>();


    public Bank(String name) {
        this.name = name;
    }

    public Customer getCustomer(int id){
        for(Customer c: customers){
            if(c.getId() == id){
                return c;
            }
        }
        return null;
    }

    public void addCustomer(Customer customer){
        customers.add(customer);
    }

    public int numCustomers(){
        return customers.size();
    }

    public void printCustomersToStdout(){
        printCustomers(System.out);
    }

    public void printCustomersToFile(String fileName){
        try(PrintStream output = new PrintStream(fileName)){
            printCustomers(output);
        }
        catch(FileNotFoundException ex){
            ex.printStackTrace();
        }
    }

    private void printCustomers(PrintStream printStream){
        printStream.println("ID, Firstname, Last name, Number of bank accounts");
        for( Customer customer: customers ){
            printStream.println( customer.getId()+", " + customer.getFirstName() +", "+
                    customer.getLastName()+", "+customer.getNumAccounts());
        }
        printStream.close();
    }
}
