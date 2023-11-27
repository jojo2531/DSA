package com.jojo.leetCode;

import java.util.HashMap;
import java.util.Map;

public class NumberFactor {

    public static void main(String[] args) {
        System.out.println(waysToGetNTopDown(5));
        System.out.println(waysToGetNBottomUp(5));
    }

    public static int waysToGetNTopDown(int n) {
        // TODO
        Map<Integer, Integer> cache = new HashMap<>();
        return waysToGetN(n, cache);
    }

    public static int waysToGetN(int n, Map<Integer, Integer> cache)    {
        if(n == 1 || n == 2 || n == 0)
            return 1;
        else if(n == 3)
            return 2;
        else if(cache.containsKey(n))
            return cache.get(n);
        else    {
            int a1 = waysToGetN(n-1, cache);
            int a2 = waysToGetN(n-3, cache);
            int a3 = waysToGetN(n-4, cache);
            cache.put(n, a1 + a2 + a3);
        }
        return cache.get(n);
    }

    public static int waysToGetNBottomUp(int n) {

        int[] cacheArray = new int[n+1];
        return waysToGetNBU( n, cacheArray);
    }

    public static int waysToGetNBU(int n, int[] cacheArray) {

        cacheArray[0] = 1;
        cacheArray[1] = 1;
        cacheArray[2] = 1;
        cacheArray[3] = 2;
        int i = 4;
        while (i <= n)  {
            cacheArray[i] = cacheArray[i - 1] + cacheArray[i-3] + cacheArray[i-4];
            i++;
        }
        return cacheArray[n];

    }
}
