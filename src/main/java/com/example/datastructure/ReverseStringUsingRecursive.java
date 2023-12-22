package com.example.datastructure;

import java.util.Scanner;

/* TODO Write a Program to reverse a string using recursive algorithm */
public class ReverseStringUsingRecursive {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = sc.nextLine();
        String rev=reverseString(str);
        System.out.println("The reverse of the entered the String :"+rev);

    }
    //Recursive Function to Reverse the String
    public static String reverseString(String str)
    {
        if (str.isEmpty())
            return str;
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}
