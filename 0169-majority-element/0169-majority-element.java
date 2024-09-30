class Solution {
    public int majorityElement(int[] nums) {
        int val = nums[0];
        int j = 1;
        for(int i=1; i<nums.length; i++){
            if(nums[i]==val){
                j++;
            }
            else{
                if(j==0){
                    val = nums[i];
                    j=1;
                }
                else{
                    j--;
                }
            }
        }
        return val;
    }
}