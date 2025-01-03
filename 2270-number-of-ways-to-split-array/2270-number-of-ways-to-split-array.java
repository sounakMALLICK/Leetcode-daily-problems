class Solution {
    public int waysToSplitArray(int[] nums) {
        int n = nums.length;
        long prefSum[] = new long[n];
        prefSum[0] = nums[0];
        for(int i=1; i<n; i++){
            prefSum[i] = nums[i]+prefSum[i-1];
        }

        int countWays = 0;
        for(int i=0; i<n-1; i++){
            if(prefSum[i] >= prefSum[n-1]-prefSum[i]){
                countWays++;
            }
        }
        return countWays;
    }
}