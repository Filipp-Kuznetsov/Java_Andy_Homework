package com.company;

public abstract class Clients {
    private String name;
    private Accounts accounts;
    private  double basePercent=10;

    public Clients(String name, Accounts accounts) {
        this.name = name;
        this.accounts = accounts;
        ;
    }

    public String getName() {
        return name;
    }

    public Accounts getAccounts() {
        return accounts;
    }

    public double getBasePercent() {
        return basePercent;
    }

    @Override
    public String toString() {
        return "Сlient: " + "name: " + name +", account: " + accounts ;
    }
    public abstract void calcPercent();
}
