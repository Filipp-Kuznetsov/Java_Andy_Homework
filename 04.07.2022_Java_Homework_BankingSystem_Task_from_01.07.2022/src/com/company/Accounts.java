package com.company;

public  class Accounts {
    private String ibann;
    private  double balance;

    public Accounts(String ibann, double balance) {
        this.ibann = ibann;
        this.balance = balance;
    }

    public String getIbann() {
        return ibann;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account: " + "ibann: " + ibann  + ", balance: " + balance;
    }
    public  void calcPercent(double percent){
        balance=balance+(balance/100*percent);
    }
    public double addBonus(double bonus){
       return balance+=bonus;
    }

}
