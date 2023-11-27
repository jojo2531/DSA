package com.jojo.algotrithms.test.array;

import java.util.ArrayList;
import java.util.List;

public class MedianOfTwoSortedArrays {

    public static void main(String[] args) {

        List<Integer> l1 = new ArrayList<>() {{
            add(-50);
            add(-41);
            add(-40);
            add(-19);
            add(5);
            add(21);
            add(28);
        }};
        List<Integer> l2 = new ArrayList<>() {{
            add(-50);
            add(-21);
            add(-10);
        }};

        System.out.println(findMedianSortedArrays(l1, l2));

    }

    static double findMedianSortedArrays(final List<Integer> a, final List<Integer> b) {

        List<Integer> result = new ArrayList<>();
        int resultSize = a.size() + b.size();
        int aIndex = 0, bIndex = 0;
        for(int i = 0; i < resultSize; i++) {
            if(aIndex == a.size()){
                result.add(b.get(bIndex));
                bIndex++;
            }
            else if (bIndex == b.size()) {
                result.add(a.get(aIndex));
                aIndex++;
            }
            else {
                if(a.get(aIndex) < b.get(bIndex))   {
                    result.add(a.get(aIndex));
                    aIndex++;
                } else {
                    result.add(b.get(bIndex));
                    bIndex++;
                }
            }
        }
        boolean isListEven = resultSize % 2 == 0;
        int mid = resultSize / 2;
        System.out.println(result);
        if(isListEven)
            return (double) (result.get(mid) + result.get(mid - 1))/2;
        else
            return (double) result.get(mid);

    }
}
