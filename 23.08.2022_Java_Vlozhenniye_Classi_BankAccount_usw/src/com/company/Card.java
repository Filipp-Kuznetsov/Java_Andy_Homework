package com.company;

public class Card {
    private String owner;
    private  String number;
    BankAccount bankAccount;

    public Card(String owner, String number, BankAccount bankAccount) {
        this.owner = owner;
        this.number = number;
        this.bankAccount = bankAccount;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public String toString() {
        return "Card{" +
                "owner='" + owner + '\'' +
                ", number='" + number + '\'' +
                ", bankAccount=" + bankAccount +
                '}';
    }
    public double withdraw(double amount){
        return bankAccount.withdraw(amount);
    }
}
