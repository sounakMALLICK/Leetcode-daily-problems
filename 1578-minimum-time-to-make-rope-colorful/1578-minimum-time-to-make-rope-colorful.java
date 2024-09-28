class Solution {
    public int minCost(String colors, int[] neededTime) {
        int minTime = 0;
        char[] colours = colors.toCharArray();
        for(int i = 0; i < colours.length - 1; i++) {
            if(colours[i] == colours[i+1]) {
                if(neededTime[i] <= neededTime[i+1]) {
                    minTime += neededTime[i];
                } else {
                    minTime += neededTime[i+1];
                    neededTime[i+1] = neededTime[i];
                } 
            }
        }
        return minTime;
    }
}