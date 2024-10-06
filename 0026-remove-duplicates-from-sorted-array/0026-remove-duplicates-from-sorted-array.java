class Solution {
    public int removeDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(!list.contains(nums[i])){
                list.add(nums[i]);
            }
        }
        for(int i=0; i<list.size(); i++){
            nums[i] = list.get(i);
        }
        for(int i=list.size(); i<nums.length; i++){
            nums[i]=0;
        }
        return list.size();
    }
}