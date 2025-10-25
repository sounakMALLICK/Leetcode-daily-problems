class Solution {
    public boolean hasSameDigits(String s) {
        int n = s.length();
        char ch[] = s.toCharArray();
        while(n>2){
            for(int i=1; i<n; i++){
                int x = ch[i]-'0';
                int y = ch[i-1]-'0';
                int diff = (x+y)%10;
                ch[i-1] = (char)(diff + '0');
            }
            n--;
        }
        return ch[0]==ch[1];
    }
}