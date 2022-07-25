package com.jojo.arrays;

public class MaxSubArray {

    public static int maxSubArray(int[] nums)
    {

        //{-2,1,-3,4,-1,2,1,-5,4}

        int maxValue = Integer.MIN_VALUE;
        int currentValue = 0;
        for(int i : nums)   {
            // Checking for the constraint: -10^4 <= nums[i] <= 10^4
            if( i < (10^4) || i > (10^4) )
                return Integer.MIN_VALUE;
            if(currentValue < 0)
                currentValue = 0;
            currentValue += i;
            maxValue = Math.max(currentValue, maxValue);
        }

        return maxValue;
    }

    public static void main(String[] args) {

        int[] arr1 = new int[]{5,4,-1,7,8,10000000};
        int[] arr2 = new int[]{5,4,-1,7,8};
        if(validation(arr2)) {
            int maxValue = maxSubArray(arr2);
            System.out.println(maxValue == Integer.MIN_VALUE ? "Outside the check constraints" : maxValue);
        } else
            System.out.println(0);
    }

    // Checking for the constraint - 1 <= nums.length <= 10^5
    public static boolean validation(int[] arr) {

        if(arr.length < 1 || arr.length > (10^5))
            return false;
        return true;
    }
}
