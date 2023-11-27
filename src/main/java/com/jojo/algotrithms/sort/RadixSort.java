package com.jojo.algotrithms.sort;

import java.util.Arrays;

public class RadixSort {

    public static void radixSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return; // No need to sort.
        }

        // Find the maximum number to determine the number of digits.
        int max = Arrays.stream(arr).max().getAsInt();
        int exp = 1; // Initialize the digit position.

        while (max / exp > 0) {
            countingSortByDigit(arr, exp);
            exp *= 10; // Move to the next digit.
        }
    }

    // Counting sort for a specific digit position (exp).
    private static void countingSortByDigit(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10]; // Radix is 10 (0-9).

        // Count occurrences of each digit at the given position.
        for (int i = 0; i < n; i++) {
            count[(arr[i] / exp) % 10]++;
        }

        // Calculate cumulative counts to determine the position of each element.
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Build the output array by placing elements in the correct position.
        for (int i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        // Copy the sorted elements back to the original array.
        System.arraycopy(output, 0, arr, 0, n);
    }

    public static void main(String[] args) {
        int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};
        System.out.println("Original Array: " + Arrays.toString(arr));
        radixSort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}

