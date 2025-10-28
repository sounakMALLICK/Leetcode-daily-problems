class Solution {
    public int countValidSelections(int[] nums) {
        int ans = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                if(condition1(nums, i)){
                    ans++;
                }
                if(condition2(nums, i)){
                    ans++;
                }
            }
        }
        return ans;
    }
    // Move left
    public boolean condition1(int[] nums, int idx){
        int[] temp = Arrays.copyOf(nums, nums.length);
        int dir = -1;
        while(idx>=0 && idx<nums.length){
            if(temp[idx]>0){
                temp[idx]--;
                dir *= -1;
            }
            idx += dir;
        }
        for(int i=0; i<temp.length; i++){
            if(temp[i]!=0){
                return false;
            }
        }
        return true;
    }

    // Move right
    public boolean condition2(int[] nums, int idx){
        int[] temp = Arrays.copyOf(nums, nums.length);
        int dir = 1;
        while(idx>=0 && idx<nums.length){
            if(temp[idx]>0){
                temp[idx]--;
                dir *= -1;
            }
            idx += dir;
        }
        for(int i=0; i<temp.length; i++){
            if(temp[i]!=0){
                return false;
            }
        }
        return true;
    }
}