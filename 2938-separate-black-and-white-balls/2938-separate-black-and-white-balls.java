class Solution {
    public long minimumSteps(String s) {
        long swap = 0;
        int countBlack = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='0'){
                swap += (long) countBlack;
            }
            else{
                countBlack++;
            }
        }
        return swap;
    }
}