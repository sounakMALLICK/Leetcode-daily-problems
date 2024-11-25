class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            for(int j=i; j<nums.length; j++){
                int prod = 1;
                for(int k=i; k<=j; k++){
                    prod *= nums[k];
                }
                max = Math.max(max, prod);
            }
        }
        return max;
    }
}