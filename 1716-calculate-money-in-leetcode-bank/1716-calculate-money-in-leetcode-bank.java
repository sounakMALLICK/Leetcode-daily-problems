class Solution {
    public int totalMoney(int n) {
        int sum = 0;
        int k = 1;
        while(n>0){
            int m = k;
            for(int i=1; i<=7; i++){
                if(n>0){
                    sum += m;
                    m++;
                    n--;
                }
            }
            k++;
        }
        return sum;
    }
}