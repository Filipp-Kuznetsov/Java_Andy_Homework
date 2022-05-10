package com.company;

public class Zadacha_20_charArrays {
    public static void main(String[] args) {
        char [] arr1={'c','d','a','e','f'};
        char [] arr2={'h','d','a','o','f'};
        checkChar(arr1,arr2);
    }
    public static void checkChar(char[] chars1,char[] chars2){
        char ch = 0;
        for (int i = 0; i <chars1.length ; i++) {
            if (chars1[i]==chars2[i] ){
                ch=chars1[i];
                System.out.print(ch);
            }
        }

    }
}
