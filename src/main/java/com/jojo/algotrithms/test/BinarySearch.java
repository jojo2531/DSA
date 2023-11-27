package com.jojo.algotrithms.test;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,7,8,9,12,14,16,18,23,25,29,34,45,57,67,78};
        int c = 0;
        for(int i: arr) {
            System.out.println(c++ + " -> " + i);
        }
        System.out.println(binarySearch(arr, 0, arr.length - 1, 4));
    }

    static int binarySearch(int[] arr, int start, int end, int element) {

        if(element == arr[start])
            return start;
        if(element == arr[end])
            return end;

        if(start < end) {
            int mid = (start + end) / 2;
            if(element == arr[mid])
                return mid;
            if(element < arr[mid])
                return binarySearch(arr, start, mid - 1, element);
            else
                return binarySearch(arr, mid + 1, end, element);
        }

        return -1;
    }
}

