package com.company;

import java.util.Arrays;

public class StringSplit {
        public static void main(String[] args) {
            String str="Java is very easy!";
            char ch =' ';
            System.out.println("The String: "+"'"+str+"'");
            System.out.println("Amount worrds in this string is: "+wordsCountPrint(str,ch));
            System.out.print("The new array from this string is: ");
            System.out.println(Arrays.toString(stringsArr(str,ch)));
            System.out.print("The smallest string is: ");
            System.out.println(minString(stringsArr(str,ch)));

        }
    public static int wordsCountPrint(String givString, char ch){
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
    public static String[] stringsArr(String str, char ch){
            String word="";
           int countArrElements=0;
            String[] wordsArr= new String[wordsCountPrint(str,ch)];

        for (int i = 0; i < str.length(); i++) {
           if (str.charAt(i)!=ch){
               word= word+str.charAt(i);
           }else {
               wordsArr[countArrElements]=word;
               word="";
               countArrElements++;
           }
        }
        if (word.length()>0) wordsArr[countArrElements]=word;

        return  wordsArr;
    }
    public static String minString(String[] strings){
            String minString="";
        for (int i = 0; i < strings.length; i++) {
            minString=strings[i+1];
            if (strings[i].length()<=minString.length()){
                minString= strings[i];
            }else{
                return minString;
            }
        }
        return minString ;
    }
}
