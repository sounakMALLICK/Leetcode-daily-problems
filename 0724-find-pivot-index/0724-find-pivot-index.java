class Solution {
    public int pivotIndex(int[] nums) {
        int prefixArr[] = new int[nums.length];
        int n = nums.length;
        prefixArr[0] = nums[0];
        for(int i=1; i<n; i++){
            prefixArr[i] = prefixArr[i-1]+nums[i]; 
        }

        if(prefixArr[n-1]-prefixArr[0]==0){
            return 0;
        }
        for(int i=1; i<n; i++){
            if(prefixArr[i-1] == (prefixArr[n-1]-prefixArr[i])){
                return i;
            }
        }
        if(prefixArr[n-2]==0){
            return n-1;
        }
        return -1;
    }
}