package com.shuati;

public class LC_121_Best_Time_Buy_Sell_Stock {
    public int maxProfit(int[] prices) {

        if (prices.length < 2){
            return 0;
        }

        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            if (max > prices[i]){
                continue;
            }

            for (int j = 0; j < i ; j++) {
                max = Math.max(max, prices[i] - prices[j]);
            }

        }
        return max;

    }
}
