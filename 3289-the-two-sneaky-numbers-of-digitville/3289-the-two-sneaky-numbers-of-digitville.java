class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] ans = new int[2];
        HashSet<Integer> set = new HashSet<>();
        int k = 0;
        for(int n : nums){
            if(set.contains(n)){
                ans[k++] = n;
                set.remove(n);
            }
            if(k==2){
                break;
            }
            set.add(n);
        }
        return ans;
    }
}