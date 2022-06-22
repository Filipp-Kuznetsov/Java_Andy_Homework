package com.company;

import java.util.Comparator;
import java.util.Scanner;

public class FilmCompareSortCases {


        Comparator filmChoise;

    public Comparator sortFilms(int sortChoise){
        Scanner sc= new Scanner(System.in);
        System.out.println("Which other films sorting you want to use :\n 1-By Genre ;\n 2-By Name ;\n 3-By Rating ;\n 4-By Year \n: ");
        switch (sortChoise){
            case 1:filmChoise= new FilmCompareByGenre(); break;
            case 2:filmChoise= new FilmCompareByName(); break;
            case 3:filmChoise= new FilmCompareByRating(); break;
            case 4:filmChoise= new FilmCompareByYear(); break;
            default:
                System.out.println("Please take another taste ");
                sortFilms(sc.nextInt());
        }
                return filmChoise;
    }
}
