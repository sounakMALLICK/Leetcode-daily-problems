class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        int ans = -1; // for index
        while(low<=high){
            int mid = low + (high-low)/2;

            if(nums[mid]>nums[high]){
                //sorted from low to mid and minimum element is nums[low]
                if(ans==-1 || nums[low]<nums[ans]){
                    ans = low;
                }
                low = mid+1;
            }
            else{
                //sorted from mid to high and minimum element is nums[mid]
                if(ans==-1 || nums[mid]<nums[ans]){
                    ans = mid;
                }
                high = mid-1;
            }
        }
        return nums[ans];
    }
}