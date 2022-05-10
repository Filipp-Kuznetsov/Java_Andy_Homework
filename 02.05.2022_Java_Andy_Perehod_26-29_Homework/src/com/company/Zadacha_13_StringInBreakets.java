package com.company;

public class Zadacha_13_StringInBreakets {
    public static void main(String[] args) {
        String str= "Hello";
        strInBreakets(str);
    }
    public static void strInBreakets(String str){
        for (int i = 0; i <str.length() ; i++) {
            System.out.print("[");
            System.out.print(str.charAt(i));
            System.out.print("]");
        }
    }
}
