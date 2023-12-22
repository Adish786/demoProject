package com.example.SOLID.SingleResponsibility;

/*
TODO
 A class should have one and only one reason to change ,
 meaning that a class should have only one job
  */
public class Book {
    private String bookName;
    private String author;
    private String text;
    //Duty related to Book property
    public boolean findByAuthor(String authName)
    {
        return author.contains(authName);
    }
    public boolean findByName(String  bookName)
    {
        return bookName.contains(bookName);
    }

    //Printin it on Console  waliting the rule so we need create new class
    void printTextToConsole(){}

    class BookPrinter{
    //methods for outputting text
        void printTextToConsole(String text){
    }

    //Share text to other medium like logger , Email
    void shareTextToOtherMedium(String text){

    }
    }


}
