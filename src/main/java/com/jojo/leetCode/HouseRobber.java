package com.jojo.leetCode;

public class HouseRobber {


    public static void main(String[] args) {

        System.out.println("Kuttappii....");
        int[] arr = {6,7,100,30,8,2,4};
        int[] temp = new int[arr.length + 2]; // TODO : {0,0,34,34,12,4,4,0,0}
        for(int i = arr.length - 1; i >= 0; i--)    {
            temp[i] = Math.max(arr[i] + temp[i + 2], temp[i+1]);
        }
        System.out.println(temp[0]);
    }

}
