package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	/*

	Task1
	Дана Map<String, String>, если в ней есть ключ ‘a’ и ‘b’,
	 то нужно  создать новый ключ ‘ab’ с суммой значений от ключей a и b.
    Примеры:
    mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b":"There"}
    mapAB({"a": "Hi"}) → {"a": "Hi"}
    mapAB({"b": "There"}) → {"b": "There"}



    Task2

    2)     Дан список Book{String author, String title}.
    Необходимо сформировать map<String, List<String>> ,
    где ключом будет автор, а
    значением - список книг данного автора.

	 */

        Map<String,String>stringMap=new HashMap<>();
        stringMap.put("c","Jack");
        stringMap.put("a","Hi");
        stringMap.put("v","john");
        stringMap.put("b","Jess");
        stringMap.put("d","Nick");
        map(stringMap);
        System.out.println(stringMap);

        addSummarValue(stringMap,List.of("a","b","c"));
        System.out.println(stringMap);
        System.out.println("++++++++++++++++++++++++jetzt Book++++++++++++++++++++");

       List<Book>bookList=List.of(
               new Book("Jack London","White Fang"),
               new Book("Булгаков","Мастер и Маргарита"),
               new Book("Булгаков","Собачье сердце"),
               new Book("Толстой","Война и мир")
               );

        System.out.println(mapTitleToAuthor(bookList));
        System.out.println("++++++++++++++");
        Map<String,List<String>>map=mapTitleToAuthor(bookList);
        map.get("Булгаков").add("Дубровский");
        System.out.println(map);



    }
    //метод относящийся ко второй задаче(задаче про Бук)
    public static  Map<String,List<String>> mapTitleToAuthor(List<Book>bookList){
        Map<String,List<String>>result=new HashMap<>();
        if (bookList!=null && !bookList.isEmpty()){
            for (Book book:bookList) {
                List<String>value= result.get(book.getAuthor());// лист книг автор или null
                if (value==null) value=new ArrayList<>();
                value.add(book.getTitle());
                result.put(book.getAuthor(), value);
            }

        }
        return result;
    }
    public  static void map(Map<String,String> map){
        if (map!=null && !map.isEmpty() && map.containsKey("a") && map.containsKey("b")) {
            map.put("ab", map.get("a") + map.get("b"));
        }

    }
    public static void addSummarValue(Map<String,String>map , List<String>keys){
        if (map!=null && !map.isEmpty() && map.keySet().contains(keys)){
            String resValue="";
            String resKey="";
            for (String keyStr:keys) {
                resKey+=keyStr;
                resValue+=map.get(keyStr);
            }
            map.put(resKey,resValue);
        }
    }


}
class Book{
    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Book: " + "author: " + author + ", title: " + title ;
    }
}