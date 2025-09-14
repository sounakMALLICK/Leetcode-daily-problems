class Solution {
    public boolean isAnagram(String s, String t) {
        int arr[] = new int[26];
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            arr[ch-'a']++;
        }
        int brr[] = new int[26];
        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            brr[ch-'a']++;
        }
        for(int i=0; i<26; i++){
            if(arr[i]!=brr[i]){
                return false;
            }
        }
        return true;
    }
}