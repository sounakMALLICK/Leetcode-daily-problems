class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for(int i=0; i<nums.length; i++){
            xor ^= nums[i];
        }
        int idx = 0;
        for(int i=0; i<32; i++){
            if((xor & (1<<i)) != 0){
                idx = i;
                break;
            }
        }

        int set1=0;
        int set2=0;
        for(int i=0; i<nums.length; i++){
            if((nums[i] & (1<<idx)) != 0){
                set2 ^= nums[i];
            }
            else{
                set1 ^= nums[i];
            }
        }
        return new int[] {set1, set2};
    }
}