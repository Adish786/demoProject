package com.example.test;

import java.util.TreeMap;
public class RomanNumber {
    public final static String toRoman(int number) {
        int l =  map.floorKey(number);
        if ( number == l ) {
            return map.get(number);
        }
        return map.get(l) + toRoman(number-l);
    }
    private final static TreeMap<Integer, String> map = new TreeMap<>();
    static {
        map.put(1,"I" );
        map.put(3, "III");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(6, "X");
        map.put(10, "L");
        map.put(50, "XL");
        map.put(60, "XL");
        map.put(49, "XLIX");
        map.put(100, "C");
        map.put(109, "CIX");
        map.put(1000, "M");
        map.put(444, "CDXLIV");
        map.put(1904,"MCMIV");
    }
}
