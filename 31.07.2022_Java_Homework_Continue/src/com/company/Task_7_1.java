package com.company;

import java.util.ArrayList;
import java.util.List;

public class Task_7_1 {
    public static void main(String[] args) {
        /*
        7.  Есть два списка с буквами. Определить,
         является ли один список циклическойверсией другого.
        Например, для списков {a, b, c, d} и {c, d, a, b} результат будет true,
         а для {d, e, f} и {d, f, e} - false.
         */

        List<Character> list1 = new ArrayList(List.of('a', 'b', 'c', 'd'));
        List<Character> list2 = new ArrayList(List.of('c', 'd', 'a', 'b'));

        List<Character> list3 = List.of('d', 'e', 'f');
        List<Character> list4 = List.of('f', 'd', 'e');
        System.out.println("First two lists : "+listCycleControl(list1,list2));
        System.out.println();
        System.out.println("Second two lists : "+listCycleControl(list3,list4));


    }
    public static boolean listCycleControl(List<Character>list1,List<Character>list2){
        if ( list1==null || list1.isEmpty() || list2==null || list2.isEmpty() || list1.size()!=list2.size()) return false;
        List<Character>resList=new ArrayList<>();
        for (int i = 0; i < list1.size() ; i++) {
            for (int j = 0; j < list2.size() ; j++) {
                if (list2.get(0)==list1.get(i)) {
                    resList.add(list2.get((i+j) % list1.size()));
                }
            }
            if (list1.equals(resList)) return true;
        }
        return false;
    }
}
