class Solution {
    public int climbStairs(int n) {
        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        int ans = climbStairsHelper(n, dp);
        return ans;
    }
    public int climbStairsHelper(int n, int dp[]){
        if(n==1 || n==2){
            return n;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int x = climbStairsHelper(n-1, dp);
        int y = climbStairsHelper(n-2, dp);
        dp[n] = x+y;
        return x+y;
    }
}