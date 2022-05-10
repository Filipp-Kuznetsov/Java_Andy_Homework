package com.company;

import java.util.Scanner;

public class Max3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        System.out.println(max3(a,b,c));
    }
    public static int max3(int a, int b, int c){
        int temp;
        if (a>b){
            temp = a;
        }else {
            temp = b;
        } if(c>b){
            temp = c;
        }else {
            temp = b;
        }if (a>c){
            temp=a;
        }else {
            temp=c;
        }
        return temp;

    }

}
