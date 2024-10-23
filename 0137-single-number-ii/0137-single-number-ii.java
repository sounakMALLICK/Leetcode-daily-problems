class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(!(map.containsKey(nums[i]))){
                map.put(nums[i],1);
            }
            else{
                map.put(nums[i], map.get(nums[i])+1);
            }
        }
        int unique = nums[0];
        for(int i=0; i<nums.length; i++){
            if(map.get(nums[i])==1){
                unique = nums[i];
            }
        }
        return unique;
    }
}