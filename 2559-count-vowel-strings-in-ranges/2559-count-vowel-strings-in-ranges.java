class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int pref[] = new int[words.length];
        if(isVowel(words[0].charAt(0)) && isVowel(words[0].charAt(words[0].length()-1))){
            pref[0] = 1;
        }
        for(int i=1; i<words.length; i++){
            if(isVowel(words[i].charAt(0)) && isVowel(words[i].charAt(words[i].length()-1))){
                pref[i] = pref[i-1]+1;
            }
            else{
                pref[i] = pref[i-1];
            }
        }
        int ans[] = new int[queries.length];
        for(int i=0; i<queries.length; i++){
            int l = queries[i][0];
            int h = queries[i][1];
            if(l==0){
                ans[i] = pref[h];
            }
            else{
                ans[i] = pref[h]-pref[l-1];
            }
        }
        return ans;
    }
    public boolean isVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            return true;
        }
        return false;
    }
}