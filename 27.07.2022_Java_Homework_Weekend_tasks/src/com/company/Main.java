package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    /*1.    Дан отсортированный лист Integer.
     Необходимо удалить из него все дубликаты.
    {6,6,8,9,14,15,15,15,20} -> {6,8,9,14,15,20}
    */

    public static void main(String[] args) {
        List<Integer>integerList=List.of(6,6,8,9,14,15,15,15,20);
        System.out.println("Integer list::"+integerList);
        System.out.println();
        System.out.println("Original Integer List: "+originalList(integerList));
    }
    public static List<Integer>originalList(List<Integer>integerList){
        List<Integer>res=new ArrayList<>();
        Set<Integer>integerSet=new TreeSet<>(integerList);
        for (Integer i:integerList) {
            integerSet.add(i);
        }
        for (Integer a:integerSet) {
            res.add(a);
        }
        return res;
    }
}
