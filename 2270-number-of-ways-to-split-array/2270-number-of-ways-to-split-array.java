class Solution {
    public int waysToSplitArray(int[] nums) {
        int n = nums.length;
        long prefSum[] = new long[n];
        prefSum[0] = nums[0];
        for(int i=1; i<n; i++){
            prefSum[i] = nums[i]+prefSum[i-1];
        }

        long suffSum[] = new long[n];
        suffSum[n-1] = nums[n-1];
        for(int i=n-2; i>=0; i--){
            suffSum[i] = nums[i]+suffSum[i+1];
        }

        int countWays = 0;
        for(int i=0; i<n-1; i++){
            if(prefSum[i] >= suffSum[i+1]){
                countWays++;
            }
        }
        return countWays;
    }
}