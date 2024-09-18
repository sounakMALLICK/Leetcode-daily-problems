class Solution {
    public int findMiddleIndex(int[] nums) {
        int prefSum[] = prefixArray(nums);
        int suffSum[] = suffixArray(nums);
        for(int i=0; i<nums.length; i++){
            if(prefSum[i]==suffSum[i]){
                return i;
            }
        }
        return -1;
    }
    public int[] prefixArray(int[] nums){
        int temp[] = new int[nums.length];
        temp[0] = nums[0];
        for(int i=1; i<nums.length; i++){
            temp[i] = temp[i-1]+nums[i];
        }
        return temp;
    }
    public int[] suffixArray(int[] nums){
        int temp[] = new int[nums.length];
        temp[temp.length-1] = nums[nums.length-1];
        for(int i=nums.length-2; i>=0; i--){
            temp[i] = temp[i+1]+nums[i];
        }
        return temp;
    }
}