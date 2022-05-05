package com.company;

public class WordsCount {
    public static void main(String[] args) {
        String str="This is a new task for me";
        System.out.println(str);

        System.out.println("The count from string is: "+wordsCountPrint(str));
    }
    public static int wordsCountPrint(String givString){
        int wordsCount;
        if (givString!="") {
            wordsCount = 1;
        }else wordsCount=0;
        for (int i = 0; i <givString.length() ; i++) {
            if (givString.charAt(i)==' '){
                wordsCount++;
            }
        }
        return wordsCount;
    }
}
