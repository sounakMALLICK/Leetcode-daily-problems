class Solution {
    public int maxProfit(int[] prices, int fee) {
        int buy = -prices[0];
        int sell = 0;
        for(int i=1; i<prices.length; i++){
            int currBuy = Math.max(buy, sell-prices[i]);
            int currSell = Math.max(sell, prices[i]+buy-fee);
            buy = currBuy;
            sell = currSell;
        }
        return sell;
    }
}