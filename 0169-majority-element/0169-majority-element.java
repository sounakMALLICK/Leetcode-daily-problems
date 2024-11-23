class Solution {
    public int majorityElement(int[] nums) {
        int val = nums[0];
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==val){
                count++;
            }
            else{
                if(count==0){
                    val = nums[i];
                    count++;
                }
                else{
                    count--;
                }
            }
        }
        return val;
    }
}