package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task_3 {
    public static void main(String[] args) {
        /* 3.  Дан список Integer,
         каждое значение число от 1 до 12 (результат броска двух игральных костей).
          В результате работы программы, необходимо сформировать отчет,
           сколько раз выпало каждое ччисло. Вывести результат в порядке возрастания.
           {6,6,1,4,9,12,11,9,1,9} –{1->2, 4->1, 6->2, 9->3, 11->1, 12->1}
         */
        List<Integer>integerList=List.of(6,6,1,4,9,12,11,9,1,9);
        System.out.println("Unsorted arrays list: "+integerList);
        System.out.println("List integer after sorting: "+sortedList(integerList));
        System.out.print("Count of elements: ");
        integersCount(sortedList(integerList));


    }
    public static List<Integer> sortedList(List<Integer>integerList){
        List<Integer>resList=new ArrayList<>();
        ArrayList<Integer>integerArrayList= new ArrayList<>();

        integerArrayList.addAll(integerList);
        Collections.sort(integerArrayList);
        for (Integer i:integerArrayList) {
            resList.add(i);

        }
        return resList;
    }
    public static void integersCount(List<Integer>integerList){
        int count=1;
        for (int i=0;i<integerList.size()-1;i++){
            count++;
            if (integerList.get(i)!=integerList.get(i+1)){
                System.out.print(integerList.get(i)+"->"+count+"; ");
                count=1;
            }

        }
        System.out.print(integerList.get(integerList.size()-1)+"->"+count);
    }


}
