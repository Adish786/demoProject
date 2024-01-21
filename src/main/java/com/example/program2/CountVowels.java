package com.example.program2;

import java.util.Arrays;
import java.util.List;

public class CountVowels {
    public static void main(String[] args) {
        String s = "Adish Ansari";
       // char[] c = s.toCharArray();
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
                count++;
        }
       // System.out.println("Vowels: " + count);
        //Second ways
        List<String> vowels = Arrays.asList("a", "e", "i", "o", "u");
        long count1 = Arrays.stream(s.split("")).filter(vowels::contains).count();
        // System.out.println(count1);
        String s2 = "ab12pq34";
        char[] s2CharArray = s2.toCharArray();
        int sum =0;
        for(char c : s2CharArray){
            if(Character.isDigit(c)){
                System.out.println( sum = sum+Character.getNumericValue(c));

            }
        }
    }
}
