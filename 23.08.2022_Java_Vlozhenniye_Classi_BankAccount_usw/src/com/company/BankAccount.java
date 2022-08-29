package com.company;

public class BankAccount {
    private String Owner;
    private int IBAN;
    private  double balance;

    public BankAccount(String owner, int IBAN, double balance) {
        Owner = owner;
        this.IBAN = IBAN;
        this.balance = balance;
    }

    public String getOwner() {
        return Owner;
    }

    public void setOwner(String owner) {
        Owner = owner;
    }

    public int getIBAN() {
        return IBAN;
    }

    public void setIBAN(int IBAN) {
        this.IBAN = IBAN;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "Owner='" + Owner + '\'' +
                ", IBAN=" + IBAN +
                ", balance=" + balance +
                '}';
    }
    public double withdraw(double amount){
       return balance-=amount;
    }
}
