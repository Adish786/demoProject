package com.example.demo3;
//TODO  Output number from 1...100 without using any numbers in your code
public class PrintOneToHundred {
    public static void main(String[] args) {
        int one = 'A'/'A';  // print will 1
        String s1 = "..........";
        for(int i=one;i<=(s1.length() *s1.length());i++){
            System.out.println(i);
        }
    //Second Ways
        // a=97,b=98,c=98,d=100
        for(int i =one;i<='d';i+=one){
            System.out.println(i);
        }
    }

}
