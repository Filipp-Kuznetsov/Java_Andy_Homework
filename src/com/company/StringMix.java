package com.company;

public class StringMix {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Java";
        mixStrings(str1, str2);
    }

    public static String mixStrings(String str1, String str2) {
        String str;
        String res = "";
        if (str1.length()>str2.length()) {
            str = str1;
        }else {
            str=str2;
        }
        if (str1 != null || str2 != null && str1.isEmpty() && str2.isEmpty()) {
            for (int i = 0; i < str2.length(); i++) {
                res = res + str1.charAt(i) + str2.charAt(i);


            }
            System.out.println(res);
        }
        return res;
    }
}
