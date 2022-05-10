package com.company;

public class Zadacha_14_SubString {
    public static void main(String[] args) {
        String str="Hello Java world";
        int start=6;
        int finish=11;

        System.out.println(subString(str,start,finish));
    }
    public static String subString(String str, int start, int finish){
        StringBuilder sb = new StringBuilder("");
        String res="a";
        for (int i = 0; i <str.length() ; i++) {
         if (i>=start) {
             sb.append((str.charAt(i)));
             res= sb.toString();

         }
         if (i==finish) break;
        }

        return  res;
    }
}
