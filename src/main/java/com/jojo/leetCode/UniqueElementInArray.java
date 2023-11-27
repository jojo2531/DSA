package com.jojo.leetCode;

public class UniqueElementInArray {

    public static void main(String[] args) {

        System.out.println("Kuttappii....");

        int[] arr = {4,3,2,1,2,3,4,4,4,3,3,2,2};

        int result = 0;
        for(int i = 0; i < arr.length; i++) {
            result ^= arr[i];
        }

        System.out.printf("Result: %d\n" , result);
    }
}
