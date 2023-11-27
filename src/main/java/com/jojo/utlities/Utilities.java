package com.jojo.utlities;

import java.util.Random;

public class Utilities {

    public int[] getArr10() {
        int[] arr10 = new int[15];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            arr10[i] = random.nextInt(10);
        }
        return arr10;
    }

    public int[] getArr100() {
        int[] arr100 = new int[100];
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            arr100[i] = random.nextInt(80);
        }
        return arr100;
    }

    public int[] getArrWR500() {
        int[] arrWR500 = new int[500];
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            arrWR500[i] = random.nextInt(450);
        }
        return arrWR500;
    }
    public int[] getArrWOR500() {
        int[] arrWOR500 = new int[20];
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            arrWOR500[i] = random.nextInt(100);
        }
        return arrWOR500;
    }

    public int[] getTestArr()   {
        return new int[]{5, 4, 10, 1, 6, 2, 7, 3, 6};
    }
}
