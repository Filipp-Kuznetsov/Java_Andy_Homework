package com.company;

import com.company.GetArray;


import java.util.Scanner;

public class UserArray implements GetArray {

    @Override
    public int[] getArray() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter number of array length:  ");
        int[] arr= new int[sc.nextInt()];
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=i;
        }
        return arr;
    }
}
