class Solution {
    public long maximumTripletValue(int[] nums) {
        long ans = 0;
        for(int i=0; i<=nums.length-3; i++){
            for(int j=i+1; j<=nums.length-2; j++){
                for(int k=j+1; k<=nums.length-1; k++){
                    ans = Math.max(ans, (nums[i]-nums[j])*nums[k]);
                }
            }
        }
        return ans;
    }
}