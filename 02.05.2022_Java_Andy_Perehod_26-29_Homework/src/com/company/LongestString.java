package com.company;

import java.util.Locale;
import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {
        String str1="h";
        String str2="he";
        String str3="hel";
        System.out.println(longestString(str1, str2,str3));
    }
    public static String longestString(String str1,String str2,String str3){
        String bigestString;
        if (str1.length()>str2.length()){
            bigestString=str1;
        }else {
            bigestString=str2;
        }
        if (str2.length()>str3.length()){
            bigestString=str2;
        }else {
            bigestString= str3;
        }if (str1.length()>str3.length()){
            bigestString=str1;
        }else {
            bigestString=str3;
        }




       return bigestString;
    }
}
