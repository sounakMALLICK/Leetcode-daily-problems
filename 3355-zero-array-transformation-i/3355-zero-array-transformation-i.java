class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int n = nums.length;
        int temp[] = new int[n+1];
        for(int i=0; i<queries.length; i++){
            temp[queries[i][0]]++;
            temp[queries[i][1]+1]--;
        }
        int pref[] = new int[n];
        pref[0] = temp[0];
        for(int i=1; i<n; i++){
            pref[i] = pref[i-1]+temp[i];
        }
        for(int i=0; i<n; i++){
            if(nums[i]-pref[i]>0){
                return false;
            }
        }
        return true;
    }
}