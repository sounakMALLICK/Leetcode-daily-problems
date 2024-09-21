class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int max_profit = 0;
        for(int i=1; i<prices.length; i++){
            int profit = 0;
            if(prices[i]<min){
                min = prices[i];
            }
            profit = prices[i]-min;
            max_profit = Math.max(profit, max_profit);
        }
        return max_profit;
    }
}