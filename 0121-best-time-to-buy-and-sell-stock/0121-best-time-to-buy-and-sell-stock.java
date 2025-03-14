class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int min = prices[0];
        for(int i=1; i<prices.length; i++){
            if(prices[i]<min){
                min = prices[i];
            }
            int profit = prices[i]-min;
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }
}