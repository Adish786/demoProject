package com.example.programs;

public class ReverseString {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(reverseString(str));
    }

    public static String reverseString(String str) {
        char ch[] = str.toCharArray();
        String rev = "";
        for (int i = ch.length - 1; i >= 0; i--) {
            rev += ch[i];
        }
        return rev;
    }
}
