class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i=1; i<nums.length; i++){
            int diff = Math.abs(nums[i]-nums[i-1]);
            max = Math.max(max, diff);
        }
        max = Math.max(max, Math.abs(nums[nums.length-1]-nums[0]));
        return max;
    }
}