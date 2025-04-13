class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid[0][0]==1){
            return 0;
        }
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int dp[][] = new int[m][n];
        for(int i=0; i<m; i++){
            Arrays.fill(dp[i],-1);
        }
        return uniquePathsWithObstaclesHelper(obstacleGrid, m-1, n-1, dp);
    }
    public int uniquePathsWithObstaclesHelper(int[][] obstacleGrid, int m, int n, int dp[][]){
        if(m<0 || n<0){
            return 0;
        }
        if(m==0 && n==0){
            return 1;
        }
        if(obstacleGrid[m][n]==1){
            return 0;
        }
        if(dp[m][n]!=-1){
            return dp[m][n];
        }
        int x = uniquePathsWithObstaclesHelper(obstacleGrid, m-1, n, dp);
        int y = uniquePathsWithObstaclesHelper(obstacleGrid, m, n-1, dp);

        dp[m][n] = x+y;
        return x+y;
    }
}