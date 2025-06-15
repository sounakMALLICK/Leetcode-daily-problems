class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;

        for(int i=0; i<n-2; i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int s = i+1;
            int e = n-1;
            int target = -nums[i];
            while(s<e){
                int sum = nums[s]+nums[e];
                if(sum==target){
                    while(s<e && nums[s]==nums[s+1]){
                        s++;
                    }
                    while(s<e && nums[e]==nums[e-1]){
                        e--;
                    }
                    List<Integer> l = new ArrayList<>();
                    l.add(nums[i]);
                    l.add(nums[s]);
                    l.add(nums[e]);
                    list.add(l);
                    s++;
                    e--;
                }
                else if(sum>target){
                    e--;
                }
                else{
                    s++;
                }
            }
        }
        return list;
    }
}