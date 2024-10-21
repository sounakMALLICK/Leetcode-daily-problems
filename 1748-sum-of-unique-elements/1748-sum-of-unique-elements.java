class Solution {
    public int sumOfUnique(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            if(!(list.contains(nums[i]))){
                list.add(nums[i]);
                sum += nums[i];
            }
            else{
                sum -= nums[i];
            }
        }
        return sum<0?0:sum;
    }
}