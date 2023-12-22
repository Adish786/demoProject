package com.example.test;

public class PalindromeProgram {
    public static void main(String[] args) {
        String input = "radar";
        if(isPalindrome(input)){
            System.out.println(input+  "is a Palindrome");

        }
        else {
            System.out.println(input+  "is not a Palindrome");

        }
    }
    private static boolean isPalindrome(String str){
        str = str.toLowerCase();
        int start =0;
        int end = str.length()-1;
        while (start<end){
            if(str.charAt(start)!=str.charAt(end)){
                return false;

            }
            start++;
            end--;
        }
        return true;
    }
}
