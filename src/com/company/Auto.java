package com.company;

public class Auto {
    String model;
    String color;
    int year;

    public Auto(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }
    public void print(){
        System.out.println("The car is: "+model+year+color);
    }

    @Override
    public String toString() {
        return "Auto{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }
}
