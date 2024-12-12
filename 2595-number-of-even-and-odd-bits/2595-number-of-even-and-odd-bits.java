class Solution {
    public int[] evenOddBit(int n) {
        int countEven = 0;
        int countOdd = 0;

        for(int i=0; i<32; i++){
            if(isSetBit(n, i)){
                if(i%2==0){
                    countEven++;
                }
                else{
                    countOdd++;
                }
            }
        }
        return new int[]{countEven, countOdd};
    }
    public boolean isSetBit(int n, int i){
        return (n & (1<<i)) != 0;
    }
}