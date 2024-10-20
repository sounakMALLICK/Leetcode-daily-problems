class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(!(list1.contains(nums[i]))){
                list1.add(nums[i]);
            }
            else{
                list2.add(nums[i]);
            }
        }
        return new int[]{list2.get(0),list2.get(1)};
    }
}