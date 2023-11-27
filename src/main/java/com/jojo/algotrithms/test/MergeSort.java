package com.jojo.algotrithms.test;

public class MergeSort {

    public static void main(String[] args) {

        int arr[] = {4,2,6,3,9,1,2};
        mergeSort(arr, 0, arr.length - 1);
        for(int i: arr) {
            System.out.print(" " + i);
        }
    }

    static void mergeSort(int[] arr, int start, int end)    {

        if(start < end) {
            int mid = (start + end) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start, end, mid);
        }
    }

    static void merge(int[] arr, int start, int end, int mid)   {

        /*int[] tmpLeft = new int[mid - start + 2];
        int[] tmpRight = new int[end - mid + 1];

        for(int i = 0; i <= mid - start; i++)
            tmpLeft[i] = arr[start + i];
        for(int i = 0; i < end - mid; i++)
            tmpRight[i] = arr[mid + 1 + i];

        tmpLeft[mid - start + 1] = Integer.MAX_VALUE;
        tmpRight[end - mid] = Integer.MAX_VALUE;

        int leftIndex = 0, rightIndex = 0;
        for(int i = start; i <= end; i++)   {
            if(tmpLeft[leftIndex] < tmpRight[rightIndex])    {
                arr[i] = tmpLeft[leftIndex];
                leftIndex++;
            } else {
                arr[i] = tmpRight[rightIndex];
                rightIndex++;
            }
        }*/

        int[] tmpLeft = new int[mid - start + 2];
        int[] tmpRight = new int[end - mid + 1];

        for(int i = 0; i <= mid - start; i++)
            tmpLeft[i] = arr[start + i];

        for(int i = 0; i < end - mid; i++)
            tmpRight[i] = arr[mid + 1 + i];

        tmpLeft[mid - start + 1] = Integer.MAX_VALUE;
        tmpRight[end - mid] = Integer.MAX_VALUE;

        int leftIndex = 0, rightIndex = 0;
        for(int i = start; i <= end; i++)   {
            if(tmpLeft[leftIndex] < tmpRight[rightIndex])   {
                arr[i] = tmpLeft[leftIndex];
                leftIndex++;
            } else {
                arr[i] = tmpRight[rightIndex];
                rightIndex++;
            }
        }
    }
}
