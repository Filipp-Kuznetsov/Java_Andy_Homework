package com.company;

import java.util.HashMap;
import java.util.Map;

public class Task_5 {
    public static void main(String[] args) {
        /*
        5.  Дана  map <Character, Integer>. Необходимо сформировать случайную строку,
         где соответствующая буква будет встречаться заданное количество  раз.
        {A->2, b->1, k->2, c->3, ‘ ‘->2 } -> “ck cca k”
         */
        Map<Character,Integer> map=new HashMap<>();
        map.put('A',2);
        map.put('b',1);
        map.put('k',2);
        map.put('c',3);
        map.put(' ',2);
        System.out.println(mapToString(map));
        formatToString(map);
    }
    public static String mapToString(Map<Character,Integer>map){
        String res="";
        if (!map.isEmpty() && map!=null) res=map.toString();


        return res;
    }
    public static void formatToString(Map<Character,Integer> symbolMap){
        /*
        сразу говорю здесь в этом методе мне посказали как сделать, но я потом сидел и разбирался сам
         */
        StringBuffer str = new StringBuffer();
        for (Map.Entry<Character, Integer> entry : symbolMap.entrySet()) {
            for (int i = 0; i < entry.getValue(); i++) {
                str.append(entry.getKey());
            }
        }
        System.out.println(str);
    }
}
