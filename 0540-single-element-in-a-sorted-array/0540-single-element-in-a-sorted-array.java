class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        if(nums[0] != nums[1]){
            return nums[0];
        }
        if(nums[nums.length-1]!=nums[nums.length-2]){
            return nums[nums.length-1];
        }
        int i=2; 
        int j=nums.length-3;
        while(i<=j){
            int mid = i + (j-i)/2;
            if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]){
                return nums[mid];
            }
            if(nums[mid]==nums[mid-1]){
                mid--;
            }
            if(mid%2==0){
                i = mid+2;
            }
            else if(mid%2!=0){
                j = mid-1;
            }
        }
        return -1;
    }
}