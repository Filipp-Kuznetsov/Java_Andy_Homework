package com.company;

import java.util.Comparator;

public class FilmCompareByRating  implements Comparator<Film>,FilmCompare {

    @Override
    public int compare(Film o1, Film o2) {
        return (int) ((o1.getRating()-o2.getRating()));
    }
}
