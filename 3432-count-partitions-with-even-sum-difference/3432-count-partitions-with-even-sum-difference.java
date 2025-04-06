class Solution {
    public int countPartitions(int[] nums) {
        int count = 0;
        int n = nums.length;
        int pref[] = new int[n];
        pref[0] = nums[0];
        for(int i=1; i<n; i++){
            pref[i] = nums[i]+pref[i-1];
        }
        for(int i=0; i<n-1; i++){
            int s = pref[i];
            int e = pref[n-1]-s;
            if((s-e)%2==0){
                count++;
            }
        }
        return count;
    }
}