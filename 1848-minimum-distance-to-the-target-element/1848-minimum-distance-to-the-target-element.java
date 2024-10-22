class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int ans = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==target){
                ans = Math.abs(i-start)<0 ? 0 : Math.abs(i-start);
                break;
            }
        }
        return ans;
    }
}