class Solution {
    public int minCost(String colors, int[] neededTime) {
        int sum = 0;
        int min = 0;
        for(int i=0; i<colors.length()-1; i++){
            if(colors.charAt(i)==colors.charAt(i+1)){
                min = Math.min(neededTime[i], neededTime[i+1]);
                sum += min;
            }
        }
        return sum;
    }
}