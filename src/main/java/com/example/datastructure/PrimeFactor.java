package com.example.datastructure;

import java.util.Scanner;

public class PrimeFactor {

    static void primeFactor(int n)
    {
        int i=2;
        while (i*i<=n)
        {
            while (n%i == 0)
            {
                System.out.println(i);
                n = n/i;
            }
            i++;
        }
        if(n>i)
        {
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        primeFactor(n);
    }


}
