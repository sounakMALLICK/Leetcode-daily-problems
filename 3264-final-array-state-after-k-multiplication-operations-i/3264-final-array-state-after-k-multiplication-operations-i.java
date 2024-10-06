class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int i = 1;
        while(i<=k){
            int idx = minimum(nums);
            nums[idx] *= multiplier;
            i++;
        }
        return nums;
    }
    public int minimum(int nums[]){
        int min = nums[0];
        int idx = 0;
        for(int i=1; i<nums.length; i++){
            if(min>nums[i]){
                min = nums[i];
                idx = i;
            }
        }
        return idx;
    }
}