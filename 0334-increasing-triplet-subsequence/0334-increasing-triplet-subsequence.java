class Solution {
    public boolean increasingTriplet(int[] nums) {
        int n = nums.length;
        int dp[] = new int[n];
        int ans = 0;
        for(int i=0; i<n; i++){
            int low=0, high=ans;
            while(low<high){
                int mid = low + (high-low)/2;
                if(dp[mid]<nums[i]){
                    low = mid+1;
                }
                else{
                    high = mid;
                }
            }
            dp[low] = nums[i];
            if(low==ans){
                ans++;
            }
            if(ans>=3){
                return true;
            }
        }
        return false;
    }
}