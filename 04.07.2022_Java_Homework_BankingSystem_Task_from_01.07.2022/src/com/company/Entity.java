package com.company;

public class Entity extends Clients {

    private double minLegalBalance=1000;

    public Entity(String name, Accounts accounts) {
        super(name, accounts);
        this.minLegalBalance = minLegalBalance;
    }

    public double getMinLegalBalance() {
        return minLegalBalance;
    }

    @Override
    public String toString() {
        return "Individual: " + "name: " + getName() + ", account: " + getAccounts() ;
    }
    public void  calcPercent(){
        if (getAccounts().getBalance()>=minLegalBalance);
        getAccounts().calcPercent(getBasePercent());
        inform();
    }


    private void inform(){
        System.out.println("Письмо: Уважаемый: "+getName()+", Ваш баланс: "+getAccounts());
    }
}