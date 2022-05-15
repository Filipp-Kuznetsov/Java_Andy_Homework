package com.company;

public class Zadacha_22_Chislo_Long {
    public static void main(String[] args) {
        System.out.println(returnLongElementFromArr(new int[]{1,3,5,7}));
        System.out.println(returnLongElementFromArr1(new int[]{1,3,5,7}));


    }
    public static long returnLongElementFromArr1(int[] arr){
        long element=0;
        int arrLength= arr.length-1;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]> 0 && arr[i]<9) {
                element += arr[i] * Math.pow(10, arrLength);
                arrLength--;

            }else
            System.out.println("Whrong array elements");
        }
        return element;
    }



    public static long returnLongElementFromArr (int[] arr) {
        int i = arr.length -1;
        long result =0;
        int mathPow = 0;
        if (arr[i] >=0 && arr[i] <=9) {
            while (i >= 0) {
                result = result + ((long) arr[i] * (int) Math.pow(10, mathPow));
                mathPow++;
                i--;
            }
        } else {
            System.out.println("Wrong array for this method!");

        }

        return result;
    }
}
