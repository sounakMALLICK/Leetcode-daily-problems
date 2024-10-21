class Solution {
    public String replaceDigits(String s) {
        String ans = "";
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch>='0' && ch<='9'){
                ans += (char)((s.charAt(i-1))+(ch-'0'));
            }
            else{
                ans += ch;
            }
        }
        return ans;
    }
}