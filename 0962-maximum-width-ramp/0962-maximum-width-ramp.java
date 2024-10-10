class Solution {
    public int maxWidthRamp(int[] nums) {
        int max=0;
        int diff=0;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[j]>=nums[i]){
                    diff = j-i;
                }
            }
            max = Math.max(max, diff);
        }
        if(max>=0){
            return max;
        }
        return 0;
    }
}