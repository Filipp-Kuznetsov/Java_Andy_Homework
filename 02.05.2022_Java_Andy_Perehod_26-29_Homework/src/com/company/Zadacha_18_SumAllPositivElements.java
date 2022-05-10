package com.company;

public class Zadacha_18_SumAllPositivElements {
    public static void main(String[] args) {
        int [] arr={1,3,5,7,-7,-9};
        System.out.println(sumAllPositElements(arr));
    }
    public static int sumAllPositElements(int [] arr){
        int sum=0;
        for (int i = 0; i <arr.length-1 ; i++) {
            if (arr[i] > 0){
                sum+=arr[i];
            }
        }
        return sum;
    }
}
