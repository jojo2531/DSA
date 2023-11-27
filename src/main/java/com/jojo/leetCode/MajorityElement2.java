package com.jojo.leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MajorityElement2 {

    public static void main(String[] args) {

        int[] nums = new int[]{0,0,0};
        System.out.println(0 >=  -(Math.pow(10,9)));
        System.out.println(majorityElement(nums));
    }

    public static List<Integer> majorityElement(int[] nums) {


        if(nums.length < 3)    {
            return  Arrays.stream(nums).boxed().distinct().toList();
        } else if (nums.length > (5 * Math.pow(10, 4))) {
            return new ArrayList<>();
        } else {
            int occurence = nums.length/3;
            List<Integer> result = new ArrayList<>();

            for(int i = 0; i < nums.length; i++) {
                int value = nums[i];

                if (value >= -(Math.pow(10,9)) && value <= Math.pow(10, 9) && !result.contains(value)) {
                    System.out.println(value +" -> " + Arrays.stream(nums)
                            .boxed()
                            .filter(j -> j == value)
                            .count());
                    if (Arrays.stream(nums)
                            .boxed()
                            .filter(j -> j == value)
                            .count() > occurence) {
                        result.add(value);
                    }
                }
            }
            return result;
        }
    }

}
