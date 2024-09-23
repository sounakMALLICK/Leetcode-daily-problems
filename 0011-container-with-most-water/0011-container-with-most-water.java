class Solution {
    public int maxArea(int[] height) {
        int i=0, j=height.length-1;
        int ans = 0;
        while(i<j){
            int water = (j-i)*(Math.min(height[i], height[j]));
            ans = Math.max(ans, water);
            if(height[i]>height[j]){
                j--;
            }
            else{
                i++;
            }
        }
        return ans;
    }
}