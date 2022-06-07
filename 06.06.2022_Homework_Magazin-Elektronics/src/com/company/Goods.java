package com.company;

public  class Goods {
   private String name;
  private double price;

    public Goods(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    void buy() {

    }
    double sale (){
        return (getPrice()*15/100);
    }
}
