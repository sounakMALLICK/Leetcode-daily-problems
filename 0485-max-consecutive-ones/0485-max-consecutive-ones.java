class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int consecutive = 0;
        int max_consecutive = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=1){
                consecutive = 0;
            }
            else{
                consecutive++;
            }
            max_consecutive = Math.max(consecutive, max_consecutive);
        }
        return max_consecutive;
    }
}