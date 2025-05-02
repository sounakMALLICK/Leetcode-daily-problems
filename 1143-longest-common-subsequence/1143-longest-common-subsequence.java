class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();

        //If both the strings are equal..
        if(text1.equals(text2)){
            return m;
        }

        int dp[][] = new int[m][n];
        for(int i=0; i<m; i++){
            Arrays.fill(dp[i],-1);
        }

        int ans = lcs(text1, m-1, text2, n-1, dp);
        return ans;
    }
    public int lcs(String text1, int i, String text2, int j, int dp[][]){
        if(i==-1 || j==-1){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(text1.charAt(i)==text2.charAt(j)){
            int x = lcs(text1, i-1, text2, j-1, dp);
            dp[i][j] = x+1;
            return x+1;
        }
        else{
            int x = lcs(text1, i-1, text2, j, dp);
            int y = lcs(text1, i, text2, j-1, dp);
            dp[i][j] = Math.max(x,y);
            return Math.max(x,y);
        }
    }
}