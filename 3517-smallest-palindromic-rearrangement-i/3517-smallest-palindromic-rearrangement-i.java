class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        if(n<=2){
            return s;
        }
        int freq[] = new int[26];
        for(int i=0; i<n; i++){
            freq[s.charAt(i)-'a']++;
        }
        char ans[] = new char[n];
        int l=0, r=n-1;
        for(int i=0; i<26; i++){
            if(freq[i]>0){
                while(freq[i]>=2){
                    ans[l] = ans[r] = (char)(i+'a');
                    l++;
                    r--;
                    freq[i] -= 2;
                }
            }
        }
        if(n%2!=0){
            ans[n/2] = s.charAt(n/2);
        }
        return new String(ans);
    }
}