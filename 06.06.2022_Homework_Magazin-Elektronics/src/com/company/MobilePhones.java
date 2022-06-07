package com.company;

public class MobilePhones extends Electronic{
    public MobilePhones(String name, double price) {
        super(name, price);
    }
    @Override
    void buy(){
        additionalInsurance();

    }
    void additionalInsurance(){
        System.out.println("Do you want to take additional insurance now? When yes," +
                " please press '1', default press anyone another key");
        int answer=sc.nextInt();
        if (answer==1){
            System.out.println("Your price is: "+(getPrice()+getPrice()*15/100+100)+" Euro,     " +
                    "100 Euro for operator contract and 15% for additional insurance.");
        }
        else  {
            System.out.println("Your price is: "+(getPrice()+100)+" Euro,       100 Euro for operator contract");
        }
    }
}
