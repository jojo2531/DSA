package com.jojo.leetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LengthOfLongestSubString {
    public static void main(String[] args) {
        /*System.out.println("3 - > " + lengthOfLongestSubstringUsingSet("abcabcbb"));
        System.out.println("2 - > " + lengthOfLongestSubstringUsingSet("au"));
        System.out.println("2 - > " + lengthOfLongestSubstringUsingSet("aab"));
        System.out.println("3 - > " + lengthOfLongestSubstringUsingSet("dvdf"));*/

        /*System.out.println("3 - > " + lengthOfLongestSubstringUsingMap("abcabcbb"));
        System.out.println("2 - > " + lengthOfLongestSubstringUsingMap("au"));
        System.out.println("2 - > " + lengthOfLongestSubstringUsingMap("aab"));
        System.out.println("3 - > " + lengthOfLongestSubstringUsingMap("dvdf"));*/

        /*System.out.println("3 - > " + lengthOfLongestSubstring("abcabcbb"));
        System.out.println("2 - > " + lengthOfLongestSubstring("au"));
        System.out.println("2 - > " + lengthOfLongestSubstring("aab"));*/
        System.out.println("3 - > " + lengthOfLongestSubstring("dvdfasd"));
    }

    public static int lengthOfLongestSubstringUsingSet(String s) {

        int longestLength = 0;
        Set<Character> subSet = new HashSet<>();
        if (s.length() >= 0 && s.length() <= 5 * Math.pow(10, 4)) {
            if (s.length() < 2)
                return s.length();
            for (int i = 0; i < s.length(); i++) {
                if (!subSet.add(s.charAt(i))) {
                    longestLength = Math.max(subSet.size(), longestLength);
                    subSet.clear();
                    i = resetIndex(s, s.charAt(i), i - 1);
                }
            }
        }
        return Math.max(subSet.size(), longestLength);
    }

    public static int resetIndex(String str, char chr, int currentIndex)    {

        for(int i = currentIndex; i > 0; i--)   {
            if(str.charAt(i) == chr)
                return i;
        }
        return 0;
    }

    public static int lengthOfLongestSubstringUsingMap(String s) {

        int longestLength = 0;
        List<Character> subSet = new ArrayList<>();
        if (s.length() >= 0 && s.length() <= 5 * Math.pow(10, 4)) {
            if (s.length() < 2)
                return s.length();
            for (int i = 0; i < s.length(); i++) {
                if (subSet.contains(s.charAt(i))) {
                    longestLength = Math.max(subSet.size(), longestLength);
                    subSet.clear();
                    i = resetIndex(s, s.charAt(i), i - 1);
                } else
                    subSet.add(s.charAt(i));
            }
        }
        return Math.max(subSet.size(), longestLength);
    }

    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet();
        int max = 0;
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            while(!set.add(s.charAt(right))) {
                set.remove(s.charAt(left++));
            }
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}//dvdfasd
