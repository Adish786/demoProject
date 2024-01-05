package com.example.program2;

import java.util.Arrays;
import java.util.List;
/* expected Output
		[0, 1, 2]
		[3, 4, 5]
		[6, 7, 8]
		[9]
		*/
public class SplitSize {
    public static void main(String[] args) {
        int[] original = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int splitSize = 3;
        List<int[]> list = splitArray(original, splitSize);
        list.forEach(splitArray -> System.out.println(Arrays.toString(splitArray)));
    }
    public static List<int[]> splitArray(int[] array, int splitSize) {
        if(splitSize<=0){
            return null;
        }
        int rest = array.length % splitSize;
        int chunks = array.length / splitSize + (rest > 0 ? 1 : 0);
        int[][] arrays = new int[chunks][];
        for(int i = 0; i < (rest > 0 ? chunks - 1 : chunks); i++){
            arrays[i] = Arrays.copyOfRange(array, i * splitSize, i * splitSize + splitSize);
        }
        if(rest > 0){
            arrays[chunks - 1] = Arrays.copyOfRange(array, (chunks - 1) * splitSize, (chunks - 1) * splitSize + rest);
        }
        return List.of(arrays);
    }
}

