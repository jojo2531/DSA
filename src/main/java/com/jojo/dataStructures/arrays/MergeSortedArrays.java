package com.jojo.dataStructures.arrays;

import java.util.Arrays;

public class MergeSortedArrays {

    public static int[] mergeArrays(int[] arr1, int[] arr2)  {

        if(arr1.length == 0 && arr2.length == 0)    {
            System.out.println("Both the arrays are empty...");
            return arr1;
        }
        else if (arr1.length == 0)  {
            System.out.println("Array 1 is empty...");
            return arr2;
        } else if(arr2.length == 0) {
            System.out.println("Array 2 is empty...");
            return arr1;
        }

        int indexForArr1 = 0, indexForArr2 = 0;
        int[] resultArr = new int[arr1.length + arr2.length];

        for(int i = 0; i < arr1.length + arr2.length; i++)  {

            /*
              If any of the array has passed its overall size,
              then just append/merge the rest of other array to the result array
             */

            if(indexForArr1 >= arr1.length || indexForArr2 >= arr2.length)    {
                if(indexForArr1 >= arr1.length)    {
                    resultArr[i] = arr2[indexForArr2];
                    indexForArr2++;
                } else {
                    resultArr[i] = arr1[indexForArr1];
                    indexForArr1++;
                }
            }

            /*
              The usual merging process to the result array
             */
            else {

                if(arr1[indexForArr1] < arr2[indexForArr2]) {
                    resultArr[i] = arr1[indexForArr1];
                    indexForArr1++;
                } else if(arr2[indexForArr2] < arr1[indexForArr1])  {
                    resultArr[i] = arr2[indexForArr2];
                    indexForArr2++;
                } else {
                    resultArr[i++] = arr1[indexForArr1];
                    resultArr[i] = arr2[indexForArr2];
                    indexForArr1++;
                    indexForArr2++;
                }
            }
        }

        return resultArr;
    }
    public static void main(String[] args) {

        int[] arr1 = new int[]{1,4,5,7,8,9,13,45,55};
        int[] arr2 = new int[]{1,3,4,7,9,22,25,31};

        System.out.println(Arrays.toString(mergeArrays(arr1, arr2)));
    }
}
