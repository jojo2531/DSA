package com.jojo.algotrithms.test.array;

import java.util.Arrays;

public class MissingNumber {

    public static void main(String[] args) {
        int[] myArray = {1,2,3,4,6,7};
        System.out.println(findMissingNumber(myArray, 7));
    }

    static int findMissingNumber(int[] arr, int n)  {

        int sum = Arrays.stream(arr).sum();
        int actualSum = (n * (n + 1))/2;
        return actualSum - sum;
    }
}
