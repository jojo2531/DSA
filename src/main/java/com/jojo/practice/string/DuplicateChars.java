package com.jojo.practice.string;

import java.util.HashSet;
import java.util.Set;

public class DuplicateChars {

    public static void main(String[] args) {

        String s = "Hello";
        Set<Character> ss = new HashSet<>();
        for(int i = 0; i< s.length(); i++)  {
            if(!ss.add(s.charAt(i)))
                System.out.println(s.charAt(i));
        }
    }
}
