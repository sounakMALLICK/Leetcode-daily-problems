class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int dp[][] = new int[m][n];
        for(int i=0; i<m; i++){
            Arrays.fill(dp[i], -1);
        }
        return minDistanceHelper(word1, m-1, word2, n-1, dp);
    }
    public int minDistanceHelper(String s1, int i, String s2, int j, int dp[][]){
        if(i==-1 && j==-1){
            return 0;
        }
        if(i==-1 && j!=-1){
            return j+1;
        }
        if(i!=-1 && j==-1){
            return i+1;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(s1.charAt(i)==s2.charAt(j)){
            //No operations will be done..
            int x = minDistanceHelper(s1, i-1, s2, j-1, dp);
            dp[i][j] = x;
            return x;
        }
        else{
            //delete..
            int x = minDistanceHelper(s1, i-1, s2, j, dp);
            //insert..
            int y = minDistanceHelper(s1, i, s2, j-1, dp);
            //replace..
            int z = minDistanceHelper(s1, i-1, s2, j-1, dp);
            dp[i][j] = Math.min(Math.min(x,y),z)+1;
            return Math.min(Math.min(x,y),z)+1;
        }
    }
}