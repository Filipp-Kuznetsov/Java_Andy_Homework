package com.company;

import java.util.ArrayList;
import java.util.List;

public class StringList {
    public static void main(String[] args) {
        List<String> stringList= new ArrayList<>();
        stringList.add("Ann");
        stringList.add("Nick");
        stringList.add("Petr");
        stringList.add("Eva");
        stringList.add("Konstantin");
        stringList.add("Jim");

        for (int i = 0; i < stringList.size() ; i++) {
            if (stringList.get(i).length()<=3) System.out.println(stringList.get(i));
        }
    }
}
