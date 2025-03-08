class Solution {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;
        int i=0;
        while(i<n-1){
            if(nums[i]==nums[i+1]){
                nums[i]*=2;
                nums[i+1]=0;
                i+=2;
            }
            else{
                i++;
            }
        }
        moveZeroes(nums);
        return nums;
    }
    public static void moveZeroes(int nums[]){
        int i=0;
        for(int j=0; j<nums.length; j++){
            if(nums[j]!=0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
    }
}