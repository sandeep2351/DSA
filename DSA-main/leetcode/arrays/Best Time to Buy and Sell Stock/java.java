class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int profit = 0;
        int maxProfit = 0;
        int n = prices.length;
        for(int i = 0; i < n; i++) {
            min = Math.min(min, prices[i]);
            profit = prices[i] - min;
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }
}