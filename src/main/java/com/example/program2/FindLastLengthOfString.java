package com.example.program2;

//TODO given String are available to find lastIndexOf the String
public class FindLastLengthOfString {
    public static void main(String[] args) {
        String str = "Today is java intervew";
        String lastIndexofString = str.substring(str.lastIndexOf(" ")+1);
    System.out.println(lastIndexofString);
    }
}
