class Solution {
    public boolean isBalanced(String num) {
        int evenSum = 0;
        int oddSum = 0;
        for(int i=0; i<num.length(); i+=2){
            evenSum += (num.charAt(i)-'0');
        }
        for(int i=1; i<num.length(); i+=2){
            oddSum += (num.charAt(i)-'0');
        }
        return evenSum == oddSum;
    }
}