package com.company;

public class Zadacha_17_index_MinElement {
    public static void main(String[] args) {
        int [] arr={1,3,5,7,-5,9,-1};
       minElement(arr);
    }
    public static void minElement(int[] arr){
        int minIndex=0;
        for (int i = 0; i < arr.length-1 ; i++) {
            if (minIndex>arr[i]){
                minIndex=i;
            }
        }
        System.out.println(minIndex);
    }
}
