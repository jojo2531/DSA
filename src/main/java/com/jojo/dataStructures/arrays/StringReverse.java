package com.jojo.dataStructures.arrays;

import java.util.stream.IntStream;

public class StringReverse {

    public static String reverse(String str)  {

        if(str == null || str.isEmpty())    {
            System.err.println("The value of the String is empty or null...");
            return null;
        } else if(str.length() == 1)    {
            System.out.println("[WARN] Please enter a string with more than 1 letter...");
            return str;
        } else {
            StringBuilder sb = new StringBuilder();

            for(int i = str.length() - 1; i >= 0; i--)
                sb.append(str.charAt(i));

            return sb.toString();
        }
    }

   public static void reverseUsingStream(String str)   {

       if(str == null || str.isEmpty())    {
           System.err.println("The value of the String is empty or null...");
       } else if(str.length() == 1)    {
           System.out.println("[WARN] Please enter a string with more than 1 letter...");
       } else {
           int length = str.length();
           StringBuilder sb = new StringBuilder();
           IntStream.range(0, length)
                   .forEach(i -> sb.append(str.charAt(length - 1 - i)));

           System.out.println(sb);
       }
    }

    public static void main(String[] args) {

        System.out.println("String Reverse...");

        //reverse(null);
        //reverse("");
        //reverse("A");
        reverseUsingStream("Hey Y'all... The string is reversed...");

    }
}
