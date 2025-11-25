class Solution {
    public int smallestRepunitDivByK(int k) {
        int rem = 1%k;
        for(int i=1; i<=k; i++){
            if(rem==0){
                return i;
            }
            rem = (rem*10 + 1) % k;
        }
        return -1;
    }
}