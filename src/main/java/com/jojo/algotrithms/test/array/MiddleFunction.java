package com.jojo.algotrithms.test.array;

import java.util.Arrays;

public class MiddleFunction {

    public static void main(String[] args) {

        int[] arr = {2,3,4,5,6,7,8};
        int[] result = new int[arr.length - 2];
        int index = 0;
        for(int i = 1; i <= arr.length - 2; i++)
            result[index++] = arr[i];

        Arrays.stream(result).boxed().forEach(System.out::println);
    }
}
