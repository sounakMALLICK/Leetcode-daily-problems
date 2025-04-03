class Solution {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        int prefMax[] = new int[n];
        int suffMax[] = new int[n];

        prefMax[0] = nums[0];
        for(int i=1; i<nums.length; i++){
            prefMax[i] = Math.max(prefMax[i-1],nums[i-1]);
        }

        suffMax[n-1] = nums[n-1];
        for(int i=nums.length-2; i>=0; i--){
            suffMax[i] = Math.max(suffMax[i+1],nums[i+1]);
        }

        long ans = 0;
        for(int i=1; i<n-1; i++){
            ans = Math.max(ans, (long) (prefMax[i]-nums[i])*suffMax[i]);
        }
        return ans;
    }
}