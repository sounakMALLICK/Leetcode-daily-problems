class Solution {
    public int climbStairs(int n) {
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        return climbStairsHelper(n, dp);
    }
    public int climbStairsHelper(int n, int dp[]){
        if(n==1 || n==2){
            return n;
        }
        if(dp[n]!=-1){
            return dp[n];
        }

        int temp1 = climbStairsHelper(n-1, dp);
        int temp2 = climbStairsHelper(n-2, dp);

        dp[n] = temp1 + temp2;
        return temp1 + temp2;
    }
}