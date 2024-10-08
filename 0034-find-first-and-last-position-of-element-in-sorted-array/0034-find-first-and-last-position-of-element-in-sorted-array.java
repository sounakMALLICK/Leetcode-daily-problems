class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[] = new int[2];
        Arrays.fill(ans,-1);
        for(int i=0; i<nums.length; i++){
            if(nums[i]==target){
                ans[0] = i;
                break;
            }
        }
        for(int i=nums.length-1; i>=0; i--){
            if(nums[i]==target){
                ans[1] = i;
                break;
            }
        }
        if(ans[0]!=-1 && ans[0]==ans[1]){
            ans[1] = -1;
        }
        return ans;
    }
}