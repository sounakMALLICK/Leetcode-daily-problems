class Solution {
    public int countOdds(int low, int high) {
        if(high%2==1){
            high++;
        }
        return (high-low+1)/2;
    }
}