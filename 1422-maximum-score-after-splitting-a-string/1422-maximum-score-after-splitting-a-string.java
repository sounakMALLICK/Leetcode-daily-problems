class Solution {
    public int maxScore(String s) {
        int max = 0;
        int ones = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='1'){
                ones++;
            }
        }

        int zeros = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='0'){
                zeros++;
            }
            else{
                ones--;
            }
            max = Math.max(max, ones+zeros);
        }
        return max;
    }
}