package com.company;

public class Book  extends Autor {

    private String title;


    public Book(String firstName, String lastName, String title) {
        super(firstName, lastName);
        this.title = title;

    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +"Autor:  "+getFirstName()+" "+getLastName()
                +'}'+System.lineSeparator();
    }
}
