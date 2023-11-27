package com.jojo.algotrithms.test.array;

public class BuyAndSellStock {

    public static void main(String[] args) {

        int[] prices = {7, 1, 5, 3, 6, 8};
        int buy = Integer.MAX_VALUE;
        int profit = 0;
        for(int price: prices)  {
            if(buy > price)
                buy = price;

            profit = Math.max(profit, price - buy);
        }
        System.out.println(profit);
    }
}
