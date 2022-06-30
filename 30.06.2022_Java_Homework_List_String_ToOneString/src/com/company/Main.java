package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {
    /*  1. Дан List<String>. Написать метод, который возвращает строку,
     которая есть результат объединения всех
     строк исходного листа через пробел.
     Например: {“I”, “do”, “my”, ”homework”} -> “I do my homework”.


        2.Дан List<String>. Написать метод, который возвращает строку,
     которая есть результат объединения всех строк исходного листа через пробел,
     при этом, все слова, короче 4 символов должны идти вначале строки,
     остальные слова должны сохранить свой порядок.
     Например: {“The”, “homework”, “is”, ”not”, “done”, “yet”} -> “The is not yet homework done”.
     */


    public static void main(String[] args) {

        String str1="I";
        String str2="do";
        String str3="my";
        String str4="homework";
        List<String> stringList1=new ArrayList<>();
        stringList1.add(str1);
        stringList1.add(str2);
        stringList1.add(str3);
        stringList1.add(str4);
        System.out.println(listToString(stringList1));

        System.out.println("+++++++++++++++++++++with anothe order+++++++++++++");

        List<String>stringList2=new ArrayList<>();

        stringList2.add(new String("i"));
        stringList2.add(new String("homework"));
        stringList2.add(new String("always"));
        stringList2.add(new String("do"));
        stringList2.add(new String("my"));
        System.out.println(strFromListWithAnotherOrder(stringList2));

    }
    public static String listToString(List<String>stringList){
        String res="";
        for (int i = 0; i < stringList.size() ; i++) {

            res += stringList.get(i)+" ";
        }
        return res;
    }
    public static String strFromListWithAnotherOrder(List<String>stringList){
        String res="";
        String anotherOrderRes="";
        for (int i = 0; i < stringList.size() ; i++) {
            if (stringList.get(i).length()<4) anotherOrderRes+=stringList.get(i)+" ";
            else res+=stringList.get(i)+" ";
        }
        return anotherOrderRes+res;
    }
}
