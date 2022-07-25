package com.jojo.arrays;

import java.util.Arrays;

public class MoveZeros {

    /**
     * My Logic....
     */
    public static  void moveZeroes(int[] nums) {

        int zeroCounter = 0;
        int zeroIndex = 0;
        int temp;
        for(int i = 0; i < nums.length; i++)    {

            if(nums[i] == 0)    {
                zeroCounter++;
                if(zeroCounter == 1)
                    zeroIndex = i;
                else
                    zeroIndex = Math.min(zeroIndex, i);


            } else {
                if(zeroCounter > 0) {
                    temp = nums[i];
                    nums[zeroIndex] = temp;
                    nums[i] = 0;
                    if(zeroCounter == 1)
                        zeroIndex = i;
                    else
                        zeroIndex++;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    /**
     * Code from Internet...
     */
    public static void moveZeroes1(int[] nums) {
        int i = 0;
        int j = 0;

        while (j < nums.length) {
            if (nums[j] != 0) {
                nums[i++] = nums[j];
            }

            j++;
        }

        while (i < nums.length) {
            nums[i++] = 0;
        }
        System.out.println(Arrays.toString(nums));


    }
    public static void main(String[] args) {

        moveZeroes(new int[]{0,0,1,0,0,3,12,0,15});
    }
}
