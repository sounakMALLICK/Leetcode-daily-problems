class Solution {
    public long flowerGame(int n, int m) {
        long ans = ((long)(n/2) * (long)((m+1)/2)) + (long)((m/2) * (long)((n+1)/2));
        return ans;
    }
}