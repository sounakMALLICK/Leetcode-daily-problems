class Solution {
    public int maxScore(String s) {
        int max=0;
        int i=0;
        for(int j=1; j<s.length(); j++){
            int x = countZeros(s.substring(i,j));
            int y = countOnes(s.substring(j,s.length()));
            max = Math.max(max, x+y);
        }
        return max;
    }
    public int countZeros(String s){
        int count=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='0'){
                count++;
            }
        }
        return count;
    }
    public int countOnes(String s){
        int count=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='1'){
                count++;
            }
        }
        return count;
    }
}