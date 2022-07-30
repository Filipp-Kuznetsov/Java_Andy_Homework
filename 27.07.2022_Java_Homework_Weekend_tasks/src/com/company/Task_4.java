package com.company;

public class Task_4 {
   /* 4.    Анагра́мма — строка, составленная путем перестановки букв исходной строки,
    например “ABB CAA“ - “BA BCAA“ -> “CBA BAA“ ……
    В задаче дано 2 строки и символов латинского алфавита и пробелов,
     нужно определить, являются ли они анаграммами.
    Если знаете, предложите несколько алгоритмов\подходов к решению данной задачи.

    */
   public static void main(String[] args) {
        String str1="ABB CAA";
        String anogramma="BA BCAA";
       System.out.println(stringControl(str1,anogramma));

   }
   public static boolean stringControl(String str,String anogramma){
       if (str.length()!=anogramma.length() && !str.isEmpty() && !str.equals(anogramma)) return false;
       return true;
   }

}
