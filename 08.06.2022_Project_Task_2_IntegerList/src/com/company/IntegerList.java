package com.company;

import java.util.ArrayList;
import java.util.List;

public class IntegerList {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        for (int i = integerList.size()-1; i >=0 ; i--) {
            System.out.print(integerList.get(i)+"\t");
        }
    }
}
