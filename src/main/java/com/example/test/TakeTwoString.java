package com.example.test;

import org.springframework.util.StringUtils;

public class TakeTwoString {
    public static void main(String[] args) {
        String str = "magazine";
        String findStr = "note";
        int lastIndex= 0;
        int count =0;
        while (lastIndex!=-1){
            lastIndex=str.indexOf(findStr,lastIndex);
            if(lastIndex!=-1){
                count++;
                lastIndex+=findStr.length();
            }
        }
        System.out.println(count);
        //Second Ways
        System.out.println(StringUtils.countOccurrencesOf(str,findStr));
    }
}
