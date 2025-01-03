class Solution {
    public int waysToSplitArray(int[] nums) {
        int n = nums.length;
        int countWays = 0;
        long lSum = 0;
        long rSum = 0;
        for(int i=0; i<n; i++){
            rSum += nums[i];
        }
        for(int i=0; i<n-1; i++){
            lSum += nums[i];
            rSum -= nums[i];
            if(lSum >= rSum){
                countWays++;
            }
        }
        return countWays;
    }
}