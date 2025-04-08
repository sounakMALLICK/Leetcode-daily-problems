class Solution {
    public int minimumOperations(int[] nums) {
        int i=0;
        int count=0;
        while(i<nums.length){
            if(isUnique(nums, i)){
                break;
            }
            else{
                i+=3;
                count++;
            }
        }
        return count;
    }
    public boolean isUnique(int nums[], int i){
        Set<Integer> set = new HashSet<>();
        for(int k=i; k<nums.length; k++){
            if(set.contains(nums[k])){
                return false;
            }
            set.add(nums[k]);
        }
        return true;
    }
}