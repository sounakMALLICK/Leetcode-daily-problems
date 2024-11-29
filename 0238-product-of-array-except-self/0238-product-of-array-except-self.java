class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int pref[] = new int[n];
        pref[0] = nums[0];
        for(int i=1; i<n; i++){
            pref[i] = pref[i-1]*nums[i];
        }
        int ans[] = new int[n];
        int suff = 1;
        for(int i=n-1; i>0; i--){
            ans[i] = pref[i-1]*suff;
            suff *= nums[i];
        }
        ans[0] = suff;
        return ans;
    }
}