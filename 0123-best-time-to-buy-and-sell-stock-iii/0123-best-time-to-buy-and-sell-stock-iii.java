class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int left[] = new int[n];
        int right[] = new int[n];

        //for left partition..
        int min = prices[0];
        int profit = 0;
        for(int i=1; i<n; i++){
            if(prices[i]<min){
                min = prices[i];
            }
            profit = Math.max(profit, prices[i]-min);
            left[i] = profit;
        }

        //for right partition..
        int max = prices[n-1];
        profit = 0;
        for(int i=n-2; i>=0; i--){
            if(prices[i]>max){
                max = prices[i];
            }
            profit = Math.max(profit, max-prices[i]);
            right[i] = profit;
        }

        int ans = 0;
        for(int i=0; i<n; i++){
            ans = Math.max(ans, left[i]+right[i]);
        }
        return ans;
    }
}