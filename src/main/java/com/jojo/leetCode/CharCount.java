package com.jojo.leetCode;

import java.util.Arrays;

public class CharCount {

    public static void main(String[] args) {
        String s1 = "Wello Horld";
        String s2 = "loHel ldWor";
       // String s2 = "loeHl dorlw";

        System.out.println(Arrays.equals(s1.chars().sorted().toArray(), s2.chars().sorted().toArray()));
    }
}
