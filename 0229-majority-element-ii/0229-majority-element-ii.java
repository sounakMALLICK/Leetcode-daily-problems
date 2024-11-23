class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        int v1 = nums[0];
        int c1 = 0;

        int v2 = nums[0];
        int c2 = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] == v1){
                c1++;
            }
            else if(nums[i] == v2){
                c2++;
            }
            else if(c1 == 0){
                v1 = nums[i];
                c1++;
            }
            else if(c2 == 0){
                v2 = nums[i];
                c2++;
            }
            else{
                c1--;
                c2--;
            }
        }

        int count1=0, count2=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==v1){
                count1++;
            }
            else if(nums[i]==v2){
                count2++;
            }
        }

        if(count1>nums.length/3)
        ans.add(v1);
        if(count2>nums.length/3)
        ans.add(v2);

        return ans;
    }
}