package com.jojo.algotrithms.test;

import java.util.Arrays;

public class MissingNumberInArray {

    public static void main(String[] args) {

        int[] arr = {1,2,4,5,6,7,8};
        System.out.println(findMissingNumber(arr));

        int[] arr1 = countBits(5);
        System.out.println();
    }

    static int findMissingNumber(int[] arr) {

        int length = arr.length;
        int actualSum = (length * (length + 1)) / 2;

        int sum = Arrays.stream(arr).sum();

        return sum - actualSum;
    }

    static int[] countBits(int n) {
        int[] result = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            result[i] = result[i >> 1] + (i & 1);
        }
        return result;
    }
}
