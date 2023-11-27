package com.jojo.algotrithms.test.array;

import java.util.Arrays;

public class TopTwoScores {

    public static void main(String[] args) {

        int[] myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0};
        int[] result = {0,0};

        for(int score: myArray) {
            result[1] = Math.max(score, result[1]);
            if(result[0] < Math.max(result[0], result[1]))  {
                result[1] = result[0];
                result[0] = score;
            }
        }

        Arrays.stream(result).forEach(System.out::println);
    }
}
