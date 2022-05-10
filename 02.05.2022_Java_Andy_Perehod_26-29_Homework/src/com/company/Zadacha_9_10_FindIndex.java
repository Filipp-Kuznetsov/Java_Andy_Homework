package com.company;

public class Zadacha_9_10_FindIndex {
    public static void main(String[] args) {
        String str="hello";
        char ch='l';
        System.out.println(findFirstCharIndex(str,ch));
        System.out.println(findLastCharIndex(str,ch));
        }
    public static int findFirstCharIndex(String str, char ch){
        if (str==null) return -1;
        else {
        int temp = 0;
        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i)==ch){
                temp= i;
                break;
            }
        }
        return temp;
        }
    }
    public static int findLastCharIndex(String str, char ch){
        if (str==null) return -1;
        else {
            int temp = 0;
            for (int i = 0; i <str.length() ; i++) {
                if (str.charAt(i)==ch){
                    temp= i;

                }
            }
            return temp;
        }
    }

}
