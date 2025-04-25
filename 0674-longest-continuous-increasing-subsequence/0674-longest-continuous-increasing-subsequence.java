class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int max = 1;
        int count = 1;
        for(int i=1; i<nums.length; i++){
            if(nums[i-1]<nums[i]){
                count++;
            }
            else{
                max = Math.max(max, count);
                count = 1;
            }
        }
        return Math.max(max, count);
    }
}