package com.company;

import java.util.Scanner;

public class zadacha_7_Int_Sart_Int_Finish {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int start= scanner.nextInt();
        int finish= scanner.nextInt();
        System.out.println(sum(start,finish));
    }

    public static int sum(int a, int b){
        if (a>b || a+b==0) {
            return 0;

        }else {
            int sum = 0;
            int arrTemp;
            arrTemp=  b-a;
            int []arr= new int[arrTemp+1];
            for (int i = 0; i <arr.length ; i++) {
           arr[i]=a;
           sum+=arr[i];
            }
        sum+=b;
        return sum;
        }
    }
    }

