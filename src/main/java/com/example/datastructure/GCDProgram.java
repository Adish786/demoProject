package com.example.datastructure;

import java.util.Scanner;

//TODO Gretast comman factor or Higest Comman factor
public class GCDProgram {
    //TODO Time Complexity O(o) notation   (Brute Force Approach)
    /*
    static int gcd(int a, int b) {
        int min = 0;
        if (a < b) {
            min = a;
        } else {
            min = b;
        }
        for (int i = min; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return 1;
    }

     */
    //TODO Time Complexity O(o) notation  (Euclid's Approach)
    /*
    static int euclidGcd(int a,int b){
      while (a!=b){
          if(a>b){
              a= a-b;
          }
          else {
              b= b-a;
          }
      }
      return a;
    }
     */
    //TODO Time Complexity O(log(min(a,b))) notation  (Optimised Euclid's Approach)
    static int min(int a,int b){
        while (a!=0 &&b!=0){
            if(a>b){
                a= a%b;
            }
            else {
                b= b%a;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
       // System.out.println(gcd(a, b));
        System.out.println(min(a,b));

    }
}
