package com.jojo.algotrithms.search;

public class FindIndexFromRotatedArray {

    public static void main(String[] args) {
        int[] arr = {45,48,51,53,55,6,9,10,17,24,26,29,34,44};
        int element = 2;
        //search(arr, 0, arr.length -1, element);
        System.out.println(search(arr, 48));
    }

    public static int search(int[] arr, int start, int end, int element)   {

        int mid = (start+end)/2;
        if(element == arr[mid])
            return mid;

        return -1;
    }

    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = /*left + */(right + left) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            // If the left half is sorted
            if (nums[left] <= nums[mid]) {
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else { // If the right half is sorted
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1; // Element not found
    }


}
