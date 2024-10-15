class Solution {
    public boolean checkRecord(String s) {
        int countA = 0;
        int countL = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='A'){
                countA++;
            }
            if(s.charAt(i)=='A' || s.charAt(i)=='P'){
                if(countL<3){
                    countL = 0;
                }
            }
            else if(s.charAt(i)=='L'){
                countL++;
            }
        }
        if(countA<2 && countL<3){
            return true;
        }
        return false;
    }
}