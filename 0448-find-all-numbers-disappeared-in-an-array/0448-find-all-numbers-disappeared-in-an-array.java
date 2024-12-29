class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int f = map.getOrDefault(nums[i],0);
            map.put(nums[i], ++f);
        }
        for(int i=1; i<=nums.length; i++){
            if(map.getOrDefault(i,0) == 0){
                ans.add(i);
            }
        }
        return ans;
    }
}