package com.company;

import java.util.Scanner;

public class Zadacha3_Method_Boolean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        checkdivider(a,b,c);
    }

    public static boolean checkdivider(int a, int b, int c){
        if (a % c==0 && b %c==0){
            System.out.println("делится");
            return true;
        }else {
            System.out.println("не делится");
            return false;
        }
    }
}
