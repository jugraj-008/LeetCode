class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;
        int n = prices.length;
        for(int i=0 ; i<n ; i++){
            min = Math.min(prices[i] , min);
            int profit = prices[i] - min;
            maxProfit = Math.max(profit , maxProfit);
        }
        return maxProfit;
    }
}