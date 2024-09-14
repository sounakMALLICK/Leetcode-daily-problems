class Solution {
    public int largestAltitude(int[] gain) {
        int prefixArr[] = prefixSum(gain);
        int max = prefixArr[0];
        for(int i=1; i<prefixArr.length; i++){
            if(max<prefixArr[i]){
                max = prefixArr[i];
            }
        }
        return max;
    }
    public int[] prefixSum(int[] gain){
        int[] temp = new int[gain.length+1];
        temp[0] = 0;
        for(int i=1; i<temp.length; i++){
            temp[i] = temp[i-1]+gain[i-1];
        }
        return temp;
    }
}