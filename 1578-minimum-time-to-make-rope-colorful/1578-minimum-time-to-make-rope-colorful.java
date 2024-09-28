class Solution {
    public int minCost(String colors, int[] neededTime) {
        int sum = 0;
        int max = neededTime[0];
        for(int i=1; i<colors.length(); i++){
            if(colors.charAt(i-1)==colors.charAt(i)){
                int min = Math.min(neededTime[i], max);
                sum += min;
                max = Math.max(neededTime[i], max);
            }
            else{
                max = neededTime[i];
            }
        }
        return sum;
    }
}