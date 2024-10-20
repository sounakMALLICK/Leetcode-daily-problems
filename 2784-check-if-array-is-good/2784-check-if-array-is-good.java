class Solution {
    public boolean isGood(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int max = nums[n-1];
        if(n != max+1){
            return false;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        if(map.get(max)!=2){
            return false;
        }
        if(n==2){
            if(nums[0]==max && nums[1]==max){
                return true;
            }
            else{
                return false;
            }
        }
        for(int i=0; i<n-3; i++){
            if(map.get(nums[i])>1){
                return false;
            }
        }
        return true;
    }
}