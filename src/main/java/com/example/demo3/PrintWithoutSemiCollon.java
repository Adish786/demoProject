package com.example.demo3;

//TODO Print System.out.println() without ; (semicollon)
public class PrintWithoutSemiCollon {
    public static void main(String[] args) {
        //1
        if(System.out.append("Hello Adish" +"\n")==null){
        }
        //2
        if(System.out.append("Hello Adish" +"\n").equals(null)){
        }
        //3
        if(System.out.printf("Hello Adish" +"\n").equals(null)){
        }
        //4
        if(System.out.printf("Hello Adish" +"\n")==null){
        }
    }
}
