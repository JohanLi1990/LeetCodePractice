package com.shuati;

public class LC_121_Best_Time_Buy_Sell_Stock {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        for(int price : prices){
            if (max > price){
                continue;
            }
            min = Math.min(min, price);
            max = Math.max(max, price - min);
        }
        return max;
    }
}
