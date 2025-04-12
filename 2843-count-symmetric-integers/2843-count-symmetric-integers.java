class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int ans = 0;
        for(int i=low; i<=high; i++){
            if(isSymmetric(i)){
                ans++;
            }
        }
        return ans;
    }
    public int countDigits(int n){
        int c = 0;
        int m = n;
        while(m!=0){
            c++;
            m /= 10;
        }
        return c;
    }
    public boolean isSymmetric(int n){
        int lSum = 0;
        int rSum = 0;
        int cd = countDigits(n);
        if(cd%2!=0){
            return false;
        }
        else{
            int c = cd/2;
            while(c-->0){
                rSum += (n%10);
                n /= 10;
            }
            while(n!=0){
                lSum += (n%10);
                n /= 10;
            }
            return lSum==rSum;
        }
    }
}