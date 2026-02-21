class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count = 0;
        for(int i=left; i<=right; i++){
            int x = countSetBits(i);
            if(x==2 || x==3 || x==5 || x==7 || x==11 || x==13 || x==17 || x==19){
                count++;
            }
        }
        return count;
    }
    public int countSetBits(int n) {
        int c=0;
        for(int i=0; i<32; i++){
            if((n & (1<<i)) != 0){
                c++;
            }
        }
        return c;
    }
}