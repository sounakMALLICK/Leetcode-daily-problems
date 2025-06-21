class Solution {
    public int maxDistance(String s, int k) {
        int maxMD = 0;
        int north=0, south=0, east=0, west=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='N'){
                north++;
            }
            else if(s.charAt(i)=='S'){
                south++;
            }
            else if(s.charAt(i)=='E'){
                east++;
            }
            else if(s.charAt(i)=='W'){
                west++;
            }

            int steps = i+1;
            int currMD = Math.abs(east-west) + Math.abs(north-south);
            int wasted = steps-currMD;

            int extra = 0;
            if(wasted != 0){
                extra = Math.min(2*k, wasted);
            }

            int finalCurrMD = currMD + extra;
            maxMD = Math.max(finalCurrMD, maxMD);
        }
        return maxMD;
    }
}