class Solution {
    public boolean isPalindrome(int x) {
        int rev = 0;
        int n = x;
        while(x!=0){
            rev = rev*10 + (x%10);
            x /= 10;
        }
        return rev<0 ? false : (rev==n);
    }
}