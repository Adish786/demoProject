package com.example.programs;

public class ReplaceArrayElements {
    public static void main(String[] args) {
        int arr[] = {8,9,5,11,6,1,7,6};
        //output = 11,11,11,-1,7,7,-1,-1
        int size =arr.length;
       /*
        int maxFromRight = arr[size-1];
        arr[size-1]=-1;
        for(int i =size-2;i>=0;i--)
        {
            int temp =arr[i];
            if(maxFromRight>arr[i])
            {
                arr[i]=maxFromRight;
            }
            else {
                arr[i]=-1;
            }
            if(maxFromRight<temp)
            {
                maxFromRight=temp;
            }
        }
        for(int i =0;i<size;i++){
            System.out.println(arr[i]);
        }
        */
        //approch 2
        int temp1 = -1;
        for(int i =0;i<size;i++)
        {
            temp1=-1;
            for(int j =i;j<size;j++)
            {
                if(temp1<arr[j]&&arr[j]>arr[i])
                {
                    temp1=arr[j];
                }
            }
            arr[i]=temp1;
        }
        for(int i=0;i<size;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
