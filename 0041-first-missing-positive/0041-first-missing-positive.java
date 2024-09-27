class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int i = 0;
        while(i<n){
            if(nums[i]<1 || nums[i]>n || nums[i]==i+1){
                i++;
            }
            else{
                int index = nums[i]-1;
                if(nums[i]==nums[index]){
                    i++;
                }
                else{
                    swap(i, index, nums);
                }
            }
        }
        for(int j=0; j<n; j++){
            if(nums[j]!=j+1){
                return j+1;
            }
        }
            return n+1;
    }
    public void swap(int i, int j, int arr[]){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}