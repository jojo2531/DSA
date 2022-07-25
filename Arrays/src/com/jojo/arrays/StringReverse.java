package com.jojo.exercies;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringReverse {

    public static void reverse(String str)  {

        if(str == null || str.isEmpty())    {
            System.err.println("The value of the String is empty or null...");
            return;
        } else if(str.length() == 1)    {
            System.out.println("[WARN] Please enter a string with more than 1 letter...");
            return;
        } else {
            StringBuilder sb = new StringBuilder();

            for(int i = str.length() - 1; i >= 0; i--)
                sb.append(str.charAt(i));

            System.out.println("Reversed String: " + sb);
        }
    }

   public static void reverseUsingStream(String str)   {

       if(str == null || str.isEmpty())    {
           System.err.println("The value of the String is empty or null...");
           return;
       } else if(str.length() == 1)    {
           System.out.println("[WARN] Please enter a string with more than 1 letter...");
           return;
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
