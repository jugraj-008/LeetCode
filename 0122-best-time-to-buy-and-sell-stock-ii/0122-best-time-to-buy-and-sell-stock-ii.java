class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxProfit = 0;

        for (int i = 1; i < n; i++) {
            //Is today's price higher than yesterday's?
            if (prices[i] > prices[i - 1]) {
                maxProfit = maxProfit + prices[i] - prices[i-1];
            }
        }

        return maxProfit;
    }
}