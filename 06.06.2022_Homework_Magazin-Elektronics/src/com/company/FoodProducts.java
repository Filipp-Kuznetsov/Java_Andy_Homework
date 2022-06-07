package com.company;

public class FoodProducts extends Goods {
    public FoodProducts(String name, double price) {
        super(name, price);
    }
    void buy(){
        System.out.println("Your price is: "+getPrice()+10+" $ for express delivery.");
    }
}
