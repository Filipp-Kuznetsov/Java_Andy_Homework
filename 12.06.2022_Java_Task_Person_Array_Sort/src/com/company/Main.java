package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	Person person1= new Person("Jack","Johnson",25);
	Person person2= new Person("Nick","Nack",21);
	Person person3= new Person("Boris","Britva",43);
	Person person4= new Person("Bob","Marley",56);
	Person person5= new Person("Scarlett","Johanson",37);
    Person[] people={person1,person2,person3,person4,person5};

        System.out.println(Arrays.toString(people));
        Arrays.sort(people);
        System.out.println(Arrays.toString(people));


    }
}
