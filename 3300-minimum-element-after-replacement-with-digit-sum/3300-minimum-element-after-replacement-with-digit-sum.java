class Solution {
    public int minElement(int[] nums) {
        int min = nums[0];
        for(int i=0; i<nums.length; i++){
            nums[i] = sumOfDigits(nums[i]);
            if(min>nums[i]){
                min = nums[i];
            }
        }
        return min;
    }
    public int sumOfDigits(int n){
        int sum = 0;
        while(n!=0){
            sum += n%10;
            n /= 10;
        }
        return sum;
    }
}