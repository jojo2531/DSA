package com.jojo.algotrithms.test;

public class OddOrEven {

    public static void main(String[] args) {
        System.out.println(isOddOrEven(7));
    }

    static boolean isOddOrEven(int number) {
        if((number & 1) == 0)
            return true;
        else
            return false;
    }
}
