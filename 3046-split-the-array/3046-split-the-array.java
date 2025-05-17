class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int n : nums){
            map.put(n, map.getOrDefault(n, 0)+1);
        } 
        for(int i=0; i<nums.length; i++){
            if(map.get(nums[i])>2){
                return false;
            }
        }
        return true;
    }
}