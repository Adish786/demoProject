package com.example.demo3;

import java.util.stream.IntStream;

//TODO print 1 to 100 wihtout using any loop 1:- recursive function 2:- Java streams
public class PrintNumberWithoutLoop {
    public static void main(String[] args) {
        printNumber(1);
        printNumberFunction(1,100);
        IntStream.range(1,100).forEach(e->System.out.println(e));
    }

    //recursive function
    public static void printNumber(int num){
        if(num<=100){
            System.out.println(num);
            num++;
            printNumber(num);
        }
    }
    public static void printNumberFunction(int sNum,int endNumb){
        if(sNum<=endNumb){
            System.out.println(sNum);
            sNum++;
            printNumberFunction(sNum,endNumb);
        }
    }
}
