package com.jojo.dataStructures.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        // 3, 2 , 4  -> 6


        Map<Integer, Integer> map = new HashMap<>();
        int complement;
        int[] result = new int[2];
        if(nums == null || nums.length < 2)
            return result;
        for(int i = 0; i < nums.length; i++)    {
            complement = target - nums[i];
            if(!map.containsKey(complement))   {
                map.put(nums[i], i);
            } else{
                result[0] = map.get(complement);
                result[1] = i;
                break;
            }
        }

        return result;
    }


    public static void main(String[] args) {

        int[] arr = new int[]{3, 2, 4};
        System.out.println(Arrays.toString(twoSum(arr, 6)));

    }
}
