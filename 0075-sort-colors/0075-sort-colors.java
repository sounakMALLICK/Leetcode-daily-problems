class Solution {
    public void sortColors(int[] nums) {
        int i=0, k=nums.length-1;
        int j=0;
        while(j<=k){
            if(nums[j]==0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                i++; j++;
            }
            else if(nums[j]==1){
                j++;
            }
            else{
                int temp = nums[j];
                nums[j] = nums[k];
                nums[k] = temp;

                k--;
            }
        }
    }
}