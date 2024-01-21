package com.example.program2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ArrayMultiplication {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5};
        List<Integer> integerList = Arrays.asList(arr);
      Optional<Integer> stream=  integerList.stream().reduce((a, b)->a*b);

      if(stream.isPresent()){
          System.out.println("Arrays Multiplication are !"  +stream);
      }
      else{
          System.out.println("Arrays List are Empty !");
      }
      Integer forEachOutput = 1;
if(integerList.size()>0)
{
    for(Integer num : integerList){
        forEachOutput*=num;
    }
    System.out.println("Arrays Multiplication are !" +forEachOutput);
}
else{
    System.out.println("Arrays List are Empty !");
}
}

}
