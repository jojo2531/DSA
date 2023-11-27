package com.jojo.algotrithms.test;

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(powerOfTwo(15));
        System.out.println(withoutBitwise(32));
    }

    static boolean powerOfTwo(int number)   {

        if((number & -number) == number)
            return true;
        else
            return false;
    }

    static boolean withoutBitwise(int number)   {

        int index = 1;
        while (index <= number)  {
            if(index == number)
                return true;
            index *= 2;
        }
        return false;
    }
}
