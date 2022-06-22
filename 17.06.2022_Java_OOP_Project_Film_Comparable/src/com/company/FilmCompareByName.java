package com.company;

import java.util.Comparator;

public class FilmCompareByName  implements Comparator<Film>,FilmCompare {


    @Override
    public int compare(Film o1, Film o2) {
        return o1.getName().compareTo(o2.getName());
    }


}
