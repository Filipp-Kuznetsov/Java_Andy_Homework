package com.company;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Task_6 {
    /*
    6.  Дана  map <Character, Set<String>> где значение – список строк начинающихся на букву,
     которая является ключом.
     Увы, исходный map содержи ошибки.
     Несколько строк записаны в неправильные ключи.
      Написать метод, который скорректирует map.
     */
    public static void main(String[] args) {
        Map<Character, Set<String>>map=new HashMap<>();
        map.put('A',Set.of("Arbeit"));
        map.put('B',Set.of("Bubble"));
        map.put('C',Set.of("Clone"));
        map.put('D',Set.of("Dron"));
        map.put('E',Set.of("Economik"));
        map.put('m',Set.of("goal"));
        map.put('k',Set.of("kit"));
        System.out.println("Map before adjustment: "+map);
        System.out.println("Map after adjustment: "+mapControl(map));


    }
    public static Map<Character,Set<String>>mapControl(Map<Character,Set<String>> map){
        Map<Character,Set<String>>resMap=new HashMap<>();
        for (Map.Entry <Character,Set<String>>entry: map.entrySet()) {
            Set<String> setStr = entry.getValue();
            Iterator <String> iterator=setStr.iterator();
            for (int i = 0; i <entry.getValue().size() ; i++) {
                String str = iterator.next();
                resMap.put(str.charAt(0),entry.getValue());
            }
        }
        return resMap;
    }
}
