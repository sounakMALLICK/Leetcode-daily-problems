class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])==false){
                map.put(nums[i],1);
            }
            else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        int max = 0;
        for(int i=0; i<nums.length; i++){
            if(map.get(nums[i])>max){
                max = nums[i];
            }
        }
        return max;
    }
}