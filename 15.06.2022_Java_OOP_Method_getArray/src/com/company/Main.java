package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*Представьте, что в нашей программе мы обрабатываем массив (например,
	 массив целых чисел или массив Employee, если хотите).
	В рабочей среде мы считываем этот массив из User (используйте Сканер),
	 в тестовой среде получаем его как случайный массив или используем массив,
	  определенный в коде. Итак, вам нужно реализовать метод getArray() witch,
	   так как аргумент принимает путь, как будет создан массив и в результате возвращает массив.
	    Реализация этой программы (подсказка: используйте знания об интерфейсе)
	 */
        Scanner sc=new Scanner(System.in);
        ArrayChoice arrayChoice=new ArrayChoice();
        System.out.println("Please choose the number of the array variant: 1 or 2   ");
        System.out.println(Arrays.toString(arrayChoice.getArray(sc.nextInt())));
    }
}
