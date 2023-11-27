package com.jojo.algotrithms.sort;

import com.jojo.utlities.Utilities;

public class BubbleSort {

    public static void main(String[] args) {
        System.out.println("Kuttappiii.....");
        Utilities util = new Utilities();

        // Simple case...
        int[] arr10 = util.getArr10();
        long start = System.currentTimeMillis();
        bubbleSort(arr10);
        System.out.println("Time taken: " + Math.subtractExact(System.currentTimeMillis(), start));
        for (int k : arr10)
            System.out.print(" " + k);
        System.out.println();

        // Without repetitive elements
        int[] arrWOR500 = util.getArrWOR500();
        start = System.currentTimeMillis();
        bubbleSort(arrWOR500);
        System.out.println("Time taken: " + Math.subtractExact(System.currentTimeMillis(), start));
        for (int j : arrWOR500)
            System.out.print(" " + j);
        System.out.println();

        // With repetitive elements
        int[] arr500 = util.getArrWR500();
        start = System.currentTimeMillis();
        bubbleSort(arr500);
        System.out.println("Time taken: " + Math.subtractExact(System.currentTimeMillis(), start));
        for (int j : arr500)
            System.out.print(" " + j);


    }

    public static void bubbleSort(int[] arr)   {
        int endIndex = arr.length - 1;
        int temp;
        boolean isSwapped;

        for(int i = 0; i <arr.length - 1; i++)  {
            isSwapped = false;
            for(int j = 0; j < endIndex; j++)   {
                if(arr[j] > arr[j+1])   {
                    temp = arr[j];
                    arr[j] = arr [j+1];
                    arr[j+1] = temp;
                    isSwapped = true;
                }
            }
            if(!isSwapped) {
                // To determine at which pass sorting was completed...
                System.out.println("\n\nSkipped after " + (i + 1) + "th pass...");
                break;
            }
            endIndex--;
        }
    }
}
