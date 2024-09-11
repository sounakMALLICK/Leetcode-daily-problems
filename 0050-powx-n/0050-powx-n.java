class Solution {
    public double myPow(double x, int n) {
        int m=n;
        if(m<0){
            n = Math.abs(n);
        }
        double ans = pow(x, n);
        if(m<0){
            return 1/ans;
        }
        return ans;
    }
    public double pow(double x, int n){
        if(n==0){
            return 1;
        }
        double temp = pow(x, n/2);
        if(n%2 == 0){
            return temp*temp;
        }
        else{
            return temp*temp*x;
        }
    }
}