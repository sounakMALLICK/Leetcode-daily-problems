class Solution {
    public int lengthAfterTransformations(String s, int t) {
        int mod = 1000000007;
        int freq[] = new int[26];
        for(int i=0; i<s.length(); i++){
            freq[s.charAt(i)-'a']++;
        }
        for(int i=1; i<=t; i++){
            int arr[] = new int[26];
            arr[0] = freq[25];
            arr[1] = (freq[25]+freq[0])%mod;
            for(int j=2; j<26; j++){
                arr[j] = freq[j-1];
            }
            freq = arr;
        }
        int ans = 0;
        for(int i=0; i<=25; i++){
            ans = (ans+freq[i])%mod;
        }
        return ans;
    }
}