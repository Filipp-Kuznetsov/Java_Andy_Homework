package com.company;

import java.util.Comparator;

public class FilmCompareByYear implements Comparator<Film>,FilmCompare {
    @Override
    public int compare(Film o1, Film o2) {
        return o1.getYear()-o2.getYear();
    }
}
