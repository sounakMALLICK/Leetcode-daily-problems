class Solution {
    public int maxProfit(int[] prices) {
        int buy = -prices[0];
        int sell = 0, cooldown = 0;

        for(int i=1; i<prices.length; i++){
            int newBuy = Math.max(buy, cooldown-prices[i]);
            int newSell = Math.max(sell, prices[i]+buy);
            cooldown = Math.max(sell, cooldown);

            buy = newBuy;
            sell = newSell;
        }
        return sell;
    }
}