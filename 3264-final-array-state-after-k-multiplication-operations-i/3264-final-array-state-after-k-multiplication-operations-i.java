class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for(int i=1; i<=k; i++){
            int minIdx = minIndex(nums);
            nums[minIdx] *= multiplier;
        }
        return nums;
    }
    public int minIndex(int nums[]){
        int idx = 0;
        for(int i=1; i<nums.length; i++){
            if(nums[idx]>nums[i]){
                idx = i;
            }
        }
        return idx;
    }
}