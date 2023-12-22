package com.example.programs;

public class PalidromString {
    public static void main(String[] args) {
        String str = "Radar", reverseStr = "";
        int strLength = str.length();
        for (int i = (strLength - 1); i >= 0; --i) {
            reverseStr = reverseStr + str.charAt(i);
        }
        if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
            System.out.println(str + " is a Palindrome String.");
        } else {
            System.out.println(str + " is not a Palindrome String.");
        }
        System.out.println("Is Palidrom String :" +isPalidromString("Adish"));
    }
    public static boolean isPalidromString(String orignalString) {
        String revrseString = "";
        for (int i = revrseString.length() - 1; i >= 0; i--)
            revrseString = revrseString + orignalString.charAt(i);
            return orignalString.equals(revrseString);

    }
}
