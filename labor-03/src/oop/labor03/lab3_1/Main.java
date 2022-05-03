package oop.labor03.lab3_1;

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("OTP00001");
        Customer customer1 = new Customer("John", "BLACK");
        customer1.SetAccount(account1);
        //System.out.println(customer1.ToString());
        customer1.getAccount().deposit(10000);
        //customer1.withdraw(250);

        Customer customer2 = new Customer("Mary", "WHITE");
        BankAccount account2 = new BankAccount("OTP00002");
        customer2.SetAccount(account2);
        customer2.getAccount().deposit(5500);
        account2.withdraw(2750);
        //System.out.println(customer2.ToString());
        customer2.closeAccount();
        //System.out.println(customer2.ToString());
        customer2.setLastName(customer1.getLastName());
        System.out.println(customer2.toString());

    }
}
