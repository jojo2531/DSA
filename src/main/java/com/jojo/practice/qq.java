package com.jojo.practice;

import java.util.List;

public class qq {

    public static void findMin(int[] arr, int start, int end)    {

        while(start <= end) {
            int mid = (start + end) / 2;
            if(arr[mid] < arr[mid -1])
                System.out.println(arr[mid]);

            if(arr[mid] > arr[end])
                start = mid + 1;
            else
                end = mid - 1;
        }
    }

    public static int findMin(List<Integer> arr, int low,
                              int high)
    {
        // If the array is not rotated
        if (arr.get(low) <= arr.get(high)) {
            return arr.get(low);
        }

        // Binary search
        while (low <= high) {
            int mid = (low + high) / 2;

            // Check if mid is the minimum element
            if (arr.get(mid) < arr.get(mid - 1)) {
                return arr.get(mid);
            }
            // If the left half is sorted, the minimum
            // element must be in the right half
            if (arr.get(mid) > arr.get(high)) {
                low = mid + 1;
            }

            // If the right half is sorted, the minimum
            // element must be in the left half
            else {
                high = mid - 1;
            }
        }

        // If no minimum element is found, return -1
        return -1;
    }

    public static void main(String[] args)
    {
        int[] arr = { 5,6,7,8,9,11,14,15,1,2};

        findMin(arr, 0, arr.length - 1);
        System.out.println(findElement(arr, 0, arr.length - 1, 15));
    }

    static int findElement(int[] arr, int start, int end, int element)  {


        if(arr[start] == element)
            System.out.println(start);
        else if(arr[end] == element)
            System.out.println(end);
        else {
            while(start <= end) {
                int mid = (start + end) / 2;
                if (arr[mid] == element)
                    return mid;
                else {
                    if(arr[start] <= arr[mid])  {
                        if(element >= arr[start] && element < arr[mid])
                            end = mid - 1;
                        else
                            start = mid + 1;
                    } else  {
                        if(element <= arr[end] && element > arr[mid])
                            start = mid + 1;
                        else
                            end = mid - 1;
                    }

                }
            }
        }
        return -1;
    }
}
