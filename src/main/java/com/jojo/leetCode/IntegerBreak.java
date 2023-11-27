package com.jojo.leetCode;

public class IntegerBreak {

    public static void main(String[] args) {
        System.out.println(integerBreak(10));
    }

    public static int integerBreak(int n) {

        if(n == 2)
            return 1;
        else if(n == 3)
            return 2;
        else if(n > 3 && n <= 58)   {
            int result = 1;
            while(n > 4)    {
                result *= 3;
                n -= 3;
            }
            return result * n;
        }
        else
            return 0;
    }
}
