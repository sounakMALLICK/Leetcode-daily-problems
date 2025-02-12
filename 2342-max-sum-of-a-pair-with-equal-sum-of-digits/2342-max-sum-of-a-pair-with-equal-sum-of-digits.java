class Solution {
    public int maximumSum(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = -1;
        for(int i=0; i<nums.length; i++){
            int sum = sumOfDigits(nums[i]);
            if(!map.containsKey(sum)){
                map.put(sum, nums[i]);
            }
            else{
                max = Math.max(max, map.get(sum)+nums[i]);
                int k = Math.max(nums[i], map.get(sum));
                map.put(sum, k);
            }
        }
        return max;
    }
    public int sumOfDigits(int num){
        int sum = 0;
        while(num!=0){
            sum += (num%10);
            num /= 10;
        }
        return sum;
    }
}