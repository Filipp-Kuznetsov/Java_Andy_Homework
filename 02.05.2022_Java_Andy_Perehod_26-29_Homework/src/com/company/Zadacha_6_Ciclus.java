package com.company;

import java.util.Arrays;

public class Zadacha_6_Ciclus {
    public static void main(String[] args) {
        int[] arr = new int[100];
        checkArr(arr);
    }

    public static void checkArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            if (arr[i] % 4 != 0) {
                System.out.print(arr[i]+" ");
            }
        }


    }
}
