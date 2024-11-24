class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans[] = new int[2];
        for(int i=0; i<nums.length; i++){
                map.put(nums[i],i);
        }
        for(int i=0; i<nums.length; i++){
            int b = target - nums[i];
            if(map.containsKey(b) && map.get(b)!=i){
                ans[0] = i;
                ans[1] = map.get(b);
            }
        }
        return ans;
    }
}