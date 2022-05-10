package com.company;

public class Zadacha_11_FindGeneralPrefix {
    public static void main(String[] args) {
        String str1 ="Hello";
        String str2 ="Hello java";
        System.out.println(findGeneralPrefixFromTwoStrings(str1,str2));
    }
    public static int findGeneralPrefixFromTwoStrings(String str1, String str2){
        int stringCount=0;
        for (int i = 0; i<str1.length() ; i++) {
            if (str1.charAt(i)==str2.charAt(i)){
                stringCount++;
            }
        }
        return stringCount;
    }
}
