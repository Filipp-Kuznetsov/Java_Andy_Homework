package com.company;

public class Names_And_YearsOfBirth {
    public static void main(String[] args) {
        String[] names={"Olga","Oleg","Svetlana","Oleg"};
        int[ ] yearsOfBirthday={2004,1982,2008,2010};
        System.out.println("They are people, they older 15 years:");
        arrProyessing(names,yearsOfBirthday);
        System.out.println();
        System.out.println("The oldest person is: ");
        olderPerson(names,yearsOfBirthday);
    }
    public static void arrProyessing(String[] nameStrings, int[]yearOfBirth){
        int yearNow=2022;
        int tempYear;

        for (int i = 0; i < yearOfBirth.length-1 ; i++) {
            tempYear=yearNow-yearOfBirth[i];
           if (yearNow-yearOfBirth[i]>15){
               System.out.println(nameStrings[i]+'\t'+yearOfBirth[i]+'\t'+tempYear+"years");
           }
        }


    }
    public static void olderPerson(String[] strings,int[]years){

        for (int i = 0; i < years.length-1 ; i++) {
            int oldTemp=2022-years[i];
            int oldestPerson=years[0];
            if (years[i]<oldestPerson){
                oldestPerson=years[i];
                System.out.println(strings[i]+'\t'+oldestPerson+'\t'+oldTemp);
            }
        }

    }
    
}
    /*Given arrays String[] names and int[ ] yearsOfBirthday of the same length,
    that contains names and years of birthday of the persons.
     Every element in yearsOfBirthday is corresponding with element at the same index in names.
      Implement the program that prints the name and the age of all person who older that given int.
       Than print the name and age of oldest person.
        For example: ({“Olga”,”Oleg”,”Svetlana”,”Oleg”} , {2004,1982,2008,2010},15) ->
        Olga 18 years
        Oleg 40 years
        
     */