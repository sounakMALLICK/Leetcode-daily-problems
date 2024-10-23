class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for(int i=0; i<32; i++){
            int count = 0;
            for(int j=0; j<nums.length; j++){
                if(isSetBit(nums[j], i)){
                    count++;
                }
            }
            if(count%3==1){
                ans += (1<<i);
            }
        }
        return ans;
    }

    public boolean isSetBit(int n, int i){
        if((n & (1<<i)) == 0){
            return false;
        }
        return true;
    }
}