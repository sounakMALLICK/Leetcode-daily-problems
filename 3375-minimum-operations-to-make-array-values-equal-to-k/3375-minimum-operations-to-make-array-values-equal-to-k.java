class Solution {
    public int minOperations(int[] nums, int k) {
        Set<Integer> set =  new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(!set.contains(nums[i]) && nums[i]>k){
                set.add(nums[i]);
            }
        }
        if(set.size()==0){
            return -1;
        }
        return set.size();
    }
}