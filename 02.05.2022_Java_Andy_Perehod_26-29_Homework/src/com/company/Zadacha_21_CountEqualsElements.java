package com.company;

public class Zadacha_21_CountEqualsElements {
    public static void main(String[] args) {
        int [] arr1= {0,1,2,3,4};
        int [] arr2= {-3,1,2,-3,4};
        System.out.println(countElements(arr1, arr2));
    }
    public static int[] findBigestArray(int []arr1, int [] arr2){
        if (arr1.length> arr2.length) return arr1;
        else return arr2;
    }
    public static int countElements(int [] arr1 , int [] arr2){
        int equalsElementsCount=0;
        for (int i = 0; i <(findBigestArray(arr1,arr2)).length ; i++) {
           if (arr1[i]==arr2[i]){
               equalsElementsCount++;
           }
        }
        return equalsElementsCount;
    }
}
