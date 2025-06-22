class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n = s.length();
        int m = (int) Math.ceil((double)n/k);
        String ans[] = new String[m];
        int i = 0, j = 0;
        while(i<n){
            if(i+k<n){
                ans[j++] = s.substring(i, i+k);
                i += k;
            }
            else{
                StringBuilder sb = new StringBuilder(s.substring(i,n));
                for(int z=k-sb.length(); z>0; z--){
                    sb.append(fill);
                }
                ans[j] = sb.toString();
                break;
            }
        }
        return ans;
    }
}