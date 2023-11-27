package com.jojo.algotrithms.test;

public class UniqueElementFromDuplicatesInArray {

    public static void main(String[] args) {

        int[] arr = {4,3,2,1,2,3,4};
        System.out.println(uniqueElement(arr));
    }

    static int uniqueElement(int[] arr) {

        int result = 0;
        for(int nums: arr)
            result ^= nums;

        return result;
    }
}
