package com.company;

public class Zadacha_12_FindGeneralPostfix {
    public static void main(String[] args) {
        String str1 ="Hello world Java";
        String str2 ="This is very easy Java";
        System.out.println(findGeneralPostfixFromTwoStrings(str1,str2));
    }
    public static int findGeneralPostfixFromTwoStrings(String str1, String str2){
        int stringCount=0;
        for (int i = str1.length() > str2.length() ? str1.length() : str2.length(); i>0 ; i--) {
            if (str1.charAt(i)==str2.charAt(i)){
                stringCount++;
            }
        }
        return stringCount;
    }
}
