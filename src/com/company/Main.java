package com.company;

public class Main {

    public static void main(String[] args) {
	Auto auto1=new Auto("Toyota cresta","red",2003);
	Auto auto2=new Auto("Rangerover evoque","black",2020);
	Auto auto3=new Auto("Volkswagen touareg","green",2000);
	Auto auto4=new Auto("Nissan skyline","white",1999);
    Auto[] autos ={auto1,auto2,auto3,auto4};
        for (int i = 0; i < autos.length ; i++) {
            System.out.println( autos[i].toString());
        }
    }
}
