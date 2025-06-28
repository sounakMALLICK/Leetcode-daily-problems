class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int n = nums.length;
        int temp[][] = new int[n][2];
        for(int i=0; i<n; i++){
            temp[i][0] = i; //Original Index Value
            temp[i][1] = nums[i]; //Value at that index..
        }
        //Sorting in increasing order to the values;
        Arrays.sort(temp, (a,b)->b[1]-a[1]);
        //Sorting the first k elements to the indexes;
        Arrays.sort(temp, 0, k, (a,b)->a[0]-b[0]);

        int ans[] = new int[k];
        for(int i=0; i<k; i++){
            ans[i] = temp[i][1];
        }
        return ans;
    }
}