class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int totalWater = 0;

        //prefix max
        int pref[] = new int[n];
        pref[0] = height[0];
        for(int i=1; i<n; i++){
            pref[i] = Math.max(pref[i-1],height[i]);
        }

        //suffix max
        int suff[] = new int[n];
        suff[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            suff[i] = Math.max(height[i],suff[i+1]);
        }

        for(int i=1; i<n-1; i++){
            int leftBlock = pref[i-1];
            int rightBlock = suff[i+1];
            int min = Math.min(leftBlock, rightBlock);
            int water = min-height[i];
            if(water>0){
                totalWater += water;
            }
        }
        return totalWater;
    }
}