package com.example.demo3;

//TODO What will be the output when you use a Long number with L and without L suffix ?
public class LNumberWithoutL {
    public static void main(String[] args) {
        long longNumberWithoutL = 1000*60*60*24*365;
        long longNumberWithL = 1000*60*60*24*365L;
        System.out.println(longNumberWithoutL);//1471228928
        //31536000000  -- 36 bits
        System.out.println(longNumberWithL); //31536000000


    }
}
