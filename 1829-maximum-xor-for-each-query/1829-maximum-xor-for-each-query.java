class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int prefXor[] = prefixXorArr(nums);
        int n = nums.length;
        int ans[] = new int[n];
        int maxBit = (1<<maximumBit) - 1;
        int j = n-1;
        for(int i=0; i<n; i++){
            int xor = prefXor[j--];
            int k = 0;
            while(k<=maxBit){
                if((xor ^ k) == maxBit){
                    ans[i] = k;
                    break;
                }
                k++;
            }
        }
        return ans;
    }
    public int[] prefixXorArr(int nums[]){
        int temp[] = new int[nums.length];
        temp[0] = nums[0];
        for(int i=1; i<nums.length; i++){
            temp[i] = nums[i] ^ temp[i-1];
        }
        return temp;
    }
}