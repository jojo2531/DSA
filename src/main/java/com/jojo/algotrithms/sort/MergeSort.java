package com.jojo.algotrithms.sort;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {

        int arr[] = {4,2,6,3,9,1,2};
        mergeSort(arr, 0, arr.length - 1);
        Arrays.stream(arr).boxed().forEach(System.out::println);
    }

    public static void mergeSort(int[] arr, int start, int end) {
        if(start < end) {
            int middle = (start + end) / 2;
            mergeSort(arr, start, middle);
            mergeSort(arr, middle + 1, end);
            merge(arr, start, end, middle);
        }
    }

    public static void merge(int[] arr, int left, int right, int middle)    {

        int[] tmpLeftArr = new int[middle - left + 2];
        int[] tmpRightArr = new int[right - middle + 1];

        for(int i = 0; i <= middle - left; i++)
            tmpLeftArr[i] = arr[left + i];

        for(int i = 0; i < right - middle; i++)
            tmpRightArr[i] = arr[middle + 1 + i];

        tmpLeftArr[middle - left + 1] = Integer.MAX_VALUE;
        tmpRightArr[right - middle] = Integer.MAX_VALUE;

        int i = 0, j = 0;

        for(int k = left; k <= right; k++)  {
            if(tmpLeftArr[i] < tmpRightArr[j])  {
                arr[k] = tmpLeftArr[i];
                i++;
            } else {
                arr[k] = tmpRightArr[j];
                j++;
            }
        }
    }
}
