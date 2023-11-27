package com.jojo.algotrithms.test;

public class MinValueInRotatedArray {

    public static void main(String[] args) {
        int[] arr = {45,48,51,53,55,5,6,9,10,17,24,26,29,34,44}; // 14 elements
        int element = 2;
        int c = 0;
        for(int i: arr) {
            System.out.println(c++ + " -> " + i);
        }
        System.out.println(minValue(arr));
    }

    static int minValue(int[] arr)  {

        int start = 0;
        int end = arr.length - 1;
        while(start <=end)  {
            int mid = (start + end) / 2;
            if(arr[mid] < arr[mid - 1])
                return arr[mid];

            if(arr[start] < arr[mid])   { // Left is sorted...
                start = mid + 1;
            } else { // Right is sorted...
                end = mid - 1;
            }
        }
        return -1;
    }
}
