package com.jojo.algotrithms.test;

public class SearchInRotatedArray {

    public static void main(String[] args) {
        int[] arr = {45,48,51,53,55,6,9,10,17,24,26,29,34,44}; // 14 elements
        int element = 2;
        int c = 0;
        for(int i: arr) {
            System.out.println(c++ + " -> " + i);
        }
        System.out.println(search(arr, 55));
    }

    static int search(int[] arr, int element)   {

        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            if(element == arr[start])
                return start;
            if(element == arr[end])
                return end;
            int mid = (start + end) / 2;
            if(element == arr[mid])
                return mid;

            if(arr[start] < arr[mid])   { // left array is sorted...
                if(element < arr[mid] && element > arr[start])
                    end = mid - 1;
                else
                    start = mid + 1;

            } else  { // right array is sorted...
                if(element > arr[mid] && element < arr[end])
                    start = mid + 1;
                else
                    end = mid - 1;

            }
        }

        return -1;
    }
}
