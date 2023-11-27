package com.jojo.leetCode;

public class tt {

    public static void main(String[] args) {

        System.out.println("Kuttappi....");
        int[] arr = {4,3,2,1,2,3,4};
        int res = 0;
        for(int i = 0; i < arr.length; i++){
            res ^= arr[i];
            System.out.println(res);
        }

    }
}
