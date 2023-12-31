package com.example.programs;

public class PermutationString {
    public static void main(String[] args) {

        permutationAndCombanition("","ABCD ");
    }
    private static void permutationAndCombanition(String prefix,String str){
        int n = str.length();
        if(n==0)
        {
            System.out.println(prefix+ "");
        }
        else {
            for(int i=0;i<n;i++)
            {
                permutationAndCombanition(prefix+str.charAt(i),
                        str.substring(i+1,n)+str.substring(0,i));
            }
        }
    }
}
