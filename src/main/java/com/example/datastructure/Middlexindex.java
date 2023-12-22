package com.example.datastructure;
/*TODO Find out middle index where sum of both ends are equal*/

public class Middlexindex {
    public static void main(String[] args) {
        int sum=0;
        int[] myArray={1,2,3,3,2,1};
        for(int i=0; i<myArray.length; i++)
        {
            sum=sum+myArray[i];
        }
        System.out.println(sum);
        System.out.println(sum/2);
    }
}
