class Solution {
    public int subarraySum(int[] nums) {
        int ans = 0;
        int n = nums.length;
        int pref[] = new int[n];
        pref[0] = nums[0];
        for(int i=1; i<n; i++){
            pref[i] = nums[i]+pref[i-1];
        }
        for(int i=0; i<n; i++){
            int start = Math.max(0, i-nums[i]);
            if(start==0){
                ans += pref[i];
            }
            else{
                ans += (pref[i]-pref[start-1]);
            }
        }
        return ans;
    }
}