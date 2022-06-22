package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Film film1= new Film("Titanik","drama",1999,4);
        Film film2= new Film("Lord of the rings","Fantasy",2003,7);
        Film film3= new Film("Terminator","Actionfilm",1989,5);
        Film film4= new Film("Friends","Comedy",2005,4);
        Film film5= new Film("Harold and Humar","Comedy",2007,3);
        Film film6= new Film("The rock","Actionfilm",1987,6);

        List<Film>filmArrayList= new ArrayList<>();
        filmArrayList.add(film1);
        filmArrayList.add(film2);
        filmArrayList.add(film3);
        filmArrayList.add(film4);
        filmArrayList.add(film5);
        filmArrayList.add(film6);



        Scanner sc = new Scanner(System.in);

        FilmCompareSortCases  newSortFilms = new FilmCompareSortCases ();

        Collections.sort(filmArrayList, newSortFilms.sortFilms(sc.nextInt()));



    }




}
