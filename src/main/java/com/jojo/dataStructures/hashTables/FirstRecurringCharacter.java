package com.jojo.dataStructures.hashTables;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

public class FirstRecurringCharacter {

    public static int findRecurringUsingSet(int[] arr)  {
        Set<Integer> set = new HashSet<>();
        for(int i : arr)    {
            if(!set.add(i)) {
                return i;
            }
        }
        return 0;
    }

    public static int findRecurringUsingTable(int[] arr)  {
        Hashtable<Integer, Integer> table = new Hashtable<>();
        for(int i: arr) {
            if(!table.containsKey(i))
                table.put(i, 0);
            else
                return i;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,3,4,6,5,56,56,23,4,6,7,3,};

        System.out.println("The First Recurring Character using Hash Set is: " + findRecurringUsingSet(arr));
        System.out.println("The First Recurring Character using Hash Table is: " + findRecurringUsingTable(arr));
    }
}
