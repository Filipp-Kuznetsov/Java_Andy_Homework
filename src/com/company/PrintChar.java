package com.company;

public class PrintChar {
    public static void main(String[] args) {
        String str= "Hallo Java";
        char ch='a';
        printChar(str,ch);

    }
    public static void printChar(String str,char ch){
        for (int j = 0; j <str.length() ; j++) {
            if (str.charAt(j)==ch){
                System.out.print(ch);

            }
        }
    }
}
