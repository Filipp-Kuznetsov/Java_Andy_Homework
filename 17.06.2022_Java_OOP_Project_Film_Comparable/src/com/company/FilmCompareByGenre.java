package com.company;

import java.util.Comparator;

public class FilmCompareByGenre  implements Comparator<Film>,FilmCompare {


    @Override
    public int compare(Film o1, Film o2) {
        return o1.getGenre().compareTo(o2.getGenre());
    }
}
