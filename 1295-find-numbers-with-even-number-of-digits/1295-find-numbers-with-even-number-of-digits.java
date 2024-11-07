class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(isEvenCount(nums[i])){
                count++;
            }
        }
        return count;
    }
    public boolean isEvenCount(int n){
        int c=0;
        while(n!=0){
            c++;
            n/=10;
        }
        return c%2==0;
    }
}