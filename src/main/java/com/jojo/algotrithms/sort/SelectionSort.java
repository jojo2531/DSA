package com.jojo.algotrithms.sort;

import com.jojo.utlities.Utilities;

public class SelectionSort {

    public static void main(String[] args) {

        System.out.println("Kuttappiii.....");
        Utilities util = new Utilities();

        // Simple case...
        int[] arr10 = util.getTestArr();
        long start = System.currentTimeMillis();
        selectionSort(arr10);
        System.out.println("Time taken: " + Math.subtractExact(System.currentTimeMillis(), start));
        for (int value : arr10)
            System.out.print(" " + value);
        System.out.println();

        // Without repetitive elements
        int[] arrWOR500 = util.getArrWOR500();
        start = System.currentTimeMillis();
        selectionSort(arrWOR500);
        System.out.println("Time taken: " + Math.subtractExact(System.currentTimeMillis(), start));
        for (int k : arrWOR500)
            System.out.print(" " + k);
        System.out.println();

        // With repetitive elements
        int[] arrWR500 = util.getArrWR500();
        start = System.currentTimeMillis();
        selectionSort(arrWR500);
        System.out.println("Time taken: " + Math.subtractExact(System.currentTimeMillis(), start));
        for (int j : arrWR500)
            System.out.print(" " + j);
        System.out.println();
    }

    public static void selectionSort(int[] arr) {

        int minElement;
        int minElementIndex;

        for(int i = 0; i < arr.length; i++) {

            minElement = arr[i];
            minElementIndex = i;
            boolean isMinFound = false;
            int temp;
            for(int j = i + 1; j < arr.length; j++) {
                if(minElement > arr[j]) {
                    minElement = arr[j];
                    minElementIndex = j;
                    isMinFound = true;
                }
            }

            if(isMinFound)  {
                temp = arr[i];
                arr[i] = minElement;
                arr[minElementIndex] = temp;
            }
        }
    }
}
