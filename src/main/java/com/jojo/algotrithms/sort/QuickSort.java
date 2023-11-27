package com.jojo.algotrithms.sort;

import com.jojo.utlities.Utilities;

import java.util.Arrays;

// TODO: TO BE COMPLETED
public class QuickSort {

    public static void main(String[] args) {

        System.out.println("Kuttappiii.....");
        Utilities util = new Utilities();

        // Simple case...
        int[] arr10 = util.getTestArr();
        Arrays.stream(arr10).boxed().forEach(i -> System.out.print(i + " "));
        long start = System.currentTimeMillis();
        quickSort(arr10, 0, arr10.length - 1);
        System.out.println("Time taken: " + Math.subtractExact(System.currentTimeMillis(), start));
        for (int value : arr10)
            System.out.print(" " + value);
        System.out.println();
    }

    public static void quickSort(int[] arr, int start, int end) {

        if(start < end) {
            int pivot = partition(arr, start, end);
            quickSort(arr, start, pivot - 1);
            quickSort(arr, pivot +1, end);
        }
    }

    public static int partition(int[] arr, int start, int end)  {

        /*int pivot = end;
        int i = start - 1;
        int temp;
        for(int j = start; j <= end; j++)   {
            if(arr[j] <= arr[pivot]) {
                i++;
                temp = arr[i];
                arr[i] = arr [j];
                arr[j] = temp;
            }
        }

        return i;*/

        int pivot = end;
        int i = start - 1;
        int temp;
        for(int j = start; j <= end; j++)   {
            if(arr[j] <= arr[pivot])    {
                i++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        return i;
    }
/*
    static int partition(int[] array, int start, int end) {
        int pivot = end;
        int i = start - 1;
        for (int j= start; j<=end; j++) {
            if (array[j] <= array[pivot]) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        return i;
    }

    public static void quickSort(int[] array, int start, int end) {
        if (start < end) {
            int pivot = partition(array, start, end);
            quickSort(array, start, pivot -1);
            quickSort(array, pivot + 1, end);
        }
    }*/
}
