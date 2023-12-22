package com.example.datastructure;

import java.util.Scanner;

public class DecimalToBinary {
    static String decimalToBinary(int n) {
        String b = "";
        while (n >= 1) {
            int x = n % 2;
            n = n / 2;
            b = x + b;
        }
        return b;
    }

    static int binaryToDecimal(String b) {
        int result = 0;
        int powerof2 = 1;
        for (int i = b.length() - 1; i >= 0; i--) {
            if (b.charAt(i) == '1') {
                result = result + powerof2;
            }
            powerof2 = powerof2 * 2;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String b = decimalToBinary(n);
        System.out.println(b);
        System.out.println(binaryToDecimal(b));
    }
}
