package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
/*
            1.Дан лист Вook{String title, Author author}.
             Естественно,один автор Author{firstName, lastName} может быть автором нескольких книг.
         Необходимо получить список всех авторов.
            2.Дан список User<name, email>, необходимо написать метод, который определит, есть ли в списке дубли.
            3.Дано несколько списков User-ов{fFame, lName, email},
          необходимо написать метод, который подготовит список всех email-ов для рассылки.
 */
    public static void main(String[] args) {
        List<Book>bookList=new ArrayList<>();
        bookList.add(new Book("Jack","London","White fang"));
        bookList.add(new Book("Jack","London","Сall of the ancestors"));
        bookList.add(new Book("Theoder","Dreiser","Finansist"));
        bookList.add(new Book("Adolf","Hitler","Mein Kampf"));
        bookList.add(new Book("Noi-Juval ","Harari","Sapiens"));
        bookList.add(new Book("Otto ","von Bismark","Autobiography"));
        printAuthors(bookList);


        System.out.println("------------------now Users thema--------------------------");

        User user1=new User("Addy","Addy@gmail.com");
        User user2=new User("Jack","Jack@gmail.com");
        User user3=new User("John","John@gmail.com");
        User user4=new User("John","Jon@gmail.com");
        User user5=new User("Addy","Addy@gmail.com");
        User user6=new User("Jannet","Jannet@gmail.com");
        User user7=new User("Silvia","Silvia@mail.ru");


        List<User>userList=new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        userList.add(user5);
        userList.add(user6);
        userList.add(user7);

        System.out.println("The dubble users are: "+ printDubblesFromUsers(userList));


    }
    public static void  printAuthors (List<Book>bookList){
        Set<String> bookSet=new HashSet<>();

        for (int i = 0; i < bookList.size(); i++) {
            bookSet.add(System.lineSeparator()+bookList.get(i).getFirstName()+" "+bookList.get(i).getLastName());
        }
        System.out.println("There authors are: "+bookSet);
    }

    public static int printDubblesFromUsers(List<User>userList){
        int count=0;
        for (int i = 0; i <userList.size() ; i++) {
            for (int j = i+1; j <userList.size() ; j++) {
                if (userList.get(i).getName()==userList.get(j).getName()
                        && userList.get(i).getEmail()==userList.get(j).getEmail()){
                    System.out.println(userList.get(j));
                    count++;
                }
            }
        }
        return count;
    }




}
