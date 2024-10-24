class Solution {
    public int divide(int dividend, int divisor) {
        int sign = 1;
        if(dividend<0){ 
            sign *= -1;
        }
        if(divisor<0){ 
            sign *= -1; 
        }

        long a = dividend;
        long b = divisor;
         a = Math.abs(a);
         b = Math.abs(b);

        long temp=0;
        long q=0;
        for(int i=31; i>=0; i--){
            if((temp + (b<<i)) <= a){
                temp += (b<<i);
                q += ((long) 1<<i);
            }
        }
        if(sign<0){
            q = -q;
        }
        if(q > Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        else if(q < Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        else{
            return (int) q;
        }
    }
}