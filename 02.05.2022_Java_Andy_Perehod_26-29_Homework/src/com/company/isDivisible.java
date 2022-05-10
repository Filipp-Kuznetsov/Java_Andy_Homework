package com.company;

import java.util.Scanner;

public class isDivisible {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        isDivisible(a,b);

    }
    public static boolean isDivisible(int a ,int b){

        if (a % b==0){
            System.out.println("числа "+a+" и "+b+" делятся друг на друга без остатка");

            return true;

        }else {

            System.out.println("числа "+a+" и "+b+" не делятся друг на друга без остатка");
            return false;
        }

    }
}
