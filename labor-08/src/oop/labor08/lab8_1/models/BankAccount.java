package oop.labor08.lab8_1;

public class BankAccount {
    protected final String accountNumber;
    protected double balance;

    public static final String PREFIX = "OTP";
    public static final int ACCOUNT_NUMBER_LENGTH =10;
    private static int numAccounts = 0;

    protected BankAccount() {
        ++numAccounts;
        this.accountNumber = createAccountNumber();
    }

    private static String createAccountNumber(){
        int numAccountsLength = String.valueOf(numAccounts).length();
        return PREFIX + "0".repeat(ACCOUNT_NUMBER_LENGTH - PREFIX.length() - numAccountsLength) + numAccounts;
    }

    public double getBalance(){
        return balance;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public void deposit(double amount) {
        this.balance = amount+this.balance;

    }

    public boolean withdraw(double amount){
        if(balance-amount<0){
            return false;
        }
        return false;
    }

    @Override
    public String toString() {
        return "balance=" + balance +
                ", accountNumber=" + accountNumber + '\'';
    }
}
