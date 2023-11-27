package com.jojo.practice.array;

import java.util.Arrays;

public class RadixSort {

    public static void main(String[] args) {

        int[] array = {3, 2, 22, 33, 111, 1, 10, 13, 14};

        Arrays.stream(array)
                .boxed()
                .sorted((x, y) -> {
                    int x1 = Integer.parseInt(String.valueOf(x).substring(0,1));
                    int x2 = Integer.parseInt(String.valueOf(y).substring(0,1));

                    if(x1 == x2)
                        return Integer.compare(x, y);
                    else
                        return Integer.compare(x1, x2);
                })
                .forEach(System.out::println);
    }
}
