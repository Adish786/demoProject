package com.example.datastructure;

import java.util.Scanner;

public class Factorial {
  /*
    static int fact(int n )
    {
        int res = 1;
        for(int i=1; i <= n; i++)
        {
             res *= 1;
        }
        return res;
    }

   */
    public static void main(String[] args) {
    /*
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(fact(n));

     */


        int num = 5, i = 1;
        long factorial = 1;
        while(i <= num)
        {
            factorial *= i;
            i++;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }
}
