class Solution {
    public int tribonacci(int n) {
        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        return tribonacciHelper(n, dp);
    }
    public int tribonacciHelper(int n, int dp[]) {
        if(n<=1){ return n; }
        if(n==2){ return 1; }
        if(dp[n]!=-1){ return dp[n]; }
         
        int temp1 = tribonacciHelper(n-1, dp);
        int temp2 = tribonacciHelper(n-2, dp);
        int temp3 = tribonacciHelper(n-3, dp);
        dp[n] = temp1+temp2+temp3;
        return temp1+temp2+temp3;
    }
}