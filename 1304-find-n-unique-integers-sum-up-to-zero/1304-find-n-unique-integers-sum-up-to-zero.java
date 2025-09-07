class Solution {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        for(int i=0; i<n; i+=2){
            ans[i]=i+1;
            if(i+1<n){
                ans[i+1] = -(i+1);
            }
        }
        if(n%2==1){
            ans[n-1] = 0;
        }
        return ans;
    }
}