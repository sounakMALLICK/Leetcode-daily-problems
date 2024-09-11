class Solution {
    public int matrixSum(int[][] nums) {
        int score = 0;
        for(int i=0; i<nums.length; i++){
            Arrays.sort(nums[i]);
        }
        for(int i=nums[0].length-1; i>=0; i--){
            int max = 0;
            for(int j=0; j<nums.length; j++){
                if(nums[j][i]>max){
                    max = nums[j][i];
                }
            }
            score += max;
        }
        return score;
    }
}