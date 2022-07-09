package com.company;

public class Individual extends Clients {
    public Individual(String name, Accounts accounts) {
        super(name, accounts);
    }

    @Override
    public String toString() {
        return "Individual: " + "name: " + getName() + ", account: " + getAccounts() ;
    }
    public void  calcPercent(){
        getAccounts().calcPercent(getBasePercent());
        inform();
    }
    private void inform(){
        System.out.println("Письмо: Уважаемый: "+getName()+", Ваш баланс: "+getAccounts());
    }
}
