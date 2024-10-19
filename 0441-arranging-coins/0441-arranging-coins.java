class Solution {
    public int arrangeCoins(int n) {
        int filled = 0;
        int count=0;
        int m = n;
        for(int i=1; i<=n; i++){
            filled = m-i;
            if(filled>=0){
                count++;
            }
            else{
                break;
            }
            m = filled;
        }
        return count;
    }
}