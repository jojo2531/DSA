package com.jojo.practice.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Integer[] array = {3, 2, 22, 33, 111, 1, 10, 13, 14};

        // Create a custom comparator to sort based on the first digit and then the actual value
        Comparator<Integer> customComparator = (num1, num2) -> {
            int firstDigit1 = Integer.parseInt(Integer.toString(num1).substring(0, 1));
            int firstDigit2 = Integer.parseInt(Integer.toString(num2).substring(0, 1));

            if (firstDigit1 != firstDigit2) {
                return Integer.compare(firstDigit1, firstDigit2);
            } else {
                return Integer.compare(num1, num2);
            }
        };

        // Sort the array using the custom comparator and the Stream API
        Stream<Integer> sortedStream = Arrays.stream(array)
                .sorted(customComparator);

        // Convert the sorted stream back to an array
        Integer[] sortedArray = sortedStream.toArray(Integer[]::new);

        // Print the sorted array
        Arrays.stream(sortedArray).forEach(System.out::println);
    }
}
