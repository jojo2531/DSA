package com.jojo.algotrithms.search;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        System.out.println("Kuttapi....");
        int[] arr = new int[]{3,45,23,4563,33,5,2,6,2342,678,435,24,34,2342,245,232,55,22,77,45,787,3434,7878,334,542,54,6224,346463,224,7865,444,32456,96,242,8,45};
        int findElement = 33;
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++)
            System.out.println(i + " -> " + arr[i]);
        int index = binarySearch(arr, findElement);
        if(index < 0)
            System.out.println("The element is not present in the array...");
        else
            System.out.printf("The element %d is present in position %d%n", findElement, index);
    }

    private static int binarySearch(int[] arr, int element)    {

        int midIndex = Math.floorDiv(arr.length - 1, 2);
        if(arr[midIndex] == element)
            System.out.println(midIndex);

        if(arr[midIndex] > element)
            return findElement(arr, 0, --midIndex, element);
        else
            return findElement(arr, ++midIndex, arr.length - 1, element);
    }

    private static int findElement(int[] arr, int startIndex, int endIndex, int element)  {
        int midIndex = Math.floorDiv(startIndex + endIndex, 2);
        if(startIndex <= endIndex) {
            if (arr[midIndex] == element)
                return midIndex;
            else {
                if (arr[midIndex] > element)
                    return findElement(arr, startIndex, --midIndex, element);
                else
                    return findElement(arr, ++midIndex, endIndex, element);
            }
        } else
            return -1;
    }
}
