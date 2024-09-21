class Solution {
    public String largestOddNumber(String num) {
        String ans = "";
        if(num.charAt(num.length()-1)%2==1){
            return num;
        }
        for(int i=0; i<num.length()-1; i++){
            if(num.charAt(i)%2==1){
                ans = num.substring(0,i+1);
            }
        }
        return ans;
    }
}