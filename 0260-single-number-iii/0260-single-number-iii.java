class Solution {
    public int[] singleNumber(int[] nums) {
        int ans[] = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(!(map.containsKey(nums[i]))){
                map.put(nums[i],1);
            }
            else{
                map.put(nums[i], map.get(nums[i])+1);
            }
        }
        int j=0;
        for(int i=0; i<nums.length; i++){
            if(map.get(nums[i])==1){
                ans[j++]=nums[i];
                if(j==2){
                    break;
                }
            }
        }
        return ans;
    }
}