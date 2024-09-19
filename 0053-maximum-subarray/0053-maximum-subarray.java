class Solution {
    public int maxSubArray(int[] nums) {
        int prefSum[] = new int[nums.length];
        prefSum[0] = nums[0];
        for(int i=1; i<prefSum.length; i++){
            prefSum[i] = prefSum[i-1]+nums[i];
        }

        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int start=0; start<nums.length; start++){
            for(int end=start; end<nums.length; end++){
                if(start==0){
                    sum = prefSum[end];
                }
                else{
                    sum = prefSum[end]-prefSum[start-1];
                }
                max = Math.max(max, sum);
            }
        }
        return max;
    }
}