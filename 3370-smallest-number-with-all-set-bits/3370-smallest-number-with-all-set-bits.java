class Solution {
    public int smallestNumber(int n) {
        int count = 0;
        while(n!=0){
            n /= 2;
            count++;
        }
        return (int)(Math.pow(2,count))-1;
    }
}