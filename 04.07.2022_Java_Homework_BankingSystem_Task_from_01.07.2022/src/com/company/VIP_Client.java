package com.company;

public class VIP_Client extends Clients {

    private double minLegalBalance=1000;
private  double bonus=5000;

    public VIP_Client(String name, Accounts accounts) {
        super(name, accounts);
        this.minLegalBalance = minLegalBalance;
        this.bonus = bonus;
    }

    public double getMinLegalBalance() {
        return minLegalBalance;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public String toString() {
        return "Individual: " + "name: " + getName() + ", account: " + getAccounts()+bonus ;
    }
    public void   calcPercent(){
        getAccounts().calcPercent(getBasePercent());
        getAccounts().addBonus(bonus);
        inform();
    }


    private void inform(){
        System.out.println("Письмо: Уважаемый: "+getName()+", Ваш баланс: "+getAccounts());
        System.out.println("Email: Уважаемый: "+getName()+", Ваш баланс: "+getAccounts());
    }
}
