package com.company;

import java.util.Scanner;

public class IsEven_PrintCheckResultMessage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        boolean result;
        isEven(a);
        printCheckResultMassage(a,true);
    }
    public static boolean isEven(int number){
        if (number %2 ==0) {
            return true;
        }else {
            return false;
        }
    }
    public static void printCheckResultMassage(int number, boolean result){

            if (number %2 == 0) {
                result = isEven(number);
                System.out.println(number+" это чётное число");
            }else {
                result= isEven(number);
                System.out.println(number+" это не чётное число");
            }
    }

}
