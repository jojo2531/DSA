package com.jojo.algotrithms.test.array;

public class FirstAndLastPositionOfElement {

    public static void main(String[] args) {

        int[] nums = {1,2,2,2,2,3};

        System.out.println(firstOccurrence(nums, 2, 0 , nums.length - 1));
        System.out.println(lastOccurrence(nums, 2, 0 , nums.length - 1));
        int[] result = {firstOccurrence(nums, 2, 0 , nums.length - 1),
                lastOccurrence(nums, 2, 0 , nums.length - 1)};
    }

    static int firstOccurrence(int[] nums, int target, int start, int end)  {

        int index = -1;
        while (start <= end)    {
            int mid = (start + end) / 2;
            if(target == nums[mid])
                index = mid;
            if(target <= nums[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }
        return index;
    }

    static int lastOccurrence(int[] nums, int target, int start, int end)  {

        int index = -1;
        while (start <= end)    {
            int mid = (start + end) / 2;
            if(target == nums[mid])
                index = mid;
            if(target <= nums[mid])
                start = mid + 1;
            else
                end = mid - 1;
        }
        return index;
    }
}
