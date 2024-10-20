class Solution {
    public int[] findErrorNums(int[] nums) {
        int ans[] = new int[2];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<nums.length; i++)
        {
            if(!(list.contains(nums[i]))){
                list.add(nums[i]);
            }
            else{
                ans[0] = nums[i];
            }
        }
        for(int i=1; i<=nums.length; i++){
            if(!(list.contains(i))){
                ans[1] = i;
                break;
            }
        }
        return ans;
    }
}