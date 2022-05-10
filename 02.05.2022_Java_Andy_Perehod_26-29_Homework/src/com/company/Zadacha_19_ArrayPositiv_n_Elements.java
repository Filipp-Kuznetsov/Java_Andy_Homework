package com.company;

import java.util.Arrays;

public class Zadacha_19_ArrayPositiv_n_Elements {
    public static void main(String[] args) {
        int n =4;
        int start =21;
        System.out.println(arrayNElements(n,start));
    }
    public static int [] arrayNElements(int volume, int start){
        int []arr = new int[2*volume];
       int [] arrResult= new int[volume];
        for (int i = start; i <arr.length; i++) {
            arr[i]=i;
            if (arr[i] %2 ==0) {
                arr[i]=arrResult[i];
            }
        }

        return arrResult;
    }
}
