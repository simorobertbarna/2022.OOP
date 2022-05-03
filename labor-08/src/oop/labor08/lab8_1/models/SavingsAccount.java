package oop.labor08.lab8_1;

public class SavingsAccount extends BankAccount{
    private double interestRate;

    public SavingsAccount( double interestRate){
        //super(); //osztaly konstrukotr hivas
        this.interestRate = interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void addInterest(){
       super.balance=this.interestRate*super.balance;
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "interestRate=" + interestRate +
                '}';
    }
}
