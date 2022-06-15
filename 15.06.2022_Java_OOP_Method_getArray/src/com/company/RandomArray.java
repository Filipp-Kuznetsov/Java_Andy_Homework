package com.company;

import java.util.Scanner;

public class RandomArray implements GetArray{
    @Override
    public int[] getArray() {

        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter number of array length, number of max and min element:  ");
        int length= sc.nextInt();
        int  min=sc.nextInt();
        int max=sc.nextInt();
        int[] arr= new int[length];
        for (int i = 0; i < length; i++) {
            arr[i]=(int)(Math.random()*(max-min+1)+min);
        }
        return arr;
    }


}
