package com.jojo.algotrithms.test;

public class CountNumberOfBits {

    public static void main(String[] args) {

        int num = 4;
        int count = 0;
        while(num != 0)   {
            count += num & 1;
            num >>>= 1;
        }
        System.out.println(count);
    }
}
