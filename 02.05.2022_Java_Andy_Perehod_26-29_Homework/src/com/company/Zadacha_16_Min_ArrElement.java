package com.company;

public class Zadacha_16_Min_ArrElement {
    public static void main(String[] args) {
        int [] arr={1,3,5,7,-5,9,-1};
        System.out.println(minElement(arr));
    }
    public static int minElement(int[] arr){
        int min=arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if (min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }
}
