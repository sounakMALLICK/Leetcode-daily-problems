class Solution {
    public int nextBeautifulNumber(int n) {
        if(n==0){
            return 1;
        }
        for(int i=n+1; i<=1224444; i++){
            if(isBeautiful(i)){
                return i;
            }
        }
        return -1;
    }
    public boolean isBeautiful(int n){
        int temp[] = new int[10];
        while(n>0){
            int dig = n%10;
            temp[dig]++;
            n /= 10;
        }
        if(temp[0]!=0){
            return false;
        }
        for(int i=1; i<=9; i++){
            if(temp[i]!=0 && temp[i]!=i){
                return false;
            }
        }
        return true;
    }
}