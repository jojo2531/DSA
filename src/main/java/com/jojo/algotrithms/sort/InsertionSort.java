package com.jojo.algotrithms.sort;

import com.jojo.utlities.Utilities;

public class InsertionSort {

    public static void main(String[] args) {
        System.out.println("Kuttappiii.....");
        Utilities util = new Utilities();

        // Simple case...
        int[] arr10 = util.getTestArr();
        long start = System.currentTimeMillis();
        insertionSort(arr10);
        System.out.println("Time taken: " + Math.subtractExact(System.currentTimeMillis(), start));
        for (int value : arr10)
            System.out.print(" " + value);
        System.out.println();

        // Without repetitive elements
        int[] arrWOR500 = util.getArrWOR500();
        start = System.currentTimeMillis();
        insertionSort(arrWOR500);
        System.out.println("Time taken: " + Math.subtractExact(System.currentTimeMillis(), start));
        for (int k : arrWOR500)
            System.out.print(" " + k);
        System.out.println();

        // With repetitive elements
        int[] arrWR500 = util.getArrWR500();
        start = System.currentTimeMillis();
        insertionSort(arrWR500);
        System.out.println("Time taken: " + Math.subtractExact(System.currentTimeMillis(), start));
        for (int j : arrWR500)
            System.out.print(" " + j);
        System.out.println();
    }

    public static void insertionSort(int[] arr)  {

        int temp;
        int swapIndex;
        for(int i = 1; i < arr.length; i++) {

            temp = arr[i];
            // swapIndex determines where the element in the unsorted subArray needs to be swapped...
            swapIndex = i;
            for(int j = i - 1; j >= 0; j--)  {
                if(temp < arr[j])   {
                    arr[j+1] = arr[j];
                    swapIndex--;
                }
            }
            arr[swapIndex] = temp;
        }
    }
}
