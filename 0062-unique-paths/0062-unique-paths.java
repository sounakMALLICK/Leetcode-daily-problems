class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][] = new int[m][n];
        for(int i=0; i<m; i++){
            Arrays.fill(dp[i], -1);
        }
        return uniquePathsHelper(m-1, n-1, dp);
    }
    public int uniquePathsHelper(int i, int j, int dp[][]){
        if(i==0 || j==0){
            return 1;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        int x = uniquePathsHelper(i, j-1, dp);
        int y = uniquePathsHelper(i-1, j, dp);

        dp[i][j] = x+y;
        return x+y;
    }
}