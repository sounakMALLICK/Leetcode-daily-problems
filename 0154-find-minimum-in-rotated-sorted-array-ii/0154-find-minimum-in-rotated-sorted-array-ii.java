class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        int ans = -1; // for index
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[low]==nums[mid] && nums[mid]==nums[high]){
                low++;
                high--;
                if(ans==-1 || nums[ans]>nums[mid]){
                        ans = mid;
                    }
            }
            else{
                if(nums[mid]>nums[high]){
                    //low to mid is sorted..
                    if(ans==-1 || nums[ans]>nums[low]){
                        ans = low;
                    }
                    low = mid+1;
                }
                else{
                    //mid to low is sorted..
                    if(ans==-1 || nums[ans]>nums[mid]){
                        ans = mid;
                    }
                    high = mid-1;
                }
            }
        }
        return nums[ans];
    }
}