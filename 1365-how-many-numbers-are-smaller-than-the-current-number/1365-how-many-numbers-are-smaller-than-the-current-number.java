class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        for(int i=0; i<n; i++){
            int c=0;
            for(int j=0; j<n; j++){
                if(i!=j){
                    if(nums[i]>nums[j]){
                        c++;
                    }
                }
            }
            ans[i] = c;
        }
        return ans;
    }
}