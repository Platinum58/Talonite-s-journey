public class Best_timetobuyyandsellstock {
    class Solution {
    public int maxProfit(int[] prices) {
        int low = prices[0];
        int profit = 0;
        for (int i = 0; i < prices.length; i++){
            if(prices[i] < low) low = prices[i];
            int p = prices[i] - low;
            if(p > profit ) profit = p;

        }
        return profit;
    }
}
}
