class Solution {
    public boolean hasSameDigits(String s) {
        int n = s.length();
        char temp[] = s.toCharArray();
        while(n>2){
            for(int i=1; i<n; i++){
                int x = temp[i]-'0';
                int y = temp[i-1]-'0';
                int diff = (x+y)%10;
                temp[i-1] = (char)(diff + '0');
            }
            n--;
        }
        return temp[0]==temp[1];
    }
}