class Solution {
    public boolean isHappy(int n) {
        if(n<0){
            return false;
        }
        int m = n;
        while(m>=10){
          m =  sumOfDigitsSquared(m);
        }
        return m==1 || m==7;
    }
    public int sumOfDigitsSquared(int n){
        int sum = 0;
        while(n!=0){
            sum += ((n%10)*(n%10));
            n /= 10;
        }
        return sum;
    }
}